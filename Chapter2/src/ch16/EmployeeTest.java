package ch16;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee employeeLee =new Employee();
		employeeLee.setEmployeeName("이순신");
		
		System.out.println(Employee.serialNum);
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		
		System.out.println(employeeLee.getEmployeeName()+"님의 사번은 " + employeeLee.getEmployeeID() +"번 입니다.");
		System.out.println(employeeKim.getEmployeeName()+"님의 사번은 " + employeeKim.getEmployeeID() +"번 입니다.");
	}
}
