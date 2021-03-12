package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {
				
		for(int count=1;count <= 9;count++) {	//곱하는 값의 증가를 위한 반복문
			for(int dan =1;dan<=9;dan++) {	//단수를 증가를위한 반복문
				
				System.out.print(dan +"x" +count +"=" + dan*count + "\t"); //이스케이프 시퀀스 사용으로 간격맞춤
				
			}
			System.out.println();
		}
	}

}