package ch03;
//StringBuilder�� �̿��Ͽ� ��Ʈ�� �ڷ����� ȿ�������� �����غ���
public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("-android");
		
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);//��Ȥ ������ؼ� ��~ ������ �մ�
		System.out.println(System.identityHashCode(buffer));
		
		
//		System.out.println(buffer.toString());
		String test = buffer.toString();
		System.out.println(test);
	}
}
