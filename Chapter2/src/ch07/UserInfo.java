package ch07;

public class UserInfo {
	//���̵� ��й�ȣ �̸� �ּ� �ڵ�����ȣ
	public String userID;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	public UserInfo(){}
	
	public UserInfo(String userID, String userPassword, String userName) {
		this.userID = userID;
		this.userPassword = userPassword;
		this.userName = userName;
	}
	
	public String showUserInfo() {
		return "������ ���̵��" + userID + "�̰�, ��ϵ� �̸���" + userName + "�Դϴ�."; 
	}	
	
}
