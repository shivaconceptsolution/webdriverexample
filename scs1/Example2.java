package scs1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Example2 {

  @Test
  public void f() {
	  System.out.println("SCS1.Function");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("SCS1.Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("SCS1.After Class");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("SCS1.Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("SCS1.After Suite");
  }

}
