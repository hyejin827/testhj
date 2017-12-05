package p11;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
	int totalRand;
	int join;
	int win;
	int[] arrJoin;
	int[] arrWin;
	Scanner s = new Scanner(System.in);
	Random r = new Random();

	void setCnt() {
		System.out.println("참여인원 수를 정해주세요");
		join = s.nextInt();
		System.out.println("당첨인원 수를 정해주세요");
		win = s.nextInt();
		totalRand = join * 2;
	}

	void getJoinCnt() {
		arrJoin = new int[join];

//		for (int i = 0; i < arrJoin.length; i++) {
//			boolean dupl = false;
//			arrJoin[i] = r.nextInt(totalRand) + 1;
//			for (int j = 0; j < i; j++) {
//				if (arrJoin[i] == arrJoin[j]) {
//					i--;
//					dupl = true;
//				}
//			}
//			if (!dupl)
//				System.out.println(arrJoin[i] + "가 참여인원입니다.");
//		}

		for (int i = 0; i < arrJoin.length; i++) {
			arrJoin[i] = r.nextInt(totalRand) + 1;
			for (int j = 0; j < i; j++) {
				if (arrJoin[i] == arrJoin[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < arrJoin.length; i++) {
			System.out.println(arrJoin[i] + "번이 참여인원입니다.");
		}
	}

	void getWinCnt() {
		arrWin = new int[win];

		for (int i = 0; i < arrWin.length; i++) {
			arrWin[i] = r.nextInt(totalRand) + 1;
			if (arrWin[i] != arrJoin[i]) {
				i--;
			}
			for (int j = 0; j < i; j++) {
				if (arrWin[i] == arrWin[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < arrWin.length; i++) {
			System.out.println("우왕!!!!" + arrWin[i] + "번 사람이 당첨이에여!");
		}
	}

	public static void main(String[] args) {
		Quiz q = new Quiz();
		q.setCnt();
		q.getJoinCnt();
		q.getWinCnt();
	}
}
