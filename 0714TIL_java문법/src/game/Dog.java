package game;

public class Dog extends Animal{

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int hp, int feed) {
		super(name, hp, feed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		this.setHp(2);
		super.walk();
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("¸Û¸Û");
		this.show();
	}
	
	

	
}
