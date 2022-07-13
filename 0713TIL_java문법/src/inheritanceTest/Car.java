package inheritanceTest;

public class Car {
	String name;
	int price;
	String color;
	
	public Car() {
		System.out.println("Car 생성자 실행됨");
	}
	
	public Car(String name, int price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}



	public void go(int velocity) {
		System.out.println("앞으로 갑니다" + "시속 : " + velocity);
	}
	
	public void engineOn() {
		System.out.println("열쇠로 시동을 켰습니다");
	}
	
	public void show() {
		System.out.println("--차량정보--");
		System.out.println("차주: " + name+"님");
		System.out.println("가격: " + price+"원");
		System.out.println("색상 : " + color);
	}
}
