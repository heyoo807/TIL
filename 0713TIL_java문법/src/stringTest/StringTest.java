package stringTest;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "apple juice is delicious";
		
		String[] ar = {"�ȳ�", "�ϼ���", "�ݰ����ϴ�"};
		
		//join() : static �޼ҵ�
		System.out.println(String.join(" ", ar)); // �ȳ� �ϼ��� �ݰ����ϴ�
		
		String[] temp = str1.split(" "); //split()�޼ҵ��� ����Ÿ���� �迭
		
		for(int i = 0; i < temp.length; i++){
			System.out.println(temp[i]); // apple // juice //is //delicious
		}
		
		System.out.println("--------------------");
		
		System.out.println(str1.substring(12, 15)); // ���ڿ��� 12��°���ں���15��°���ڱ��� �ڸ��ڴ� //is
		System.out.println(str1.substring(12)); // 12������ ������ �ڸ��ڴ� //is delicious
		
		System.out.println(str1.length()); //24
		
		for(int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i)); //apple juice is delicious
			if(i == str1.length()-1) System.out.println();
		}
		
	
		// indexOf() : �Ű������� ���� ���ڿ�(����)�� ���ڿ���ü�� ��ġ�� �ε�����ȣ�� ����
		System.out.println(str1.indexOf('e'));
		System.out.println(str1.indexOf('e', 5));
		System.out.println(str1.indexOf("�ȳ�")); //������� -1����
		
		
	}
}
