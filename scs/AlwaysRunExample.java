package scs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunExample {
	@Test()
	  public void j2() {
		 // Assert.fail();
		  System.out.println("php");
		  
	  }
	  @Test(dependsOnMethods={"j2"}, alwaysRun=true) 
	  public void alwaysruntrue() { 
	    System.out.println("Always run is true");
	  }
}
