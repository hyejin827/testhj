package p11;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	int lottoCnt = 0;
	int joinCnt = 0;

	Lotto() {
		Scanner s = new Scanner(System.in);
		System.out.println("참여인원을 입력해주세요");
		joinCnt = s.nextInt();
		System.out.println("당첨인원을 입력해주세요");
		lottoCnt = s.nextInt();
		s.close();
	}

	// 당첨인원에 대한 배열변수를 받는거
	int[] getLottos() {
		return new int[lottoCnt]; // 생성하자마자 리턴하겠다는 뜻
	}

	// 참여인원에 대한 배열변수를 받는거
	int[] getJoins() {
		return new int[joinCnt]; // 몰게떠
	}

	void setLottos(int[] lottos) {
		Random r = new Random();
		for (int i = 0; i < lottos.length; i++) {
			int n = r.nextInt(joinCnt) + 1;
			lottos[i] = n;
			if (isDupl(lottos, n, i)) { // 모름
				i--;
			}
		}
	}

	boolean isDupl(int[] lottos, int num, int maxNum) { // 몰게떠
		for (int i = 0; i < maxNum; i++) {
			if (lottos[i] == num) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Lotto l = new Lotto();
		int[] lottos = l.getLottos();
		int[] joins = l.getJoins();
		System.out.println("당첨인원 : " + l.lottoCnt);
		System.out.println("비당청인원 : " + (l.joinCnt - l.lottoCnt));
		l.setLottos(lottos);
		System.out.print("당첨된 사람 번호 : ");
		for (int i = 0; i < joins.length; i++) { // 모름
			for (int j = 0; j < lottos.length; j++) {
				if ((i + 1) == lottos[j]) {
					System.out.print((i + 1) + ",");
				}
			}
		}
	}
}
