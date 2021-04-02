package ch02;
//JAVA �ֻ��� class�� Object class�� equals method�� hashcode method�� �˾ƺ��� �����Ǹ� ���ؼ� ������ �˾ƺ���

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
			Student std = (Student)obj; //obj�� ObjectŸ�Կ��� StudentŸ������ �ٿ�ĳ���� ���ش�.
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