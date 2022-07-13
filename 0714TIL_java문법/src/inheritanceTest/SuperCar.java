package inheritanceTest;

public class SuperCar extends Car{
	
	String mode;
	// 자식 클래스에서 새로운 멤버들(멤버 변수, 메소드)이 필요하면 써준다

	public SuperCar() {}


	public SuperCar(String name, int price, String color, String mode) {
		super(name, price, color);
		// TODO Auto-generated constructor stub
		this.mode = mode;
	}
	
	public void openRoof() {
		System.out.println("지붕을 열었습니다");
	}


	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("모드 : " + this.mode);
	}


	
	
	
	
	
}
