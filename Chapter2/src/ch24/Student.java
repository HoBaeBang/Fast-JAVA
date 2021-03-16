package ch24;

import java.util.ArrayList;

public class Student {
	
	private int studentNumber;
	private String studentName;
	private int total;
	
	ArrayList<Subject> subject = new ArrayList<>(); //배열 ArrayList 생성
	
	public Student (int studentNumber, String studentName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
	}// 생성자
	
	
	public void addSubject (String subjectName, int subjectScore) {
		subject.add(new Subject (subjectName,subjectScore));
	}
	
	public void showStudentInfo() {
		for( int a = 0 ; a <subject.size() ; a++) {
		System.out.println("학생 "+ studentName+"의 " + subject.get(a).getSubjectName() +" 과목 성적은 "+subject.get(a).getScore() + "입니다.");
		total += subject.get(a).getScore();
		}
		System.out.println("학생 "+ studentName+"의 총점은 " + total + "입니다.");
	}
}
