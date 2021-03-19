package ch04;

public class CustomerTest {

   public static void main(String[] args) {
	   
		
	  Customer customerLee = new Customer(10010,"이순신"); 
	  int price = customerLee.calcPrice(1000);;
	  customerLee.bonusPoint = 1000; //기존에 있던 포인트
	  
	  System.out.println(customerLee.showCustomerInfo() + price);
		 
      
      
      VIPCustomer customerKim = new VIPCustomer(10020,"김유신");
      customerKim.bonusPoint = 10000;
      price = customerKim.calcPrice(1000);
      System.out.println(customerKim.showCustomerInfo() + price);
   
      Customer vc = new VIPCustomer(12345, "noname"); 
      System.out.println(vc.showCustomerInfo() + vc.calcPrice(1000));
      //가상 매서드 방식
      
   }

}