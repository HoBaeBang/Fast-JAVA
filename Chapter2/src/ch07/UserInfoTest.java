package ch07;

public class UserInfoTest {

	public static void main(String[] args) {
		
		UserInfo userLee = new UserInfo();
		userLee.userID = "a123456";
		userLee.userPassword = "zxcvbn123456";
		userLee.userName = "Lee";
		userLee.userAddress = "Seoul, Korea";
		userLee.phoneNumber = "01034556699";
		
		System.out.println(userLee.showUserInfo());
		
		UserInfo userKim = new UserInfo("b12345","0987mnbvc","Kim");
		
		System.out.println(userKim.showUserInfo());
		
	}

}
