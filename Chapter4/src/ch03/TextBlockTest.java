package ch03;
//textblock을 이용해서 좀 더 쉽게 스트링을 이용하는 방법이 있다. """으로 묶으면 된다.
public class TextBlockTest {
	public static void main(String[] args) {
		
		String textBlock = """
				Hello,
				hi,
				how r u""";
				
		System.out.println(textBlock);
		System.out.println(getBlockOfHtml());
	
		
	}
	public static String getBlockOfHtml() {
		return"""
				<html>
				
					<body>
						<span>example text</span>
					</body>
					
				</html>	""";
	}
}
