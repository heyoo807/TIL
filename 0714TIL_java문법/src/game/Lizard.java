package game;

public class Lizard extends Animal{

	public Lizard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lizard(String name, int hp, int feed) {
		super(name, hp, feed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		this.setHp(4);
		this.setFeed(-3);
		super.eat();
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(".");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("µµµµ");
		this.show();
	}
	
	
}
