package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suiteexample {
	
	WebDriver driver=new ChromeDriver();
	//long starttime;
	//long endtime;
	@BeforeSuite
public void launchbroweser() {
 //starttime = System.currentTimeMillis();
}
@Test
	public void opengoogle() {
	
	driver.get("http://www.google.co.in");
		
	}
@Test
public void openbing() {
	
	driver.get("http://www.bing.com");
	
	}
@Test
public void openyahoo() {
	
	driver.get("http://www.yahoo .com"); 
	
}
@AfterSuite
public void closebrowser() {
	driver.quit();
	//endtime=System.currentTimeMillis();
	//long totaltime=endtime-starttime;
	//System.out.println("total time taken"+ totaltime);
}

}
