import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverExample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.hubilo.com");
		driver.manage().window().maximize();
		String str = driver.getCurrentUrl();
		System.out.println(str);
		WebElement sol = driver.findElement(By.linkText("SOLUTIONS"));
		Actions ac = new Actions(driver);
		ac.moveToElement(sol).perform();
		
		//sol.click();
		/*System.out.println("Data of Solution DropDown");
		List<WebElement> elements = driver.findElements(By.className("feature-name")); 
		  for (int i = 0; i < elements.size(); i++) {
		     
			  System.out.println(elements.get(i).getText());
		}
		WebElement feat1 = driver.findElement(By.linkText("FEATURES"));
	    feat1.click();
	    System.out.println("Data of Features DropDown");
		List<WebElement> elements1 = driver.findElements(By.className("feature-name")); 
			  for (int i = 0; i < elements1.size(); i++) {
			     
				  System.out.println(elements1.get(i).getText());
			}*/
		
		/*driver.findElement(By.partialLinkText("Request")).click();
		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("Anuj");
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("Kataria");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Anujkataria11@gmail.com");
		WebElement cname = driver.findElement(By.id("companyName"));
		cname.sendKeys("NEXTGEN VISION");
		Select ccode = new Select(driver.findElement(By.id("select3")));
		ccode.selectByValue("91");
		WebElement phone = driver.findElement(By.id("phoneNumber"));
		phone.sendKeys("8107269644");
		Select desig = new Select(driver.findElement(By.id("select14")));
		desig.selectByValue("IT");
		Select ey = new Select(driver.findElement(By.id("select2")));
		ey.selectByIndex(2);
		WebElement msg = driver.findElement(By.id("requestMessage"));
		msg.sendKeys("i want to conduct event");*/
		//WebElement chk= driver.findElement(By.xpath("//html/body/div[2]"));
		//chk.click();
		//driver.findElement(By.name("mx_Consent")).click();
		//driver.findElement(By.id("request-demo-button")).click();
		
//    driver.close();
	}

}
