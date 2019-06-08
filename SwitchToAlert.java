import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jsbin.com/usidix/1");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[value='Go!']")).click();
        String s = driver.switchTo().alert().getText();
        System.out.print(s);
        driver.switchTo().alert().accept();
	}

}
