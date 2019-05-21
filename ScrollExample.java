import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebElement element = driver.findElement(By.tagName("body"));
		System.out.println("height ="+element.getSize().height);
		driver.get("http://demo.guru99.com/test/guru99home/");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    driver.manage().window().maximize();
	    js.executeScript("window.scrollBy(0,1143)");

	}

}
