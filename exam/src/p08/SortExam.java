package p08;

public class SortExam {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3, 3, 4 };
		int cnt = 0;
		String duplStr = "";

		for (int j = 0; j < nums.length; j++) {
			for (int i = j + 1; i < nums.length; i++) { // 앞이랑은 다시 비교할 필요가 없음
				if (nums[j] == nums[i]) {
					cnt++;
					duplStr += nums[i] + ",";
					System.out.println("중복!!!");
				}
			}
		}
		System.out.println("중복 갯수는 : " + cnt);
		System.out.println("중복 숫자는 : " + duplStr.substring(0, duplStr.length()-1)); //글자 뒤에 지워줌
	}
}
