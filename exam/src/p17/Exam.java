package p17;

import java.util.ArrayList;
import java.util.Scanner;

import com.google.common.collect.Lists;

public class Exam {
	Integer[] nums;
	int sum;
	double avg;

	void nums() {
		Scanner s = new Scanner(System.in);
		nums = new Integer[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번째 학생의 점수를 입력해 주세요.");
			nums[i] = Integer.parseInt(s.nextLine());
			sum += nums[i];
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}
		
		System.out.println("총점은 " + sum + "점 입니다.");
		avg = (sum/5.0);
		System.out.println("평균은 " + avg + "점 입니다.");
		System.out.print("오름차순 : ");
		
		ArrayList<Integer> numList = Lists.newArrayList(nums);
		System.out.println(numList);
		
		s.close();
	}

	public static void main(String[] args) {
		Exam e = new Exam();
		e.nums();
	}
}
