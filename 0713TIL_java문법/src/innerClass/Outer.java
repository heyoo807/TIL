package innerClass;

public class Outer {
	
	int ov = 10;
	static int osv = 100;
	
	//���� �ν��Ͻ� Ŭ����
	class InnerInstance{
		int iiv = 20;
		
		public void innerInstanceFunction() {
			System.out.println("�ν��Ͻ� Ŭ���� �޼ҵ� ȣ���");
		}
	}
	
	//���� ����ƽ Ŭ����
	static class InnerStatic{
		int isv = 30;
		
		public void innerStaticFunction() {
			System.out.println("����ƽŬ���� �޼ҵ� ȣ���");
		}
	}
	
	public void show() { // OuterŬ������ �޼ҵ� �ȿ��� ���� �ν��Ͻ� Ŭ����, ���� ����ƽŬ������ ��ü ���� �� ��� ���
		InnerInstance ii = new InnerInstance();
		System.out.println(ii.iiv);
		ii.innerInstanceFunction();
		
		InnerStatic is = new InnerStatic();
		System.out.println(is.isv);
		is.innerStaticFunction();
	}
	
	public void outerFunction() {
		// � Ŭ������ ���� Ư�� Ŭ������ Ư�� �޼ҵ� �ȿ����� ���� ��
		// ����Ŭ������ ���� ������ ���
		
		class InnerLocal{ // ����Ŭ����
			int ilv = 40;
			
			public void innerLocalFunction() {
				System.out.println("����Ŭ���� �޼ҵ� ȣ���");
			}
			
		}
		
		InnerLocal il = new InnerLocal();
		
		System.out.println(il.ilv);
		il.innerLocalFunction();
		
		
		
		
	}

}
