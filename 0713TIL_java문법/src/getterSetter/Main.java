package getterSetter;

public class Main {
	public static void main(String[] args) {
		Student std1 = new Student("����", 100, 100, 100);
		Student std2 = new Student("���ϳ�", 90, 90, 90);
		std1.show();
		System.out.println();
		std2.show();
		
		//setter : private ������ ���� �������ִ� �޼ҵ�
		std1.setKor(90);
		std1.setEng(90);
		std1.setMath(90);
		
		std2.setKor(100);
		std2.setEng(100);
		std2.setMath(100);
		
		std1.show();
		std2.show();

		// getter : private ������ ����Ǿ��ִ� ���� return���ִ� �޼ҵ�
		
		// ��üŸ�Թ迭
		Student[] students = {
				new Student("���ϳ�", 100, 100, 100),
				new Student("����", 90, 90, 90),
				new Student("�̸޷�", 80, 80, 80)
		};
		
		System.out.println(students[0].getName());
		System.out.println(students[1].getName());
		System.out.println(students[2].getName());
		
		

	}
}
