/**Testing of variables using JUnit*/ 
package stringTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTesting {

	//test of string length
	@Test
	void test() {
		JunitTest test = new JunitTest();
		int resuilt = test.length("john");
		assertEquals(4, resuilt);
		
	}
	// testing substring
	@Test
	void testSubString () {
		JunitTest str = new JunitTest();
		//String yes = "john is legend";
		String result = str.substring(0, 3);
		assertEquals("joh",result);
		
	}
	//testing index of 
	@Test
	void testIndexOf() {
			JunitTest letter = new JunitTest();
			int results = letter.indexOf("paul",'p');
			assertEquals(0,results);	
	}
	//testing charAt
	@Test
	void testCharAt() {
		//String you = "john";
		JunitTest testing = new JunitTest();
		char resuilt = testing.charAt(0,"JOHN");
		assertEquals('J', resuilt);
		
	}

}
