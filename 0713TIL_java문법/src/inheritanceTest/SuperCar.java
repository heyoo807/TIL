package inheritanceTest;

public class SuperCar extends Car{
	
	String mode;
	// �ڽ� Ŭ�������� ���ο� �����(��� ����, �޼ҵ�)�� �ʿ��ϸ� ���ش�

	public SuperCar() {}


	public SuperCar(String name, int price, String color, String mode) {
		super(name, price, color);
		// TODO Auto-generated constructor stub
		this.mode = mode;
	}
	
	public void openRoof() {
		System.out.println("������ �������ϴ�");
	}


	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("��� : " + this.mode);
	}


	
	
	
	
	
}
