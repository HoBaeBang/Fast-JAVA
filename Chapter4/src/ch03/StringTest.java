package ch03;
//Sting class��  ���ؼ� �˾ƺ���
public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc"); //���� ��������
		String str2 = new String("abc"); //String class�� ���鶧 ĳ���� array�� ���� �Ǵµ� String�ҽ��� ���� final�� �Ǿ��ִ�.
		//�� ��Ʈ���� �ѹ� �����Ǹ� �Ҹ��Ѵ�.(immutable)
		
		System.out.println( str1 == str2 );
//		str1 str2�� address�� ������ ����� false���� �����µ� 
//		�������� ������ �����ڷ� ���� �ν��Ͻ��� �����Ǿ� ���� �ٸ� �ּҰ��� �����⶧���̴�.
		
		String str3 = "abc";//���Ǯ���ִ°� �ҷ���
		String str4 = "abc";
		System.out.println( str3 == str4 );
//		�׳� String�� ����� ��� ""���� ���� ���Ǯ�������? ���Ǯ�� ���ڿ��� ��� ���� �ּ� ���� ����
		
	}

}
