package ch11;

import ch10.Member;
import ch10.MemberArrayList;

public class IteratorTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
				
				Member memberBang = new Member(1001,"��ȣ��");
				Member memberKim = new Member(1002, "������");
				Member memberKang = new Member(1003, "������");
				Member memberHong = new Member(1004, "ȫ�浿");
				
				memberArrayList.addMember(memberBang);
				memberArrayList.addMember(memberKim);
				memberArrayList.addMember(memberKang);
				memberArrayList.addMember(memberHong);
		
				memberArrayList.showAllMember();
				memberArrayList.removeMember(memberKim.getMemberId());
				memberArrayList.showAllMember();
	}

}
