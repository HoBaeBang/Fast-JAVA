package ch04by2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class a = Class.forName("ch04by2.Person");
		
		Person person = (Person)a.newInstance();	//반환값이 Object라서 변환을 해줘야한다.
		
		person.setName("Lee");
		System.out.println(person);
		
		//여기부터//
		Class b = person.getClass();
		Person p = (Person)b.newInstance();
		System.out.println(p);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = b.getConstructor(parameterTypes);
		
		Object[] initargs = {"kim"};
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson);
		//여기까지가 밑의
		
		Person kim2 = new Person("kim");  //이것과 같다.
		
	}

}
