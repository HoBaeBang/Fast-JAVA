package ch15;

public class Taxi {
	
	String conpanyName;
	int customerCount;
	int money;
	
	public Taxi(String companyName) {
		this.conpanyName = companyName;
	}
	
	public void take(int money) {
		this.money +=money;
	}
	public void showTaxiInfo() {
		System.out.println(conpanyName+"�ý� ������ "+money+"�� �Դϴ�.");
	}
}
