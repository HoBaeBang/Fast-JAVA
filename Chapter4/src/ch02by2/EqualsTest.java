package ch02by2;
//Object class의 clone() method를 알아보기

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student student1 = new Student(100, "Lee");
		Student student2 = new Student(100,"Lee");
		
		System.out.println(student1 == student2);
		System.out.println(student1.equals(student2));
//		원래의 이퀄스는 이퀄스안에 요소와 주소값이 같은지를 반환해주는 메서드이다.
//		스튜던트 클래스에서 오버라이딩을 통해서 물리적으로는 다르지만 논리적으로 같다는것을 구현함.
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
//		해쉬코드를 오버라이딩해서 원래의 가상메서드를 알고싶을때 사용한다.
		
		student1.setStudentname("Kim");
		Student copyStudent = (Student)student1.clone();
		System.out.println(copyStudent);
	}

}
