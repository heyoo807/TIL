package abstractTest;

public class Main {
	
	public static void main(String[] args) {
		Dog d = new Dog();
//		Animal a = new Animal(); cannot instantiate the type Animal
		// �߻�Ŭ������ �޸𸮻��� �̱����� ��� �޼ҵ尡 �����ϹǷ� ��üȭ �Ұ���
		Animal a = new Dog();
		// �߻�Ŭ������ ��üȭ�� �Ұ����ϹǷ� �ڽ�Ŭ������ ��ü�� �����ѵ� ��ĳ����
		d.eat();
		d.play();
		System.out.println();
		a.eat();
		a.play();
	}

}
