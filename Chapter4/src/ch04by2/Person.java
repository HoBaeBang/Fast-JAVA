package ch04by2;
//Class�� newInstance ����غ��� ���ؼ� ���� Ŭ����

public class Person {
		
	private String name;
	private int age;
	
	public Person(){}
	public Person(String name) {
		this.name =name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return name;
	}
	

}