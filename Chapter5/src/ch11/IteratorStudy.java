package ch11;
import java.util.Iterator;

import ch10.Member;
import ch10.MemberArrayList;

public class IteratorStudy extends MemberArrayList{
	
	@Override
	public boolean removeMember(int memberId) {
		
		
		Iterator<Member> ir = arrayList.iterator();
		
		while(ir.hasNext()) {
			
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(member);
				return true;
			}
		}
			
		System.out.println( memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
}
