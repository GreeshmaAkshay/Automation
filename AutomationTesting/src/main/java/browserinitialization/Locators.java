package browserinitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
public void idLocator() {
		
		//creating a webelement similar to interface
		
		
		WebElement messagefield = driver.findElement(By.id("single-input-field"));
		WebElement inputfield = driver.findElement(By.id("value-a"));
		WebElement button = driver.findElement(By.id("button-two"));
	}
	
	public void namelocator() {
		//System.out.println();
		
		
		WebElement namefield  = driver.findElement(By.name("viewport"));
		WebElement desfield  = driver.findElement(By.name("description"));
		WebElement authorfield  = driver.findElement(By.name("author"));
		
		
	}
	
    public void classlocator() {
		
		WebElement classfield  = driver.findElement(By.className("mt-5"));
		WebElement headtop  = driver.findElement(By.className("header-top"));
		WebElement top = driver.findElement(By.className("top-logo"));
		
	}
	
    public void linktextocator() {
    	
    	
    	WebElement linkelement = driver.findElement(By.linkText("radio-button-demo.php"));
    	WebElement linkform = driver.findElement(By.linkText("simple-form-demo.php"));
    	WebElement linkjquery = driver.findElement(By.linkText("jquery-select.php"));
    	
    }
    
    public void partiallink() {
    	
    	WebElement partiallinktext =driver.findElement(By.partialLinkText("form-sub"));
    	WebElement partiallink =driver.findElement(By.partialLinkText("jquery-select"));
    	WebElement partial =driver.findElement(By.partialLinkText("ajax-form"));
    	
    }
    
    public void cssSelector() {
    	//tag#id
    	
    	WebElement cssselector = driver.findElement(By.cssSelector("input#single-input-field"));
    	WebElement idselector = driver.findElement(By.cssSelector("input#value-a"));
    	
    	
    	//tag.class
    	
    	WebElement csselector = driver.findElement(By.cssSelector("div.mb-sec"));
    	WebElement classelector = driver.findElement(By.cssSelector("div.header-top"));
    	
    	
    	
    	//tag[attributetype = attribute value]
    	
    	WebElement attribute = driver.findElement(By.cssSelector("input[id=single-input-field]"));
    	WebElement tagattribute = driver.findElement(By.cssSelector("input[id=value-a]"));
    	
    	//tag.class[attribute type=attribute value]
    	
    	WebElement classattribute = driver.findElement(By.cssSelector("div.mb-sec[class=mb-sec]"));
    	WebElement tagsattribute = driver.findElement(By.cssSelector("div.header-top[class=header-top]"));
    }
    
    public void xpath() {
    	
    	WebElement path = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button"));
    	WebElement paths = driver.findElement(By.xpath("//input[@id='single-input-field']"));
    	WebElement pathss = driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
    	WebElement pathsss = driver.findElement(By.xpath("//button[text()='Show Message']"));
    	WebElement pathssss = driver.findElement(By.xpath("//a[@href='index.php'] //child::img[@alt='logo']"));
    	WebElement pathsssss = driver.findElement(By.xpath("//div[@class='form-group'] //parent::form"));
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
