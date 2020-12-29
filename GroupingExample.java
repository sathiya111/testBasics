package testBasics;

import org.testng.annotations.Test;

public class GroupingExample {
	@Test(groups= {"cycle"})
 public void cycle() {
	 System.out.println("This is basic practice");
 }@Test(groups= {"bike"})
 public void bike() {
	 System.out.println("This is bike race practice");
 }@Test(groups= {"car"})
 public void car() {
	 System.out.println("This is run race by car");
 } 
 @Test(groups= {"bus"})
 public void bus() {
	 System.out.println("This is driving by bus");
 }
}
