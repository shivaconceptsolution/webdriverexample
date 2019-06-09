package scs;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupExample {

 /*@BeforeGroups("testing")
  public void mT()
  {
	  System.out.println("manualtesting");
  }
 @AfterGroups("testing")
 public void aT()
 {
	  System.out.println("automationtesting");
 }
  @Test(groups="testing")
  public void f() {
	  System.out.println("testing");
  }
  @Test(groups="testing")
  public void f12() {
	  System.out.println("testing interview");
  }
  @BeforeGroups("java")
  public void cj()
  {
	  System.out.println("core java");
  }
 @AfterGroups("java")
 public void aj()
 {
	  System.out.println("advance java");
 }
  @Test(groups="java")
  public void j1() {
	  System.out.println("java");
  }*/
  @Test()
  public void j2() {
	  System.out.println("php");
  }
  @Test(dependsOnMethods={"j2"}, alwaysRun=true) 
  public void alwaysruntrue() { 
    System.out.println("Always run is true");
  }
  
  
}
