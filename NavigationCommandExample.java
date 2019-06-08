import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://shivaconceptsolution.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("http://shivaconceptsolution.com/contact-us/index.html");
		driver.navigate().refresh();
		driver.navigate().back();
		

	}

}
