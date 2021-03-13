package ch08;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Order {
	/* �ֹ�������ȣ			��¥+�޴���ȣ+�ڵ�����ȣ+
	 * �ֹ� �ڵ��� ��ȣ	-�Է�
	 * �ֹ� �� �ּ�		-�Է�
	 * �ֹ� ��¥
	 * �ֹ� �ð�
	 * �ֹ� ����	
	 * �޴� ��ȣ	-�Է�
	 */
	
	public String phoneNumber;
	public String orderAddress;
	public int menuNumber;	//�޴���ȣ
	public String date;
	public String time;
	public String cost;
	public String orderNumber;//�ֹ���ȣ
	
	
	Date d= new Date();
	SimpleDateFormat formatD =new SimpleDateFormat("yyyymmdd");
	
	
	
	
	public void orderInfoSet(String phoneNumber, String orderAddress, int menuNumber) {
		
		
		this.phoneNumber = phoneNumber;
		this.orderAddress = orderAddress;
		this.menuNumber = menuNumber;
		this.date = formatD.format(d);
		this.orderNumber=this.date+this.menuNumber+this.phoneNumber;
		
		
	}
	
	
	
	public void orderIN() {	//���� �ֹ�Ȯ�ζ�
		
		System.out.println("\n�ֹ��� �����Ǿ����ϴ�. \n�ֹ� ������ Ȯ���� �ּ���~!\n");
		System.out.println("�ֹ� ���� ��ȣ : " + orderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + phoneNumber);
		System.out.println("�ֹ� �� �ּ� : " + orderAddress);
		System.out.println("�ֹ� ��¥ : " + date);
		System.out.println("�ֹ� ���� : " + this.cost);
		System.out.println("�޴� ��ȣ : " + menuNumber);
		
	}
	
	
	
	public void menuCost(int menuNumber) {	//�޴������� ���ݼ���
		if(menuNumber == 1) {
			this.cost ="25,000$";
		}else if(menuNumber == 2) {
			this.cost = "12,000$";
		}else if(menuNumber == 3) {
			this.cost = "35,000$";
		}else if(menuNumber == 4) {
			this.cost ="52,000$";
		}else {
			System.out.println("�޴����� ���� �޴���ȣ�� �����ּ���");
			}
			
	}
	
	
	
	public void menu() {	//�޴���
		System.out.println("////////////////////////////////////////////////");
		System.out.println("//  ����� ����~~                                //");
		System.out.println("//                   �޴���ȣ                    //");
		System.out.println("//  0001 - 25,000$            0002 - 12,000$  //");	
		System.out.println("//  0003 - 35,000$            0004 - 52,000$  //");
		System.out.println("////////////////////////////////////////////////");
	}
	
}
