package p14;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	// 로또번호를 입력하고 랜덤하게 로또를 만들고
	// 자동,수동 반자동이 선택가능하게 만들어야함
	// 로또가 끝난이후 맞춘 개수를 출력

	Scanner s = new Scanner(System.in);
	Random r = new Random();
	int[] lottoNum = new int[6];
	String str;

	void setLotto() {
		System.out.println("자동, 수동, 반자동을 정해주세요");
		str = s.next();
	}

	void auto() {
		if (str.equals("자동")) {
			for (int i = 0; i < lottoNum.length; i++) {
				lottoNum[i] = r.nextInt(45) + 1;
				for (int j = 0; j < i; j++) {
					if (lottoNum[i] == lottoNum[j]) {
						i--;
					}
				}
			}

			for (int i = 0; i < lottoNum.length; i++) {
				System.out.print((lottoNum[i] + 1) + ",");
			}
		}
	}

	void nonAuto() {
		if (str.equals("수동")) {
			for (int i = 0; i < lottoNum.length; i++) {
				System.out.println((i + 1) + "번째 숫자를 입력해주세요");
				lottoNum[i] = s.nextInt();
			}

			System.out.print("입력하신 숫자는 ");
			for (int i = 0; i < lottoNum.length; i++) {
				if (i != 5) {
					System.out.print(lottoNum[i] + ",");
				} else {
					System.out.print(lottoNum[i]);
				}
			}
			System.out.println("번입니다.");
		}
	}
	void semiAuto() {
		if(str.equals("반자동")) {
			System.out.println("수동으로 입력할 숫자를 적어주세요");
			int num = r.nextInt(6)+1;
			
		}
	}

	public static void main(String[] args) {
		Lotto lt = new Lotto();
		lt.setLotto();
		lt.auto();
		lt.nonAuto();
	}
}
