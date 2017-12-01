package p07;

public class Exam02 {
/* 총 107리터의 물이 있습니다.
 * 5리터의 물통과, 3리터의 물통, 2리터의 물통을 가지고 있을때
 * 총 몇개의 물통이 있어야 107리터를 담을 수 있는지를
 * 계산하는 프로그램을 작성해주세요
 * 단 물통의 갯수는 최소여야 합니다.
 */
	public static void main(String[] args) {
		int count1=0;
		int count2=0;
		int count3=0;
		for(int i=1;i<=107;i++) {
			if(i%5==0) {
				count1++;
			}
		}
		for(int i=1;i<=(107-5*count1);i++) {
			if(i%3==0) {
				count2++;
			}
		}
		for(int i=1;i<=(107-5*count1-3*count2);i++) {
			if(i%2==0) {
				count3++;
			}
		}
		System.out.println("5리터의 물통갯수: "+count1);
		System.out.println("3리터의 물통갯수: "+count2);
		System.out.println("2리터의 물통갯수: "+count3);
	}
}
