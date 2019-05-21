import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorExample {
	static WebDriver driver;
	static WebElement txt1;
	static void openSite()
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("http://shivaconceptsolution.com/test.html");
	}
	static void locateById()
	{
		txt1 = driver.findElement(By.id("txt1"));
		txt1.sendKeys("test by id");
		
	}
	static void locateByName()
	{
		txt1 = driver.findElement(By.name("txt1"));
		txt1.sendKeys("test by name");
		
	}
	static void locateByLinkText()
	{
		txt1 = driver.findElement(By.linkText("Click to view My Youtube channel"));
		txt1.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
	}
	static void locateByPartialLinkText()
	{
		txt1 = driver.findElement(By.partialLinkText("Youtube"));
		txt1.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
	}
	
	
	static void locateByTagName()
	{
		txt1 = driver.findElement(By.tagName("a"));
		String str = txt1.getAttribute("href");
		System.out.println(str);
	}
	static void locateByClassName()
	{
		txt1 = driver.findElement(By.className("abc"));
		txt1.sendKeys("By Classname");
	}
	static void locateByTagId()
	{
		txt1 = driver.findElement(By.cssSelector("input#txt1"));
		txt1.sendKeys("By Tag and ID");
	}
	static void locateByTagClassname()
	{
		txt1 = driver.findElement(By.cssSelector("input.abc"));
		txt1.sendKeys("By Tag and Class");
	}
	static void locateTagAttribute()
	{
		txt1 = driver.findElement(By.cssSelector("input[value='CPP']"));
		txt1.click();
		//txt1.sendKeys("By Tag and Class");
	}
	static void locateByXpath()
	{
		txt1 = driver.findElement(By.xpath("//input[@name='txt1']"));
		txt1.sendKeys("Jay Kumar");;
		
	}
	
	static void selectExample()
	{
		Select s = new Select(driver.findElement(By.name("state")));
	  //  s.selectByValue("MP");	
	//	s.selectByIndex(2);
		s.selectByVisibleText("AP");
	}
	static void listExample()
	{
		Select s = new Select(driver.findElement(By.name("country")));
		s.selectByIndex(2);
		s.selectByIndex(1);
	}
	static void locateTagClassAttribute()
	{
		txt1 = driver.findElement(By.cssSelector("input.abc[type='text']"));
		txt1.sendKeys("Tag Class and Attribute");
		//txt1.click();
	}
	public static void main(String[] args) {
		
      openSite();
     // locateById();
     // locateByName();
     // locateByLinkText();
     // locateByPartialLinkText();
     // locateByTagName();
      //   locateByClassName();
      // locateByTagId();
      //locateByTagClassname();
     // locateTagAttribute();
      //locateTagClassAttribute();
      //selectExample();
     // listExample();
      locateByXpath();
      
      }

}
