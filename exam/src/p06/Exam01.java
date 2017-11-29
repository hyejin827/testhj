package p06;

public class Exam01 {
		//구구단 역순
		//가로로 진행될때마다 ,찍고 가로가 끝났을때는 ,없이 엔터값 출력
		//i와 j가 곱한 값이 3의 배수일때는 '3의배수' 문자열 출력
	public static void main(String[] args) { //ctrl+shift+f : 정렬
		for(int i=9;i>0;i--) {
			for(int j=9;j>0;j--) {
				if(j!=1) {
					System.out.print(i+"X"+j+"= "+i*j+", ");
				}else {
					System.out.println(i+"X"+j+"= "+i*j);
				}
				if(i*j%3==0) {
					System.out.print("3의배수, ");
				}
			}
		}
	}
}
