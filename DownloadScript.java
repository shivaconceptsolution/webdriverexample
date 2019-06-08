import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/yahoo.html");
		WebElement ele = driver.findElement(By.id("messenger-download"));
		String source=ele.getAttribute("href");
		String wget_command = "cmd /c C:\\wget.exe -P E: --no-check-certificate " + source;
		try
		{
			Runtime.getRuntime().exec(wget_command);
			
		}
		catch(Exception ex)
		{
			
		}


	}

}
