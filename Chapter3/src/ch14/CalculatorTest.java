package ch14;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calc calc = new CompleteCalc(); 
		int num1 = 10; 
		int num2 = 2;
	  
	  	System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2));
	  	System.out.println(num1 + "-" + num2 + "=" +calc.substract(num1, num2));
	  	System.out.println(num1 + "*" + num2 + "=" +calc.times(num1, num2));
	  	System.out.println(num1 + "/" + num2 + "=" +calc.divide(num1, num2));
	  
	  	calc.descrioption();
		 
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));//static이라서 선언전에 사용해도 문제가 되지 않는다.
	}
}