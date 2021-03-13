package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		//이런식으로 생성된 객체를 인스턴스 라고 한다. 클래스를 기반으로 생성된 객체
		
		studentLee.studentID=12345;	//여기서 studentLee를 참조변수라고 한다. 생성되는 메모리 위치를 나타냄
		studentLee.setStudentName("Lee");
		studentLee.adress="서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID=54321;
		studentKim.setStudentName("Kim");
		studentKim.adress="경기도 성남시";
		
		studentKim.showStudentInfo();
	}

}
