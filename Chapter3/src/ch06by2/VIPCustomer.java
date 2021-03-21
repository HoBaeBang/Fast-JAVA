package ch06by2;

public class VIPCustomer extends Customer {

	private int agentID;
	double salesRatio;
   
/*   public VIPCustomer() {
	   super();
	   
      customerGrade = "VIP";
      bonusRatio = 0.05;
      salesRatio = 0.1;
      System.out.println("VIPCustomer() call");
   }*/
   
   public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
	    bonusRatio = 0.05;
	    salesRatio = 0.1;
		
	}

   
   @Override
   public int calcPrice(int price) {
	   bonusPoint += price * bonusRatio;
	   price -= price * salesRatio;
	   return price;
   }


public int getAgentID() {
	   return agentID;
   }
}