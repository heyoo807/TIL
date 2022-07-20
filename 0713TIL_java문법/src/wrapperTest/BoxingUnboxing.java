package wrapperTest;

public class BoxingUnboxing {
	
	public static void main(String[] args) {
		//Boxing : 기본자료형 -> 래퍼클래스
		int i1 = 10;
		Integer wi = new Integer(i1);
		
		// Unboxing : 래퍼클래스 -> 기본자료형
		System.out.println(wi.intValue());
	}

}
