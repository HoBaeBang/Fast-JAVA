package ch02by2;
//JAVA �ֻ��� class�� Object class�� equals method�� hashcode method�� �˾ƺ��� �����Ǹ� ���ؼ� ������ �˾ƺ���
//Object class�� Clone �˾ƺ���

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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO �ڵ� ������ �޼ҵ� ����
		return super.clone();
	}//Ŭ���� �׳� �������¿Ͱ��� �����ؼ� ���Ÿ� �ǵ帱 �ʿ� ����. 
//	   ������ �ݵ�� Ŭ�о��(Cloneable)�� implements �ؾ��Ѵ�.
	
	
	
	
}
