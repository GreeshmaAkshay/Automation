package browserinitialization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{

	public void fulltable() {

		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}

	public void selectrow() {
		// for selecting a particular row from the table
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
		System.out.println(table.getText());
		//System.out.println();
		//System.out.println();
	}

	public void element() {
		// for selecting a particular element from the table
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[1]"));
		System.out.println(table.getText());

	}
	public void coloum() {
 		
		   driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		   List<WebElement> element=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		   for ( WebElement element1:element) 
		   System.out.println(element1.getText());
		     		
		   }
		
		public void findelement() {
			
			driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
			String input="Edinburgh";
			 List<WebElement> element=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
			 for ( WebElement element2:element) {
				 
				 if(element2.getText().equals(input)) {
					 System.out.println(element2.getText());
				 }
			 }
		}
	public static void main(String[] args) {
		TableHandling tablehand = new TableHandling();
		tablehand.initialisation();
		tablehand.fulltable();
		System.out.println("**************");
		tablehand.selectrow();
		System.out.println("**************");
		tablehand.element();
		System.out.println("**************");
		tablehand.coloum();
		System.out.println("**************");
		tablehand.findelement();


	}

}
