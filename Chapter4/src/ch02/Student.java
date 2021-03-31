package ch02;
//JAVA 최상위 class인 Object class의 equals method와 hashcode method를 알아보고 재정의를 통해서 사용법을 알아보기

public class Student {
	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentNum + "," + studentName;
	}

	
	@Override
	public boolean equals(Object obj) {
	
		if(obj instanceof Student) { 
			Student std = (Student)obj; //obj를 Object타입에서 Student타입으로 다운캐스팅 해준다.
			if(this.studentNum == std.studentNum)
				return true;
			else return false;
		}
		
		return false;
	}
	
	
	@Override
	public int hashCode() {
		
		return studentNum;
	}
	

	
	
}
