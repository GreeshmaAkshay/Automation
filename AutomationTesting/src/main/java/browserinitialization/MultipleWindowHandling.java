package browserinitialization;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling{
	public WebDriver driver;
	public void MultipleWindow() {
//Launch different browsers
		
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
//How to maximize  the window
		driver.manage().window().maximize();
		WebElement mul_window = driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		mul_window.click();
		WebElement mul_window1 = driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		mul_window1.click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> allwindow = driver.getWindowHandles();
		String title = "";
		for(String allwindows:allwindow) {
			if(!allwindows.equals(parent)) {
				System.out.println(allwindows);
				driver.switchTo().window(allwindows);
				title = driver.getTitle();
				//System.out.println(driver.getTitle());
			}
			if(title.equals("WebDriver | Login Portal")) {
				WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
				username.sendKeys("Greeshma");
			}
			if(title.equals("WebDriver | Contact Us")){
				WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
				firstname.sendKeys("Greeshma GB");
			}
		}
	}
	//System.out.println();
	public static void main(String[] args) {
		MultipleWindowHandling multiple_window = new MultipleWindowHandling();
		multiple_window.MultipleWindow();
	
	}

}

