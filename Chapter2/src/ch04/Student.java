package ch04;

public class Student {
	public int studentID;
	public String studentName;
	public String adress;
	
	public void showStudentInfo() {
		System.out.println(studentID+"�й� �л��� �̸��� "+ studentName +"�̰�, �ּҴ� "+adress+"�Դϴ�.");
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
}
