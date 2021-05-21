package ch03;

public class MyListNode {	//LinkedList를 구성하는 노드를 만들기 위한 클래스
	private String data;	//자료를 넣을 변수 설정
	public MyListNode next;	//다음 노드를 가리키는 링크 변수 설정
	
	public MyListNode() {	//디폴트 생성자
		data = null;	
		next = null;		
	}
	
	public MyListNode(String data) {	//데이터를 받는 생성자
		this.data = data;				//데이터를 뒤에 하나씩 넣을때 사용
		this.next = null;
	}
	
	public MyListNode(String data, MyListNode link) {	//데이터와 다음 노드를 가르키는 생성자
		this.data = data;				//특정 데이터를 원하는 위치에 삽입 혹은 제거
		this.next = link;
	}
	
	public String getData(){	//데이터를 반환하기 위한 data getter 
		return data;
	}
}
