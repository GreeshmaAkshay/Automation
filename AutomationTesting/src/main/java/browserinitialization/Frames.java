package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames{
	public WebDriver driver;
	public void frames() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement frm = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(frm);
		WebElement frm1 = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		
		frm.click();
	}

	public static void main(String[] args) {
		Frames frame = new Frames();
		frame.frames();
	}

}
