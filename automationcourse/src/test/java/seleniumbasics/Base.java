package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public WebDriver driver;
	
	public void initializebrowser()
	{
		driver = new ChromeDriver();
		//driver = new EdgeDriver();
		//driver = new FirefoxDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
		driver.getTitle();
	}
	
	public void navigation()
	{
		driver.navigate().to("https://www.google.co.in");
		driver.navigate().back();
	}
	
	public void browserclose()
	{
		driver.close();	//tab
		driver.quit();	//window
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
		base.initializebrowser();
		base.navigation();
		base.browserclose();
	}

}
