package ch08;
import java.util.Scanner;
public class OrderTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		order.menu();// 메뉴판 출력
				
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("주문하실 상품의 번호를 입력해주세요.: ");
		int menuNumber = scanner.nextInt();
		System.out.print("주소를 입력해주세요. : ");
		String orderAddress  = scanner.next();
		System.out.print("핸드폰 번호를 입력해주세요. : ");
		String phoneNumber = scanner.next();
		
		order.menuCost(menuNumber);
		
		order.orderInfoSet(phoneNumber, orderAddress, menuNumber);
		order.orderIN();
		
	}

}
