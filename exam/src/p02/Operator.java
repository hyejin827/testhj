package p02;

public class Operator {
	public static void main(String[] args) {
		/*int a = 4;
		a = a+1;
		a++;
		++a;
		a+=1;
		
		int b = 2; // =:대입연산자 ==,!=,<,>,<=,>=:비교연산자
		b= b-1;
		b--; // ++,--:증감연산자
		--b;
		b-=2; //+=,-=:복합연산자
*/		
		int a = 3;
		int b = a;
		/*int c = b;
		boolean b1 = a==b;
		System.out.println(b1);
		System.out.println(a==b);
		
		if(a==b) {
			System.out.println("a와 b는 같습니다.");
		}
		if(b1) {
			System.out.println("a와 b는 같습니다.");
		}
		
		for(int i=0;i<10;i++) {
			if(a==b) {
				System.out.println((i+1)+".a와 b는 같습니다.");
				//i--; //무한루프걸림
			}
		}
		for(int i=10;i>0;i--) {
			if(a==b) {
				System.out.println((i)+".a와 b는 같습니다.");
			}
		}
		for(int i=1;i<10;i++) {
			if(i%2==0) { //짝수일때
					System.out.println((i)+".a와 b는 같습니다.");	
			}
		}
		for(int i=10;i>0;i--) {
			if(i%2==1) { //홀수일때
					System.out.println((i)+".a와 b는 같습니다.");	
			}
		}*/
		
		//System.out.println(a>b);
		//System.out.println(a<=b);
		//System.out.println(a>=b);
		//System.out.println(a<b);
		//System.out.println(a!=b);
		
		//System.out.println(a+b);
		//System.out.println(a-b);
		//System.out.println(a*b);
		//System.out.println(a/b);
		//System.out.println(a%b);
		
		int len = 7;
		String[] strArr = new String[len];
		//strArr는 7개의 방을 가지고 있음
		//strArr[0]="10"부터 strArr[6]="70"까지 들어갈수 있는 for문 만들기
		for(int i=0;i<strArr.length;i++) {
			strArr[i] = (i+1)+"0";
			System.out.println("strArr["+i+"]="+strArr[i]);
		}
		
		for(int i=strArr.length-1;i>-1;i--) {
			System.out.println("strArr["+i+"]="+strArr[i]);
		}
		
		//1~100까지 5의배수만 출력
		for(int i=5;i<=100;i+=5) {
			System.out.println(i);
		}
		//거꾸로
		for(int i=100;i>=1;i-=5) {
			System.out.println(i);
		}
		//1~100까지 10의배수만 출력
		for(int i=10;i<101;i+=10) {
			System.out.println(i);
		}
		//거꾸로
		for(int i=100;i>9;i-=10) {
			System.out.println(i);
		}
		//5,15,25,35... 출력
		for(int i=5;i<=100;i+=10) {
			System.out.println(i);
		}
		//거꾸로
		for(int i=95;i>=1;i-=10) {
			System.out.println(i);
		}
		
	}

}
