package ch06;

public class Student {
	
	public int studentNumber;	//��Ŭ���������� ��������� �⺻������ �Ķ������� ��Ÿ��
	public String studentName;
	public int grade;
	
	public Student(){}			//����Ʈ���� �����ε�
	
	public Student(int studentNumber,String studentName,int grade) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		
		return studentName + "�л��� �й���" + studentNumber +"�̰�, " + grade +"�г� �Դϴ�.";
	}
	
	
}
