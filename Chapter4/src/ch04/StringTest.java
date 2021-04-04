package ch04;
//Class class에 대해서 알아보며 동적로딩을 조금 알아보기
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String"); //Class.forName("클래스 이름") 메서드로 클래스를 동적으로 로드 함
		
//		Class 클래스는 컴파일 된 class 파일을 로드하여 객체를 동적 로드하고, 정보를 가져오는 메서드가 제공됨
		
		Class b = String.class;	//클래스 이름으로 직접 Class 클래스 가져오기
		
		String s = new String();	//생성된 인스턴스에서 Class 클래스 가져오기
		Class a = s.getClass();	//Object 메서드
		
		
		
		Constructor[] cons = c.getConstructors();
		for(Constructor con : cons) {
			System.out.println(con);
		}
		
		Method[] m = c.getMethods();
		for( Method me : m) {
			System.out.println(me);
		}
	}

}
