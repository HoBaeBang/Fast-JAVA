package exception;

public class Truck extends Car {
	
	int cc;
	final static int YEAR = 2013;
	
	public Truck() {} //default ������
	
	public Truck(int cc) {
		this.cc = cc;
	}	//������
	
	
	public int getCC() {
		return cc;
	}
	
//	public int getYEAR() {
//		return YEAR;
//	}
	
	public void upSpeed(int value) {
		if(speed + value >= 150 ) {
			speed = 150;
		}else { 
			speed += value;
		}
	}
	
}