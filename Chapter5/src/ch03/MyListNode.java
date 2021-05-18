package ch03;

public class MyListNode {
	private String data;	//자료
	public MyListNode next;	//다음 노드를 가리키는 링크
	
	public MyListNode() {	//디폴트 생성자
		data = null;
		next = null;		
	}
	
	public MyListNode(String data) {	//데이터를 받는 생성자
		this.data = data;
		this.next = null;
	}
	
	public MyListNode(String data, MyListNode link) {	//데이터와 다음 노드를 가르키는 생성자
		this.data = data;
		this.next = link;
	}
	
	public String getData(){	//데이터를 반환하기 위한 data getter 
		return data;
	}
}
