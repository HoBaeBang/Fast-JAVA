package ch09;

public class Student {
	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	
	Student(int studentId, String studentName){
		this.studentID = studentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
		//생성자에서 생성을 많이한다 참조변수로 멤버변수를 쓰는경우
		
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjecctName = name;
		korea.score = score;
	}
	
	public void setMathSubject( String name, int score) {
		math.subjecctName = name;
		math.score = score;
	}
	
	public void showScore() {
		int total = korea.score + math.score;
		int averrage = total / 2;
		System.out.println(studentName + "학생의 총점은" + total +"점이고 평균은 "+averrage+"점 입니다.");
	}
}
