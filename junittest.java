/**
 *  Data Science, Algorithms and Software Engineering Task 11;
 *  Nyasha Mhirimo [30 September 2019];
 *  Test methods for the provided data 
 **/

package stringTest;

public class JunitTest {
	
	//test method to test the length of a string
	public int length (String test) {
		return test.length();
	}
	//test method to test charAt
	public char charAt( int a, String word  ) {
	
		return word.charAt(a);
		
	}
	//test method to test index of a character
	public int indexOf(String letter, char ch ) {
		//String letter = "john is legend";
		return letter.indexOf(ch);
		
	}
	//test method to find a substring
	public String substring( int a, int b) {
		String str = "john";
		return str.substring(a,b);
	}

}
