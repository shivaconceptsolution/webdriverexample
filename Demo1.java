package scs;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
    
	 
    @BeforeTest
	public void TestSetup(){
	    // To set the path of the Chrome driver.
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 driver = new ChromeDriver();
	     
	    // To launch facebook
	    driver.get("http://newtours.demoaut.com/");
	    // To maximize the browser
	    driver.manage().window().maximize();
	    // implicit wait
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
		  
	@Test
	public void ReadData() throws IOException, Exception{		
		
		// Import excel sheet.
		File src=new File("D:\\TestData.xlsx");		  
		// Load the file.
		FileInputStream fis = new FileInputStream(src);
		// Load he workbook.
		workbook = new XSSFWorkbook(fis);
		// Load the sheet in which data is stored.
		sheet= workbook.getSheet("Sheet1");
		
		for(int i=1; i<=sheet.getLastRowNum(); i++){
			
			cell = sheet.getRow(i).getCell(0);
			cell.setCellType(CellType.STRING);
			driver.findElement(By.name("userName")).clear();
			driver.findElement(By.name("userName")).sendKeys(cell.getStringCellValue());
			 
			// Import data for password.
			cell = sheet.getRow(i).getCell(1);
			cell.setCellType(CellType.STRING);
			driver.findElement(By.name("password")).clear();	         
			driver.findElement(By.name("password")).sendKeys(cell.getStringCellValue());
			// To click on Login button
			driver.findElement(By.name("login")).click();
			//To write data in the excel
			FileOutputStream fos=new FileOutputStream(src);
			// Message to be written in the excel sheet
		    String message = "Pass";
		    // Create cell where data needs to be written.
		    sheet.getRow(i).createCell(2).setCellValue(message);
		        
		    // finally write content
		    workbook.write(fos);
			
			fos.close();
		        
		  
		        
			}
	}
}