package game;

public class Cat extends Animal {

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int hp, int feed) {
		super(name, hp, feed);
		// TODO Auto-generated constructor stub
	}
	
	public void onlyCat() {
		System.out.println("³Ä¿Ë³Ä¿Ë");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
//		this.hp+= 2 annot instantiate the type Animal
		this.setHp(2);
		super.eat();
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("³Ä¿Ë");
		this.show();
	}
	
	
	
	
}
