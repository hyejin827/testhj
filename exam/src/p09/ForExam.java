package p09;

public class ForExam {

	public static void main(String[] args) {
		int[][] nums = new int[3][];

		int[] a = new int[3];
		int[] b = new int[4];
		nums[0] = a;
		nums[1] = b;
		nums[2] = new int[5];

		for (int i = 0; i < 3; i++) {
			nums[0][i] = (i + 1); // nums[0]:인트형 배열, nums[0][i]:얘는 인트에여
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(nums[0][i]);
		}
		// 1,2,3/1,2,3,4/1,2,3,4,5로 출력
		/*for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = j + 1;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+",");
			}
			System.out.println();
		}
		// 1,2,3/4,5,6,7/8,9,10,11,12로 출력 ver1
		int cnt = 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = cnt++; //처음엔 2가 아니라 1로 출력됨.
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			int[] num = nums[i];
			for (int j = 0; j < num.length; j++) {
				System.out.print(num[j]+",");
			}
			System.out.println();
		}*/
		
		// 1,2,3/4,5,6,7/8,9,10,11,12로 출력 ver2
		int addNum = 1;
		for(int i=0;i<nums.length;i++) { //각 층을 더한뒤에 값을 집어넣음
			if(i!=0) { //i가 0일땐 돌면 안됨. -1층 없으니까
				addNum += nums[i-1].length;
			}
			for(int j=0;j<nums[i].length;j++) {
				nums[i][j] = j+addNum;
			}
		}
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.print(nums[i][j]+",");
			}
			System.out.println();
		}
		
		// 1,2,3/4,5,6,7/8,9,10,11,12로 출력 ver3 
		//각 층의 마지막 값을 더하는거
		for(int i=0;i<nums.length;i++) {
			
		}
	}
}
