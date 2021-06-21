package ch05;

public class MyListNode {	//LinkedQueue�� �����ϴ� ��带 ����� ���� Ŭ����
	private String data;	//�ڷḦ ���� ���� ����
	public MyListNode next;	//���� ��带 ����Ű�� ��ũ ���� ����
	
	public MyListNode() {	//����Ʈ ������
		data = null;	
		next = null;		
	}
	
	public MyListNode(String data) {	//�����͸� �޴� ������
		this.data = data;				//�����͸� �ڿ� �ϳ��� ������ ���
		this.next = null;
	}
	
	public MyListNode(String data, MyListNode link) {	//�����Ϳ� ���� ��带 ����Ű�� ������
		this.data = data;				//Ư�� �����͸� ���ϴ� ��ġ�� ���� Ȥ�� ����
		this.next = link;
	}
	
	public String getData(){	//�����͸� ��ȯ�ϱ� ���� data getter 
		return data;
		
	}
}
