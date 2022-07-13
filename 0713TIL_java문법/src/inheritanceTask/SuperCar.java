package inheritanceTask;

public class SuperCar extends Car {

	public SuperCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuperCar(String name, int price, String color) {
		super(name, price, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		super.go();
		System.out.println("슈퍼카 go()메소드 오버라이딩");
	}
	
	
	
}
