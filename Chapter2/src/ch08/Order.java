package ch08;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Order {
	/* 주문접수번호			날짜+메뉴번호+핸드폰번호+
	 * 주문 핸드폰 번호	-입력
	 * 주문 집 주소		-입력
	 * 주문 날짜
	 * 주문 시간
	 * 주문 가격	
	 * 메뉴 번호	-입력
	 */
	
	public String phoneNumber;
	public String orderAddress;
	public int menuNumber;	//메뉴번호
	public String date;
	public String time;
	public String cost;
	public String orderNumber;//주문번호
	
	
	Date d= new Date();
	SimpleDateFormat formatD =new SimpleDateFormat("yyyymmdd");
	
	
	
	
	public void orderInfoSet(String phoneNumber, String orderAddress, int menuNumber) {
		
		
		this.phoneNumber = phoneNumber;
		this.orderAddress = orderAddress;
		this.menuNumber = menuNumber;
		this.date = formatD.format(d);
		this.orderNumber=this.date+this.menuNumber+this.phoneNumber;
		
		
	}
	
	
	
	public void orderIN() {	//최종 주문확인란
		
		System.out.println("\n주문이 접수되었습니다. \n주문 내용을 확인해 주세요~!\n");
		System.out.println("주문 접수 번호 : " + orderNumber);
		System.out.println("주문 핸드폰 번호 : " + phoneNumber);
		System.out.println("주문 집 주소 : " + orderAddress);
		System.out.println("주문 날짜 : " + date);
		System.out.println("주문 가격 : " + this.cost);
		System.out.println("메뉴 번호 : " + menuNumber);
		
	}
	
	
	
	public void menuCost(int menuNumber) {	//메뉴에따른 가격설정
		if(menuNumber == 1) {
			this.cost ="25,000$";
		}else if(menuNumber == 2) {
			this.cost = "12,000$";
		}else if(menuNumber == 3) {
			this.cost = "35,000$";
		}else if(menuNumber == 4) {
			this.cost ="52,000$";
		}else {
			System.out.println("메뉴판을 보고 메뉴번호를 눌러주세용");
			}
			
	}
	
	
	
	public void menu() {	//메뉴판
		System.out.println("////////////////////////////////////////////////");
		System.out.println("//  배달의 민족~~                                //");
		System.out.println("//                   메뉴번호                    //");
		System.out.println("//  0001 - 25,000$            0002 - 12,000$  //");	
		System.out.println("//  0003 - 35,000$            0004 - 52,000$  //");
		System.out.println("////////////////////////////////////////////////");
	}
	
}
