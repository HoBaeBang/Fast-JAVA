package exception;

public class Car {
	
	String color ; //"»¡°£»ö"
	int speed = 0;
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed() {
		 
	}
	
	public void upSpeed(int value) {
		if (speed+value>=200) {
			speed =200;
		}else {
			speed += value;
		}
	}
	
	public void downSpeed(int value) {
		if(speed - value <=0) {
			speed = 0;
		}else {
			speed -= value; 
		}
	}
}
