package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�¹���1","������");
		library[1] = new Book("�¹���2","������");
		library[2] = new Book("�¹���3","������");
		library[3] = new Book("�¹���4","������");
		library[4] = new Book("�¹���5","������");
		
		copyLibrary[0] = new Book(); // ���� ���� ��ü�� ��������������
		copyLibrary[1] = new Book(); // ���� ������ �Ѵ�.
		copyLibrary[2] = new Book(); // �̷��� �ν��Ͻ��� ���� ������� arraycopy�� �ؾ��Ѵ�.
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book(); 
		
//		System.arraycopy(library, 0, copyLibrary, 0, 5);
//		�迭 ī�� System.arraycopy(src, srcPos, dest, destPos, lenght);
//		�ּҸ��� ī���� �ִ°��̱⶧���� ������ ���縦 ���ؼ��� �ݺ����� ����ؼ� ��Ҹ� �����Ѵ�.
		for( int i = 0 ; i <library.length ; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}//�̰��� �����̿�
		
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
		
		library[0].setAuthor("�ڿϼ�");
		library[0].setTitle("����");
		
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
