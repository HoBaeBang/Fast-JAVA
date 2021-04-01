package ch02by2;
//JAVA 최상위 class인 Object class의 equals method와 hashcode method를 알아보고 재정의를 통해서 사용법을 알아보기
//Object class의 Clone 알아보기

public class Student implements Cloneable{
	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public void setStudentname(String name) {
		this.studentName = name;
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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO 자동 생성된 메소드 스텁
		return super.clone();
	}//클론은 그냥 원래형태와같이 복사해서 쓸거면 건드릴 필요 없다. 
//	   하지만 반드시 클론어블(Cloneable)을 implements 해야한다.
	
	
	
	
}
