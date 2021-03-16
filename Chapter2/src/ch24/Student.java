package ch24;

import java.util.ArrayList;

public class Student {
	
	private int studentNumber;
	private String studentName;
	private int total;
	
	ArrayList<Subject> subject = new ArrayList<>(); //�迭 ArrayList ����
	
	public Student (int studentNumber, String studentName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
	}// ������
	
	
	public void addSubject (String subjectName, int subjectScore) {
		subject.add(new Subject (subjectName,subjectScore));
	}
	
	public void showStudentInfo() {
		for( int a = 0 ; a <subject.size() ; a++) {
		System.out.println("�л� "+ studentName+"�� " + subject.get(a).getSubjectName() +" ���� ������ "+subject.get(a).getScore() + "�Դϴ�.");
		total += subject.get(a).getScore();
		}
		System.out.println("�л� "+ studentName+"�� ������ " + total + "�Դϴ�.");
	}
}
