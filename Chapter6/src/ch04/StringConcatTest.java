package ch04;

public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		
		StringConcatImpl strImple = new StringConcatImpl();
		strImple.makeString("Hello", "World");
	
		StringConcat concat = (s,v) ->System.out.println(s+","+v);
		concat.makeString(s1, s2);
		
		StringConcat concat2 = new StringConcat() {		//이걸 통해서 람다식 내부에 익명의 클래스가 생기면서 된다는 것을 알 수 있다.
			@Override
			public void makeString(String s1,String s2) {
				System.out.println((s1+"..."+s2));
			}
		};
		
		concat2.makeString(s1, s2);
	}

}
