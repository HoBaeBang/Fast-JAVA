package ch18;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		//input = scanner.nextInt();
		
		do {
		input = scanner.nextInt();
		sum += input;
		
		}while(input != 0); //거짓일때 나감 참이면 do안에 있는내용을 돌린다.
		
		System.out.println(sum);
	}

}
