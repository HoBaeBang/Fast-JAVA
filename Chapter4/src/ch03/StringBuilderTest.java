package ch03;
//StringBuilder를 이용하여 스트링 자료형을 효율적으로 관리해보자
public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("-android");
		
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);//계혹 어펜드해서 쭉~ 넣을수 잇다
		System.out.println(System.identityHashCode(buffer));
		
		
//		System.out.println(buffer.toString());
		String test = buffer.toString();
		System.out.println(test);
	}
}
