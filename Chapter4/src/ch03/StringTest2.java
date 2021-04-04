package ch03;
//String class를 알아보고 연결해서 사용하는 방법인 concat을 사용해보자
public class StringTest2 {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java)); //자바 해쉬코드(안스턴스의 저장주소를 반환함)
		
		java = java.concat(android);;
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java)); //자바 해쉬코드(안스턴스의 저장주소를 반환함)
		//연결된 아웃풋은 다르다는걸 알아야 합니다.
		//이때문에 이런사용법은 메모리 낭비를 하게되고 그때문에 StringBuilder, StringBuffer을 사용권장한다.
	}

}
