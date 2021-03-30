package ch01;

class Book{
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		// TODO 자동 생성된 메소드 스텁
		return title + "," + author;
	}
	
	
	
}

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("데미안", "헤르만 헤세");
		
		System.out.println(book);//16진수의 가상메모리값이 나온다. JVM이 준 값이다. 실제메모리 값은다름
		
		String str = new String("test");
		System.out.println(str.toString());
	}

}
