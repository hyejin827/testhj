package p08;

import java.util.Random;

public class Lotto01 {
	private int[] lottoNums;
	private int lottoMaxNum;
	private int checkRandomNum;
	private int[] checkLottoNums;

	// 오버로딩의 조건
	// -함수명이 같아야함.
	// -파라매터가 달라야함. (수가 같더라도 데이터타입이 달라야함)
	public Lotto01() {
		// this.lottoNums = new int[6];
		// this.lottoMaxNum = 45;
		this(6); // this(6,45); -> this(6);
	}

	public Lotto01(int lottoNumsLength) {
		this(lottoNumsLength, 45);
	}

	public Lotto01(int lottoNumsLength, int lottoMaxNum) {
		this.lottoNums = new int[lottoNumsLength];
		this.lottoMaxNum = lottoMaxNum;
	}

	void setCheckLottoNums(int[] checkLottoNums) {
		this.checkLottoNums = checkLottoNums;
	}

	void printMatchLottoNums() {

	}

	void makeLottoNums() {
		Random r = new Random();
		for (int i = 0; i < lottoNums.length; i++) {
			checkRandomNum = r.nextInt(lottoMaxNum) + 1;
			if (isDupl()) {
				i--; // continue;를 쓰면 else 안써도됨.
			} else {
				lottoNums[i] = checkRandomNum;
			}

		}
	}

	private boolean isDupl() {
		for (int i = 0; i < lottoNums.length; i++) {
			if (lottoNums[i] == checkRandomNum) {
				return true;
			}
		}
		return false;
	}

	void printLottoNums() {
		for (int i = 0; i < lottoNums.length; i++) {
			System.out.print(lottoNums[i] + ",");
		}
	}

	public static void main(String[] args) {
		// Lotto01 lt = new Lotto01(5, 50);
		Lotto01 lt = new Lotto01(); // 위에꺼랑 이거랑 다른거임
		lt.makeLottoNums();
		lt.printLottoNums();

	}
}
