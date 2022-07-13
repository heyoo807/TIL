package abstractTest;

public class Dog extends Animal {

	public void eat() {
		System.out.println("멍멍");
	}
	
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("자식에서 재정의된 play()");
		
	}
	
	

}
