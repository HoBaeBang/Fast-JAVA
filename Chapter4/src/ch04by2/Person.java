package ch04by2;
//Class class에 대해서 알아보며 동적로딩을 조금 알아보기

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
