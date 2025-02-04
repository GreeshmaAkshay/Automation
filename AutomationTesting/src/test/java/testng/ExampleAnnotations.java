package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ExampleAnnotations {
  @Test
  public void sample() {
	  System.out.println("Sample");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }
@Test
public void example() {
	System.out.println("Sample 2");
}
}
