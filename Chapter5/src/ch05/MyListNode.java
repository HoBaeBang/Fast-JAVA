package ch05;

public class MyListNode1 {	//LinkedQueue�� �����ϴ� ��带 ����� ���� Ŭ����
	private String data;	//�ڷḦ ���� ���� ����
	public MyListNode1 next;	//���� ��带 ����Ű�� ��ũ ���� ����
	
	public MyListNode1() {	//����Ʈ ������
		data = null;	
		next = null;		
	}
	
	public MyListNode1(String data) {	//�����͸� �޴� ������
		this.data = data;				//�����͸� �ڿ� �ϳ��� ������ ���
		this.next = null;
	}
	
	public MyListNode1(String data, MyListNode1 link) {	//�����Ϳ� ���� ��带 ����Ű�� ������
		this.data = data;				//Ư�� �����͸� ���ϴ� ��ġ�� ���� Ȥ�� ����
		this.next = link;
	}
	
	public String getData(){	//�����͸� ��ȯ�ϱ� ���� data getter 
		return data;
		
	}
}
