package ch15;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		System.out.println("나이를 입력하세요 : ");
		
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		int charge;
		
		if(age<8) {
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}else if(age<14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if(age<20) {
			charge = 3000;
			System.out.println("중, 고등학생입니다.");
		}else {
			charge=4000;
			System.out.println("성인입니다.");
		}
		System.out.println("입장료는" + charge + "입니다.");
	}
 
}
