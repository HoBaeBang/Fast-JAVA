package ch03;
//Sting class에  대해서 알아보자
public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc"); //힙에 따로잡힘
		String str2 = new String("abc"); //String class는 만들때 캐릭터 array에 들어가게 되는데 String소스를 보면 final로 되어있다.
		//즉 스트링은 한번 생성되면 불면한다.(immutable)
		
		System.out.println( str1 == str2 );
//		str1 str2의 address가 같은지 물어보면 false값이 나오는데 
//		그이유는 각가의 생성자로 인해 인스턴스로 생성되어 서로 다른 주소값을 가지기때문이다.
		
		String str3 = "abc";//상수풀에있는거 불러옴
		String str4 = "abc";
		System.out.println( str3 == str4 );
//		그냥 String을 사용한 경우 ""안의 값은 상수풀에생기고? 상수풀의 문자열은 모두 같은 주소 값을 가짐
		
	}

}
