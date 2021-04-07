package ch04by2;
//Class의 newInstance 사용해보기 위해서 만들어본 클래스

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
