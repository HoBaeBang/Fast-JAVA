package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		//�̷������� ������ ��ü�� �ν��Ͻ� ��� �Ѵ�. Ŭ������ ������� ������ ��ü
		
		studentLee.studentID=12345;	//���⼭ studentLee�� ����������� �Ѵ�. �����Ǵ� �޸� ��ġ�� ��Ÿ��
		studentLee.setStudentName("Lee");
		studentLee.adress="���� ������";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID=54321;
		studentKim.setStudentName("Kim");
		studentKim.adress="��⵵ ������";
		
		studentKim.showStudentInfo();
	}

}
