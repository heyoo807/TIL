package inheritanceTask;

public class Main {
	public static void main(String[] args) {
		
		Car momCar = new Car("������", 1000, "blue");
		SuperCar childCar = new SuperCar("�ڽ���", 500, "red");
		
		momCar.go();
		System.out.println();
		childCar.go();
		System.out.println();
		childCar.engineOn();
		
	}
}
