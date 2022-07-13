package abstractTest;

public abstract class Animal {
	String name;
	
	public void eat() {
		System.out.println("부모에서 정의된 eat()");
	}
	
	public abstract void play(); // abstract method > 메소드의 이름과 리턴타입만 선언되어있음 // 기능은 정의 x
}
