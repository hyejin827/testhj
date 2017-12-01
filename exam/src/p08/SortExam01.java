package p08;

public class SortExam01 { //중복값이 생기면 숫자를 바꾸기(앞에 숫자와도 비교를 해야됨)
	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3, 4 };
		int cnt = 0;

		for (int j = 0; j < nums.length; j++) {
			for (int i = j + 1; i < nums.length; i++) { // 앞이랑은 다시 비교할 필요가 없음
				if (nums[j] == nums[i]) {
					cnt++;
					System.out.println("중복!!!");
				}
			}
		}
		System.out.println(cnt);
	}
}
