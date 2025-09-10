package seleniumbasics;

public class HandlingBrowserCommands extends Base{

	public void basic_commands()
	{
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getPageSource());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingBrowserCommands hndlng_browser_cmd = new HandlingBrowserCommands();
		hndlng_browser_cmd.initializebrowser();
		hndlng_browser_cmd.basic_commands();

	}

}
