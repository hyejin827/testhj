package p08;

import java.util.Random;

public class Lotto {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println("TEST 시작");
		for(int i=0;i<10000;i++) {
			int rNum=r.nextInt(3);
			if(rNum<0 || rNum>2) {
				System.out.println(rNum);
			}
		}
		System.out.println("TEST 종료");
	}
}
