package ch02;

public class MyArray {

	int[] intArr;   	//int array
	int count;  		//개수 처음에 잡은 이용량을 캐퍼서티 라고 한다. 엘리먼트 개수? 카운트 = index -1
		
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	public MyArray()
	{
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	public MyArray(int size)//오버로딩
	{
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];  
	}
	
	public void addElement(int num)//요소 추가하기
	{
		if(count >= ARRAY_SIZE){
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
				
	}

	public void insertElement(int position, int num)//요소 삽입
	{
		int i;
		
		if(count >= ARRAY_SIZE){  //꽉 찬 경우
			System.out.println("not enough memory");
			return;
		}
		
		if(position < 0 || position > count ){  //index error
			System.out.println("insert Error");
			return;
		}
		
		for( i = count-1; i >= position ; i--){
			intArr[i+1]  = intArr[i];        // 하나씩 이동
		}
		
		intArr[position] = num;
		count++;
	}
	
	public int removeElement(int position)
	{
		int ret = ERROR_NUM;
		
		if( isEmpty() ){					//비어있으면 true를 반환하고 그에따라서 에러를 출력한다.
			System.out.println("There is no element");
			return ret;
		}
		
		if(position < 0 || position >= count ){  //원하는 위치가 0보다 작거나 카운트 보다 크거ㅏ같을때
			System.out.println("remove Error");
			return ret;
		}
		
		ret = intArr[position];
		
		for(int i = position; i<count -1; i++ )
		{
			intArr[i] = intArr[i+1];
		}
		count--;
		return ret;
	}
	
	public int getSize()
	{
		return count;
	}
	
	public boolean isEmpty()
	{
		if(count == 0){
			return true;
		}
		else return false;
	}
	
	public int getElement(int position)
	{
		if(position < 0 || position > count-1){
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
			
		for(int i=0; i<count; i++){
			System.out.println(intArr[i]);
		}
		
	}
	
	public void removeAll()
	{
		for(int i=0; i<count; i++){
			intArr[i] = 0;
		}
		count = 0;
	}
}
