package ch04by2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class a = Class.forName("ch04by2.Person");
		
		Person person = (Person)a.newInstance();	//��ȯ���� Object�� ��ȯ�� ������Ѵ�.
		
		person.setName("Lee");
		System.out.println(person);
		
		//�������//
		Class b = person.getClass();
		Person p = (Person)b.newInstance();
		System.out.println(p);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = b.getConstructor(parameterTypes);
		
		Object[] initargs = {"kim"};
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson);
		//��������� ����
		
		Person kim2 = new Person("kim");  //�̰Ͱ� ����.
		
	}

}
