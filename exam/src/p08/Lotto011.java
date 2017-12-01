package p08;

import java.util.Random;

public class Lotto011 {
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Random r = new Random();
//		System.out.println("시작");
//		for(int i=0; i<10000; i++) {
//			int rNum = r.nextInt(3);
//			if(rNum<0 || rNum>2) {
//				System.out.print(rNum);
//			}
//					
//		
//		}System.out.println("끝");
		
		int[] rNum = new int[6];
		int[] rNum2 = new int[7];
		int temp = 0;
		
		for(int i = 0; i<rNum.length; i++) {
			rNum[i] = r.nextInt(45)+1;
			for(int j = 0; j<i; j++) {
				if(rNum[i]==rNum[j]) {
//					rNum[i] = 0;
					i--;					
				}
				
			}		
			
		}
		for(int i = 0; i<rNum2.length; i++) {
			rNum2[i] = r.nextInt(45)+1;
			for(int j = 0; j<i; j++) {
				if(rNum2[i]==rNum2[j]) {
					rNum2[i] = 0;
					i--;					
				}
				
			}		
			
		}
				
		
		for(int i=0; i<rNum.length-1; i++) {
			for(int j=i+1; j<rNum.length; j++) {
				if(rNum[i]>rNum[j]) {
					temp = rNum[i];
					rNum[i] = rNum[j];
					rNum[j] = temp;
				}
			}
		}
		
		for(int i=0; i<rNum2.length-2; i++) {
			for(int j=i+1; j<rNum2.length-1; j++) {
				if(rNum2[i]>rNum2[j]) {
					temp = rNum2[i];
					rNum2[i] = rNum2[j];
					rNum2[j] = temp;
				}
			}
		}
		
		
		
		for(int i= 0; i<rNum.length; i++) {
			System.out.print(rNum[i]);
			if(i!=rNum.length-1) {
				System.out.print(",");	
			}			
		}
		
		System.out.println("");
		for(int i= 0; i<rNum2.length; i++) {				
			if(i!=rNum2.length-1) {
				System.out.print(rNum2[i]);
				System.out.print(",");	
			}else {
				System.out.print(" 보너스 번호!!! ");
				System.out.print(rNum2[i]);
			}
		}
		
		int num = 0;
		
		
		for(int i = 0; i<rNum.length; i++) {
			for(int j =0; j<rNum2.length; j++) {
				if(rNum[i]==rNum2[j]) {
					++num;
				}				
			}
		}
		System.out.println("");
		System.out.println(num + "개가 맞췄어요 ㅎㅎ");
		
		
	}

}
