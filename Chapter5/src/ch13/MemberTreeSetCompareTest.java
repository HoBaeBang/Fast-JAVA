package ch13;

import java.util.Comparator;
import java.util.TreeSet;


class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
	
		return s1.compareTo(s2);
	}
	
}


public class MemberTreeSetCompareTest {

	public static void main(String[] args) {

		
		TreeSet<String> set = new TreeSet<String>(new MyCompare());
		set.add("Park");
		set.add("Kim");
		set.add("Lee");
		
		System.out.println(set);
		
	}

}
