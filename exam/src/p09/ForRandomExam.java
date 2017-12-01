package p09;

import java.util.Random;
//3x3개의 방갯수를 가진 2차원 인트형 배열변수를 선언해주세요.
//각 방에 랜덤한 숫자를 넣고
//랜덤한 숫자의 미니멈값은 1, 맥시멈값은 20
//0번째층의 0번째 방부터 큰수가 들어갈 수 있도록 프로그램을 만들어서 출력 (숫자 중복없이)

public class ForRandomExam {
	int[][] nums = new int[3][3];
	Random r = new Random();
	
	void inputNums() {
		
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				nums[i][j]=r.nextInt(20)+1;
			}
		}
	}
	
	void checkNums() {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				for(int k=0;k<j;k++) {
					if(nums[i][j]==nums[i][k]) {
						
					}
				}
			}
		}
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.print(nums[i][j]+",");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ForRandomExam fre = new ForRandomExam();
		fre.inputNums();
		fre.checkNums();
	}
}
