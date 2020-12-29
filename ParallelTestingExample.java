package testBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.reporters.jq.ChronologicalPanel;

public class ParallelTestingExample {
	@Test
public void chrome() {
	System.out.println("Chrome ");
}@Test
public void ie() {
	System.out.println(":InternetExplore");
}
public void chrome2() {
	System.setProperty("webdriver.chrome.driver",
			"D:\\JavaClass\\TestNG_Concepts\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/");
	driver.close();
}
}