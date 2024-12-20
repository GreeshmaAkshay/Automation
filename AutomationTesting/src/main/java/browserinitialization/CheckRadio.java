package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckRadio extends Base{
	
public void box() {
		
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox = driver.findElement(By.id("gridCheck"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		//System.out.println(checkbox.isDisplayed());
		//System.out.println(checkbox.isEnabled());
		
	}
       public void enable() {
    	   
       }
      // public void radio() {
    	   
    	//driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
   		//WebElement radiobox = driver.findElement(By.id("inlineRadio1"));
   	    // radiobox.click();
   		//System.out.println( radiobox.isSelected());
   		//System.out.println( radiobox.isDisplayed());
   		//System.out.println( radiobox.isEnabled());
   		
      // }
     //System.out.println();
	public static void main(String[] args) {
		CheckRadio boxes = new CheckRadio();
		boxes.initialisation();
		boxes.box();
		//boxes.radio();

	}

}
