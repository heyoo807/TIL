package anonyTest;

public class Main {
	public static void main(String[] args) {
		
		Soldier s = new Soldier() {
			
			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("�̵�� ���Ѵ�");
			}
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("�̵�� �Դ´�");
			}
			
			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				System.out.println("�̵�� ���ܴ�");
			}
			
		};
		s.eat();
		
		Car c = new Car() {

			public void openRoof() {
				System.out.println("������ �������ϴ�");
			}

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("override�� show");
			}
			
		};
		
		c.go();
		c.show();
//		c.openRoof(); 
// �ڽĿ��� ���Ӱ� ���� �޼ҵ�� ��ĳ���õǸ� ����� �Ұ����ϴ�
	}
}
