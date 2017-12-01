package p07;

import java.util.Scanner;

public class Exam031 {
	int[] nums;
	int tmp = 0;
	String arr;
	Scanner s = new Scanner(System.in);

	void inputNums() {

		nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			System.out.println((i + 1) + "번째 숫자");
			nums[i] = s.nextInt();
		}
	}

	boolean checkNums() {
		System.out.println("오름차순? 내림차순?");
		arr = s.next();
		if (arr.equals("내림차순")) {
			for (int i = 0; i < nums.length; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[i] < nums[j]) {
						tmp = nums[i];
						nums[i] = nums[j];
						nums[j] = tmp;
					}
				}
			}
		} else if (arr.equals("오름차순")) {
			for (int i = 0; i < nums.length; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[i] > nums[j]) {
						tmp = nums[i];
						nums[i] = nums[j];
						nums[j] = tmp;
					}
				}
			}
		} else {
			System.out.println("잘못쳤어여");
			return false;
		}
		return true;

	}

	void printNums() {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	public static void main(String[] args) {
		Exam031 ex = new Exam031();
		ex.inputNums();
		if(ex.checkNums()) {
			ex.printNums();
		}
	}
}
