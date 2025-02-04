package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert extends Base{
	
	public void alert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert_msg = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		alert_msg.click();
		driver.switchTo().alert().accept();
		WebElement alert_msg1 = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		alert_msg1.click();
		driver.switchTo().alert().dismiss();
		WebElement alert_msg2 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alert_msg2.click();
		driver.switchTo().alert().sendKeys("Greeshma");
		driver.switchTo().alert().accept();
	}
	public static void main(String[] args) {
		Alert alert_message = new Alert();
		alert_message.initialisation();
		alert_message.alert();
	}

}
