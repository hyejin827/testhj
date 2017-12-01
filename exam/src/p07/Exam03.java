package p07;

public class Exam03 {
	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 3;
		nums[1] = 6;
		nums[2] = 2;
		nums[3] = 7;
		nums[4] = 9;
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					int tmp=0;
					tmp=nums[i];
					nums[i]=nums[j];
					nums[j]=tmp;
				}
			}
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
