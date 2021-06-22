package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		printer.setMaterial(powder);
		
		Powder p = (Powder)printer.getMaterial(); 
		//object type을 powder로 형변환 해서 사용이 가능
		
		
	}

}
