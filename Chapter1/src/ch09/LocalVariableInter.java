package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {
		
		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
		
		str = "Hello";
		//str = 3; 자바에서는 파이썽 스크립트와 조금 다른다.
		//처음 자료형을 성언한것을 따라간다.
		System.out.println(str);
	}

}
