package ch16;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee employeeLee =new Employee();
		employeeLee.setEmployeeName("�̼���");
		
		System.out.println(Employee.serialNum);
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("������");
		
		
		System.out.println(employeeLee.getEmployeeName()+"���� ����� " + employeeLee.getEmployeeID() +"�� �Դϴ�.");
		System.out.println(employeeKim.getEmployeeName()+"���� ����� " + employeeKim.getEmployeeID() +"�� �Դϴ�.");
	}
}
