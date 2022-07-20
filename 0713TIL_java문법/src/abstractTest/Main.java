package abstractTest;

public class Main {
	
	public static void main(String[] args) {
		Dog d = new Dog();
//		Animal a = new Animal(); cannot instantiate the type Animal
		// 추상클래스는 메모리상의 미구현된 멤버 메소드가 존재하므로 객체화 불가능
		Animal a = new Dog();
		// 추상클래스는 객체화가 불가능하므로 자식클래스로 객체를 생성한뒤 업캐스팅
		d.eat();
		d.play();
		System.out.println();
		a.eat();
		a.play();
	}

}
