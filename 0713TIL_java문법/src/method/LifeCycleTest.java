package method;

public class LifeCycleTest {
	
	public static int changeA() {
		int b = 1100;
		return 1000;
	}
	
	
	public static void main(String[] args) {
		int a = 100;
		
		a = LifeCycleTest.changeA();
		System.out.println(a);
//		System.out.println(b); // main�޼ҵ� �� changeA�޼ҵ� �ȿ� b�� ���������̹Ƿ� ���θ޼ҵ�ȿ��� �ʱ�ȭ �ؾ��� ���� x
		
		for(int i = 0; i <5; i++) {
			// �ش� for���ȿ����� i ��� ����
		}
		
		for(int i = 0; i < 4; i++) {
			// �ش� for�� �ȿ����� i ��� ����
		}
	}
}


	
