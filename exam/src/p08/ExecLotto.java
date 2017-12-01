package p08;

public class ExecLotto {

	public static void main(String[] args) {
		Lotto01 lt = new Lotto01(3,10);
		//lt.lottoMaxNum = 2; //private여서 안되여, 값은 나오지만 private 수정을 할 수 없음
		
		//로또 추첨
		lt.makeLottoNums();
		//추첨된 로또가 출력
		lt.printLottoNums();
		
		int[] nums = {1,2,3};
		
		//내가 입력한 로또번호를  Lotto 변수의 checkLottoNums에 대입
		lt.setCheckLottoNums(nums);
		
		//추첨된 로또 번호와 내가 입력한 로또번호를 비교하여
		//
		lt.printMatchLottoNums();
		
	}
}
