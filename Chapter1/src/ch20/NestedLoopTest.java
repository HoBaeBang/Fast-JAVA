package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {
				
		for(int count=1;count <= 9;count++) {	//���ϴ� ���� ������ ���� �ݺ���
			for(int dan =1;dan<=9;dan++) {	//�ܼ��� ���������� �ݺ���
				
				System.out.print(dan +"x" +count +"=" + dan*count + "\t"); //�̽������� ������ ������� ���ݸ���
				
			}
			System.out.println();
		}
	}

}