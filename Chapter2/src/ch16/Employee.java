package ch16;

public class Employee {
	
	public static int serialNum = 1000;
	
	private int employeeID;//��� ���
	private String employeeName;//�̸�
	private String depratment;//�μ�

	public Employee() {
		
		employeeID = serialNum++;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepratment() {
		return depratment;
	}
	public void setDepratment(String depratment) {
		this.depratment = depratment;
	}
	
	
	
}
