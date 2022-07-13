package objectTest;

public class Car {
	int carNum;
	
	public Car(int carNum) {
		super();
		this.carNum = carNum;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		return super.equals(obj);
		if(obj instanceof Car) {
			return this.carNum == ((Car)obj).carNum; // �ٿ�ĳ����
		}
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�ڵ��� ��ȣ�� : " + this.carNum;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.carNum;
	}

	
}
