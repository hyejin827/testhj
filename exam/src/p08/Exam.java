package p08;

public class Exam {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 2, 3, 4 };

		int cnt = 0;
		/*for (int i = 0; i < nums1.length; i++) {
			int checkNum = nums1[0];
			for(int j=0;j<nums2.length;j++) {
			if (nums2[i] == checkNum) {
				cnt++;
				System.out.println(nums2[i] + "==" + checkNum + ":" + (nums2[i] == checkNum));
			}
			}
		}
		for (int i = 0; i < nums1.length; i++) {
			int checkNum = nums1[1];
			if (nums2[i] == checkNum) {
				cnt++;
				System.out.println(nums2[i] + "==" + checkNum + ":" + (nums2[i] == checkNum));
			}
		}
		for (int i = 0; i < nums1.length; i++) {
			int checkNum = nums1[2];
			if (nums2[i] == checkNum) {
				cnt++;
				System.out.println(nums2[i] + "==" + checkNum + ":" + (nums2[i] == checkNum));
			}
		}*/
		
		for (int i = 0; i < nums1.length; i++) {
			int checkNum = nums1[i];
			for(int j=0;j<nums2.length;j++) {
				if (nums2[j] == checkNum) {
				cnt++;
				System.out.println(nums2[j] + "==" + checkNum + ":" + (nums2[j] == checkNum));
				}
			}
		}
		System.out.println("같은 갯수 : "+cnt);
	}
}
//위아래 같은 뜻의 코딩