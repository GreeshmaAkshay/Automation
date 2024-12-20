package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputForm extends Base{
	
public void showmessage() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgfield = driver.findElement(By.id("single-input-field"));
		msgfield.sendKeys("Hello");
		WebElement button = driver.findElement(By.id("button-one"));
		button.click();
	}
	
//System.out.println();

	public static void main(String[] args) {
		InputForm input = new InputForm();
		input.initialisation();
		input.showmessage();

	}

}
