package p14;

import java.util.ArrayList;

public class MapExam {

	private ArrayList<String> alKey;
	private ArrayList<String> alValue;
	
	public MapExam() { //private이기 때문에 생성자 만듬
		alKey =  new ArrayList<String>();
		alValue =  new ArrayList<String>();
	}
	
	public void put(String key, String value) {
		int idx = alKey.indexOf(key);
		if(idx==-1) {
			alKey.add(key);
			alValue.add(value);
		}else {
			alValue.set(idx, value);
		}
	}
	
	public int size() {
		return alKey.size();
	}
	
	public boolean remove(String key) {
		int idx = alKey.indexOf(key);
		if(idx==-1) {
			return false;
		}else {
			alKey.remove(idx);
			alValue.remove(idx);
		}
		return true;
	}
	
	public String get(String key) { //정해져있지않은 데이터타입에는 return값 뒤에 꼭 있어야됨.
		int idx = alKey.indexOf(key); //lastIndexOf:뒤부터 찾기
		if(idx==-1) {
			return null;
		}
		return alValue.get(idx);
	}
	
	@Override //이걸로 오버라이딩 됐는지 확인가능
	public String toString() {
		String str = "{";
		for(int i=0;i<alKey.size();i++) {
			str += alKey.get(i) + "=" + alValue.get(i) + ",";
		}
		str += "}";
		return str;
	}
}
