package ch03;
//String class�� �˾ƺ��� �����ؼ� ����ϴ� ����� concat�� ����غ���
public class StringTest2 {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java)); //�ڹ� �ؽ��ڵ�(�Ƚ��Ͻ��� �����ּҸ� ��ȯ��)
		
		java = java.concat(android);;
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java)); //�ڹ� �ؽ��ڵ�(�Ƚ��Ͻ��� �����ּҸ� ��ȯ��)
		//����� �ƿ�ǲ�� �ٸ��ٴ°� �˾ƾ� �մϴ�.
		//�̶����� �̷������� �޸� ���� �ϰԵǰ� �׶����� StringBuilder, StringBuffer�� �������Ѵ�.
	}

}
