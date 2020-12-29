package testBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	String s="Ram";
	boolean value=false;
	 @Test
 public void check() {
	
	// Assert.assertEquals(s, "ram");
		 Assert.assertEquals(s, "Ram");
		 Assert.assertTrue(value);
 }
}
