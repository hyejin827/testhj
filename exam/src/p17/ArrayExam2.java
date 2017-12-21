package p17;

import java.util.ArrayList;

public class ArrayExam2 {
	public static void main(String[] args) {
	 	ArrayExam ae = new ArrayExam();
	 	ArrayList al =     ae.getArrayList(1, 1);              
	    for(int i=0;i<10;i++){
	 	   ae.getArrayList(1, 1).add(i);
	    }
	    System.out.println(al);
	 }
}
