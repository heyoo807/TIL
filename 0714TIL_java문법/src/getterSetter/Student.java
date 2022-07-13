package getterSetter;

public class Student {
	
	private String name; //멤버, 멤버변수, 인스턴스변수
	private int kor; //멤버, 멤버변수, 인스턴스변수
	private int eng;//멤버, 멤버변수, 인스턴스변수
	private int math;//멤버, 멤버변수, 인스턴스변수
	
	public Student() {
		// 기본생성자
	}
	
	
	public Student(String name, int kor, int eng, int math) {
		// 초기화 생성자
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


	//멤버, 멤버 함수 , 메소드
	public void show() {
		System.out.println("--학생 정보--");
		System.out.println("이름 : " + this.name);
		System.out.println("국어점수 : " + this.kor);
		System.out.println("영어점수 : " + this.eng);
		System.out.println("수학점수 : " + this.math);
		
	}
	
	
	
	
	
}
