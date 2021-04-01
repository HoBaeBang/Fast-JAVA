package ch02by2;
//Object class�� clone() method�� �˾ƺ���

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student student1 = new Student(100, "Lee");
		Student student2 = new Student(100,"Lee");
		
		System.out.println(student1 == student2);
		System.out.println(student1.equals(student2));
//		������ �������� �������ȿ� ��ҿ� �ּҰ��� �������� ��ȯ���ִ� �޼����̴�.
//		��Ʃ��Ʈ Ŭ�������� �������̵��� ���ؼ� ���������δ� �ٸ����� �������� ���ٴ°��� ������.
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		/*
		 * String str1 = new String("abc"); String str2 = new String("abc");
		 * System.out.println(str1.equals(str2));
		 * 
		 * System.out.println(str1.hashCode()); System.out.println(str2.hashCode());
		 */
		System.out.println(System.identityHashCode(student1));
		System.out.println(System.identityHashCode(student2));
//		�ؽ��ڵ带 �������̵��ؼ� ������ ����޼��带 �˰������ ����Ѵ�.
		
		student1.setStudentname("Kim");
		Student copyStudent = (Student)student1.clone();
		System.out.println(copyStudent);
	}

}
