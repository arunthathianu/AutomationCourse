package seleniumbasics;

public class HandleNavigation extends Base{

	public void verify_navigation_command()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandleNavigation hndle_navi = new HandleNavigation();
		hndle_navi.initializebrowser();
		hndle_navi.verify_navigation_command();

	}

}
