package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment1 extends Base{
public void value(){
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgfield = driver.findElement(By.id("value-a"));
		msgfield.sendKeys("12");
		WebElement msgfield2 = driver.findElement(By.id("value-b"));
		msgfield2.sendKeys("14");
		WebElement button = driver.findElement(By.id("button-two"));
		button.click();
		//System.out.println();
		
	}
	public static void main(String[] args) {
		Assignment1 form = new Assignment1();
		form.initialisation();
		form.value();

	}

}
