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
			if(title.equals("WebDriver | Login Portal")) {
				WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
				password.sendKeys("innukarthi@1234");
			}
			if(title.equals("WebDriver | Login Portal")) {
				WebElement button = driver.findElement(By.id("login-button"));
				button.click();
			}
			if(title.equals("WebDriver | Contact Us")){
				WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
				firstname.sendKeys("Greeshma GB");
			}
			if(title.equals("WebDriver | Contact Us")){
				WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
				lastname.sendKeys("Greeshma Akshay");
			}
			if(title.equals("WebDriver | Contact Us")){
				WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
				email.sendKeys("greeshmagbparu@gmail.com");
			}
			if(title.equals("WebDriver | Contact Us")){
				WebElement message = driver.findElement(By.xpath("//textarea[@name='message']"));
				message.sendKeys("Hi Greeshma");
			}
			if(title.equals("WebDriver | Contact Us")){
				WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
				submit.click();
			}
		}
	}
	//System.out.println();
	public static void main(String[] args) {
		MultipleWindowHandling multiple_window = new MultipleWindowHandling();
		multiple_window.MultipleWindow();
	
	}

}

