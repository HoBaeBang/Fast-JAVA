package ch08;
import java.util.Scanner;
public class OrderTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		order.menu();// �޴��� ���
				
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("�ֹ��Ͻ� ��ǰ�� ��ȣ�� �Է����ּ���.: ");
		int menuNumber = scanner.nextInt();
		System.out.print("�ּҸ� �Է����ּ���. : ");
		String orderAddress  = scanner.next();
		System.out.print("�ڵ��� ��ȣ�� �Է����ּ���. : ");
		String phoneNumber = scanner.next();
		
		order.menuCost(menuNumber);
		
		order.orderInfoSet(phoneNumber, orderAddress, menuNumber);
		order.orderIN();
		
	}

}
