package browserinitialization;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload2 {
	WebDriver driver;
	public void fileupload() {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement file1 = driver.findElement(By.id("file-upload"));
		//file1.click();
		file1.sendKeys("C:\\Users\\GREESHMA GB\\Downloads\\Automation Testing.pdf");
	}	
	public void file_robot_class() throws AWTException {
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement file1 = driver.findElement(By.id("file-upload"));
		file1.click();
		StringSelection str_selection  = new StringSelection("C:\\Users\\GREESHMA GB\\Downloads\\Automation Testing.pdf");
//copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str_selection,null); 
//Paste		
		Robot robot = new Robot(); 
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void main(String[] args) {
		FileUpload2 file_upload2 = new FileUpload2();
		file_upload2.fileupload();
	}

}
