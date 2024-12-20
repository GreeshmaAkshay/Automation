package browserinitialization;

public class NavigationCommand extends Base{
	
	public void navigationcmd() {
		
//to navigate to another url
		driver.navigate().to("https://www.amazon.in/");
//to go back to previous  url
		driver.navigate().back();
//to go back to the next url
		driver.navigate().forward();
//to refresh page
		driver.navigate().refresh();
		
	}
	//System.out.println();
	public static void main(String[] args) {
		NavigationCommand navigation = new NavigationCommand();
		navigation.initialisation();
		navigation.navigationcmd();

	}

}
