package ch03;

public class MyListNode {
	private String data;	//�ڷ�
	public MyListNode next;	//���� ��带 ����Ű�� ��ũ
	
	public MyListNode() {	//����Ʈ ������
		data = null;
		next = null;		
	}
	
	public MyListNode(String data) {	//�����͸� �޴� ������
		this.data = data;
		this.next = null;
	}
	
	public MyListNode(String data, MyListNode link) {	//�����Ϳ� ���� ��带 ����Ű�� ������
		this.data = data;
		this.next = link;
	}
	
	public String getData(){	//�����͸� ��ȯ�ϱ� ���� data getter 
		return data;
	}
}
