package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1","조정래");
		library[1] = new Book("태백산맥2","조정래");
		library[2] = new Book("태백산맥3","조정래");
		library[3] = new Book("태백산맥4","조정래");
		library[4] = new Book("태백산맥5","조정래");
		
		copyLibrary[0] = new Book(); // 정말 따로 객체를 가지고싶을때사용
		copyLibrary[1] = new Book(); // 깊은 복사라고 한다.
		copyLibrary[2] = new Book(); // 이렇게 인스턴스를 새로 만들고나서 arraycopy를 해야한다.
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book(); 
		
//		System.arraycopy(library, 0, copyLibrary, 0, 5);
//		배열 카피 System.arraycopy(src, srcPos, dest, destPos, lenght);
//		주소만을 카피해 주는것이기때문에 완전한 복사를 위해서는 반복문을 사용해서 요소를 복사한다.
		for( int i = 0 ; i <library.length ; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}//이것은 혁신이여
		
		System.out.println("==library==");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
			
		}
		System.out.println("==copy library==");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
			
		}
		
		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
		
		System.out.println("==library==");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
			
		}
		
		System.out.println("==copy library==");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
			
		}
	}
}
