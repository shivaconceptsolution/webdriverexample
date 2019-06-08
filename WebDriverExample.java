import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverExample {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("uploadfile_0"));
		ele.sendKeys("D://Java Curriculum.xlsx");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
	}

}
