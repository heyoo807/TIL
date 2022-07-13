package objectTest;

public class Main {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		System.out.println(i1 == i2); //false 
		System.out.println(i1.equals(i2)); //true
		System.out.println(i1.toString()); // 10
		
		Car c1 = new Car(1234);
		Car c2 = new Car(1234);
		System.out.println(c1 == c2); //false
		
		System.out.println(c1.equals(c2)); //CarŬ�������� equals()�޼ҵ� �������̵� x-> false����
		System.out.println(c1.equals(c2)); //CarŬ�������� equals()�޼ҵ� �������̵� o-> true����
		System.out.println(c1.toString()); //CarŬ�������� toString()�޼ҵ� �������̵� x->objectTest.Car@7852e922
		System.out.println(c1.toString()); //CarŬ�������� toString()�޼ҵ� �������̵� o ->�ڵ��� ��ȣ�� : 1234
		System.out.println(c2); // 1234
		// ��ü�� println�ȿ� ���̸� toString()�޼ҵ尡 ������ ����
		// ���� toString()�� �������̵��ϸ� ����� �� ����� ������ �� �ִ�
		
		System.out.println(c1.hashCode()); //CarŬ�������� hashCode()�޼ҵ� �������̵� x->2018699554
	
		System.out.println(c1.hashCode());//CarŬ�������� hashCode()�޼ҵ� �������̵� o->1234
		
		
		
	}
}
