import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommandExample {
	static WebDriver driver;
	static WebElement txt1;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://shivaconceptsolution.com");
		// String actualtitle = driver.getTitle();
		// System.out.println(actualtitle);
		 //String scode = driver.getPageSource();
		// System.out.println(scode);
		// String url = driver.getCurrentUrl();
		 // System.out.println(url);
		System.out.println((driver.findElement(By.tagName("h1"))).getText());
		 
		 

	}

}
