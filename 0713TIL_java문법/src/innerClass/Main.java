package innerClass;

public class Main {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.outerFunction();
		
		//InnerInstance��üȭ
		//�ν��Ͻ� Ŭ������ �ܺ�Ŭ������ü.�ϰ� ���
		
		Outer.InnerInstance ii = o.new InnerInstance();
		System.out.println(ii.iiv);
		ii.innerInstanceFunction();
		
		//InnerStatic ��üȭ
		//����ƽŬ������ �ܺ�Ŭ������.�ϰ� ����� �Ѵ�
		
		Outer.InnerStatic is = new Outer.InnerStatic();
		System.out.println(is.isv);
		is.innerStaticFunction();
	}
}
