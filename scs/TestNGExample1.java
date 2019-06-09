package scs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGExample1 {
 WebDriver driver;
  @Test(priority=2)
  public void f() {
	  String title = driver.getTitle();
	  System.out.println(title);
	  driver.navigate().to("https://www.instamojo.com/@shivaconceptsolution");
  }
  @Test(priority=1)
  public void f1() {
	  String title = driver.getTitle();
	  System.out.println(title);
	  driver.navigate().to("https://www.google.com/");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.navigate().refresh();;
  }

  @AfterMethod
  public void afterMethod() {
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  String title = driver.getTitle();
	  System.out.println(title);
	  driver.navigate().back();
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("http://www.shivaconceptsolution.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
