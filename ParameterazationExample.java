package testBasics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterazationExample {
	@Test
	@Parameters("Name")
public void printname(String Name) {
	System.out.println("Name is "+Name);
}
}
