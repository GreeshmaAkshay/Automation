package browserinitialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	public void initialisation() {
//Launch different browsers
		
		driver = new ChromeDriver();
		//driver = new EdgeDriver();
		//driver = new FirefoxDriver();
		
//How to launch a url0
		
		driver.get("http://selenium.qabible.in/index.php");
//How to maximize  the window
		driver.manage().window().maximize();
		
	}
	public void closequit() {
//How to close the browser
		driver.close();
		driver.quit();
	}
	//System.out.println();

	public static void main(String[] args) {
		Base base = new Base();
		base.initialisation();
		//base.closequit();
	}


	
}
