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
		//�����ڿ��� ������ �����Ѵ� ���������� ��������� ���°��
		
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
		System.out.println(studentName + "�л��� ������" + total +"���̰� ����� "+averrage+"�� �Դϴ�.");
	}
}
