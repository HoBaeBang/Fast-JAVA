package ch15;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		System.out.println("���̸� �Է��ϼ��� : ");
		
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		int charge;
		
		if(age<8) {
			charge = 1000;
			System.out.println("�� ���� �Ƶ��Դϴ�.");
		}else if(age<14) {
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
		}else if(age<20) {
			charge = 3000;
			System.out.println("��, ����л��Դϴ�.");
		}else {
			charge=4000;
			System.out.println("�����Դϴ�.");
		}
		System.out.println("������" + charge + "�Դϴ�.");
	}
 
}
