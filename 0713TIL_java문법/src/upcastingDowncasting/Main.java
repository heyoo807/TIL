package upcastingDowncasting;

public class Main {
	
	public static void test(Parent c) {
		
	}
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child  c = new Child();
		Child2 c2 = new Child2();
		
		Object[] ar = {"�ȳ�", p, c, c2};
		
		Main.test(c); // ��ĳ����
		Main.test(c2); // ��ĳ����
		
		//Ÿ��Ȯ�θ޼ҵ�
		//�ν��Ͻ� instanceof Ŭ���� : �ν��Ͻ��� Ŭ����Ÿ���̴� ? ������ true, �ƴϸ� false
		
		System.out.println("java�� ��� ��ü���� �ֻ���Ŭ���� ObjectŬ������ Ÿ���̴� ?");
		System.out.println(p instanceof Object);
		System.out.println(c instanceof Object);
		System.out.println(c2 instanceof Object);
		 
		System.out.println("**�θ�Ŭ������ �ڽ�Ŭ���� Ÿ���̴� ?**");
		System.out.println(p instanceof Child); // �θ�Ŭ������ �ڽ�Ŭ����Ÿ�� �̴� ?  // false
		System.out.println(p instanceof Child2); // �θ�Ŭ������ �ڽ�Ŭ����Ÿ���̴� ?  // false
		
		System.out.println("**�ڽ�Ŭ������ �θ�Ŭ���� Ÿ���̴� ? **");
		System.out.println(c instanceof Parent); //true
		System.out.println(c2 instanceof Parent); //true
		
		System.out.println("��ĳ���õ� �ڽ�Ŭ������ü�� �θ�Ŭ����Ÿ���̴�, �ڽ�Ŭ����Ÿ���̴� ? "); //�θ�Ÿ�� o, �ڽ� Ÿ�� o
		Parent up = c;
		Parent up2 = c2;
		System.out.println(up instanceof Parent); //true
		System.out.println(up instanceof Child); //true
		
		System.out.println(up2 instanceof Parent); //true
		System.out.println(up2 instanceof Child2); //true
		
		System.out.println(up2 instanceof Child); //false // ����� �θ� ��ӹ��� �ڽĳ����� Ÿ���� �������� ����
		
		
		
		
		
	}
}
