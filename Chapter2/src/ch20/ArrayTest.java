package ch20;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int total = 0;
		
		for(int i =0, num =1; i<arr.length;i++) {
			arr[i] = num++;
		}
		for( int num : arr) { //인헨스드 포 처음부터 끝까지 접근할때에 보통 사용한다.
			total +=num;
		}
		System.out.println(total);
	}

}
