package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(123,"Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 99);
		
		Student studentKim = new Student(123,"Kim");
		studentKim.setKoreaSubject("����", 50);
		studentKim.setMathSubject("����", 65);
		
		studentLee.showScore();
		studentKim.showScore();
	}

}
