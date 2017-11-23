package p02;

public class ArrayExam {
	public static void main(String[] args) {
		int a1 = 1;
		int a2 = 2;
		int a3 = 3;
		int a4 = 4;
		int a5 = 5;
		int[] arr = {1,2,3,4,5};
		int[] arr2 = new int[5]; //몇개를 만들지 모르기때문에 new를 씀
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		arr2[4] = 5;
		//System.out.println(arr2.length);
		//arr2[5] = 6; //실행전까지 에러인지 모름 runtime exception
		
		String[] strArr = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.println(strArr[0]);
		
		for(int i=0; i<7; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println(strArr.length);
	}
}
