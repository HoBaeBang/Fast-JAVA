package ch07;

public class UserInfo {
	//아이디 비밀번호 이름 주소 핸드폰번호
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
		return "고객님의 아이디는" + userID + "이고, 등록된 이름은" + userName + "입니다."; 
	}	
	
}
