package p16;

import java.util.ArrayList;
import java.util.Scanner;

import com.google.common.collect.Lists;

public class Exam01 {
	// 총 5명의 학생의 점수를 스캐너 nextLine() 함수를 사용하여 입력받고
	// 총점과 평균을 구하고 점수가 낮은 순서대로 출력해주세요
	// 입력순서가 50점,60점,30점,70점,100점이였다면
	// 30,50,60,70,100 <--점수가 낮은 순서대로 출력
	ArrayList<Integer> al;
	
	ArrayList<Integer> init() {
		Scanner s = new Scanner(System.in);
		System.out.println("학생들의 점수를 ,기준으로 입력해주세요.");
		String str = s.nextLine();
		String[] strs = str.split(",");
		al = new ArrayList<Integer>();
		for(String st : strs) {
			al.add(Integer.parseInt(st));
		}
		return al;
	}
	
//	ArrayList<Integer> print(){
//		for(int i=0;i<al.size();i++) {
//			for(int j=1;j<al.size();j++) {
//				if(al.get(i)<al.get(j)) {
//					
//				}
//			}
//		}
//		return al;
//	}

	public static void main(String[] args) {
		Integer[] nums = { 1, 2, 3, 4, 5 };
		ArrayList<Integer> numList = Lists.newArrayList(nums);
		Exam e = new Exam();
	}

}
