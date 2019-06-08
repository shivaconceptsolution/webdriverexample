import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableRowColumnScript {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		  WebDriver wd= new ChromeDriver();
	        wd.get("http://demo.guru99.com/test/web-table-element.php");         
	        //No.of Columns
	        List  col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	        System.out.println("No of cols are : " +col.size()); 
	        //No.of rows 
	        List  rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
	        System.out.println("No of rows are : " + rows.size());
	        wd.close();

	}

}
