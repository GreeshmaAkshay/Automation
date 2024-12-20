package browserinitialization;

public class BrowserCommands extends Base{
public void browsercommand() {
		
//tofetch title from the url
		String title = driver.getTitle();
		System.out.print(title);
		
//tofetch url of the current opened website
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
//tofetch page source of website
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
	
	}
//System.out.println();
	public static void main(String[] args) {
		BrowserCommands browser = new BrowserCommands();
	       browser.initialisation();
	       browser.browsercommand();

	}

}
