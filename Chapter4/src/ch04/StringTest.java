package ch04;
//Class class�� ���ؼ� �˾ƺ��� �����ε��� ���� �˾ƺ���
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String"); //Class.forName("Ŭ���� �̸�") �޼���� Ŭ������ �������� �ε� ��
		
//		Class Ŭ������ ������ �� class ������ �ε��Ͽ� ��ü�� ���� �ε��ϰ�, ������ �������� �޼��尡 ������
		
		Class b = String.class;	//Ŭ���� �̸����� ���� Class Ŭ���� ��������
		
		String s = new String();	//������ �ν��Ͻ����� Class Ŭ���� ��������
		Class a = s.getClass();	//Object �޼���
		
		
		
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
