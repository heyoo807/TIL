package getterSetter;

public class Student {
	
	private String name; //���, �������, �ν��Ͻ�����
	private int kor; //���, �������, �ν��Ͻ�����
	private int eng;//���, �������, �ν��Ͻ�����
	private int math;//���, �������, �ν��Ͻ�����
	
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
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		if(kor >= 0 && kor <= 100) {
			this.kor = kor;		
		}
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
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
