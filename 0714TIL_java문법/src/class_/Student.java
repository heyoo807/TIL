package class_;

public class Student { // �ʵ�
	String name; //���, �������, �ν��Ͻ�����
	int kor; //���, �������, �ν��Ͻ�����
	int eng;//���, �������, �ν��Ͻ�����
	int math;//���, �������, �ν��Ͻ�����
	
	public Student() {
		// �⺻������
	}
	
	public Student(String name, int kor, int eng, int math) {
		// �ʱ�ȭ ������
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//���, ��� �Լ� , �޼ҵ�
	public void show() {
		System.out.println("--�л� ����--");
		System.out.println("�̸� : " + this.name);
		System.out.println("�������� : " + this.kor);
		System.out.println("�������� : " + this.eng);
		System.out.println("�������� : " + this.math);
		
	}
	
	
	
}
