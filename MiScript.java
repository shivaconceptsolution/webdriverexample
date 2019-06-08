
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MiScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.mi.com/in/");
		WebElement sol = driver.findElement(By.linkText("Mi Protect"));
		sol.click();
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,250)", "");
		WebElement quest= driver.findElement(By.className("J_faqLi"));
		quest.click();
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"faq\"]/div/ul/li[1]/div[2]/div")); 
		  for (int i = 0; i < elements.size(); i++) {
		     
			  System.out.println(elements.get(i).getText());
		}
		
	}

}

