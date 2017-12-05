package p11;

import java.util.ArrayList;
import java.util.Random;

public class ListExam03 {
	// Integer 클래스만 넣을 수 있는 ArrayList alInt를 선언해주세요
	// 최솟값 1부터 최댓값 100까지 나오는 랜덤함수의 값을
	// 반복문 0부터 20까지 돌면서 alInt에 추가해주세요
	// alInt가 가지고 있는 모든 값을 더한 토탈값을 출력해주세요
	public static void main(String[] args) {
		ArrayList<Integer> alInt = new ArrayList<Integer>();
//		ArrayList<ArrayList<Integer>> alInt = new ArrayList<ArrayList<Integer>>(); ->이차원 배열이라고 생각하면됨.
		Random r = new Random();
		int sum = 0;

		for (int i = 0; i < 20; i++) {
			int n = r.nextInt(100) + 1;
			if (alInt.indexOf(n) == -1) {
				alInt.add(n);
			} else {
				i--;
			}
		}
		
//		for(int i = 0; i < 20; i++) {
//			alInt.add(new Random().nextInt(100)+1); -> 랜덤 함수 초기화를 여기서 해도됨.
//		}

		System.out.print("랜덤 수는 : ");
		for (Integer i : alInt) {
			sum += i;
			System.out.print(i + ",");
		}
		System.out.println();

		System.out.println("랜덤 수를 합한 값은 : " + sum);
	}
}
// list는 index값 /map은 key,value 값만 알면 됨.(?)