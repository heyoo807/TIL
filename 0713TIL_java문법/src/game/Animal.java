package game;

public class Animal {
	private String name;
	private int hp;
	private int feed;
	
	public Animal() {}

	public Animal(String name, int hp, int feed) {
		this.name = name;
		this.hp = hp;
		this.feed = feed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getFeed() {
		return feed;
	}

	public void setFeed(int feed) {
		this.feed = feed;
	}
	
	public void show() {
		System.out.println(this.name + "의 체력 : " + this.hp);
		System.out.println(this.name + "의 먹이 : " + this.feed);
	}
	
	public void eat() {
		this.hp++;
		this.feed--;
	}
	
	public void walk() {
		this.hp--;
		this.feed++;
	}
	
	public void play() {
		this.hp += 20;
		this.feed += 20;
		this.show();
	}
	
	public void sleep() {};
	
}
	
