package p08;

import java.util.Random;

public class Lotto012 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] lottoNum = new int[6];
		
		for(int i=0;i<lottoNum.length;i++) {
			lottoNum[i]=r.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(lottoNum[i]==lottoNum[j]) {
					i--;
				}
			}
//			System.out.println(lottoNum[i]);
		}
		
		for(int i=0;i<lottoNum.length;i++) {
			for(int j=i+1;j<lottoNum.length;j++) {
				if(lottoNum[i]>lottoNum[j]) {
					int tmp=0;
					tmp=lottoNum[i];
					lottoNum[i]=lottoNum[j];
					lottoNum[j]=tmp;
				}
			}
			System.out.println(lottoNum[i]);
		}
	}
}
