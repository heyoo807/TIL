package wrapperTest;

public class BoxingUnboxing {
	
	public static void main(String[] args) {
		//Boxing : �⺻�ڷ��� -> ����Ŭ����
		int i1 = 10;
		Integer wi = new Integer(i1);
		
		// Unboxing : ����Ŭ���� -> �⺻�ڷ���
		System.out.println(wi.intValue());
	}

}
