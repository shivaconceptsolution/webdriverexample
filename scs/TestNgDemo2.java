package scs;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgDemo2 {
@BeforeSuite
public void beforeSuite() {
		  System.out.println("SCS.Before Suite");
	  }	
@Test(priority=0)
void fun1()
{
	//Assert.fail();
	System.out.println("Fun1");
}
@Test(priority=1)
void fun2()
{
	System.out.println("Fun2");
}
@Test(priority=0,alwaysRun=true)
void fun3()
{
	System.out.println("Fun3");
}
@AfterSuite
public void cleanupSuite() {
    System.out.println("SCS suite1");
}	
}
