package ch06;

public class Student {
	
	public int studentNumber;	//이클립스에서는 멤버변수를 기본적으로 파란색으로 나타냄
	public String studentName;
	public int grade;
	
	public Student(){}			//컨스트럭터 오버로딩
	
	public Student(int studentNumber,String studentName,int grade) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		
		return studentName + "학생의 학번은" + studentNumber +"이고, " + grade +"학년 입니다.";
	}
	
	
}
