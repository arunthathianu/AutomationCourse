package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElements extends Base{
	
	public void verifyCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement enter_msg = driver.findElement(By.id("single-input-field"));
		enter_msg.sendKeys("Hello");
		WebElement showmsgbtn_element = driver.findElement(By.id("button-one"));
		showmsgbtn_element.click();
		WebElement yourmsg = driver.findElement(By.id("message-one"));
		System.out.println(yourmsg.getText());
		System.out.println(yourmsg.getTagName());
		System.out.println(yourmsg.getCssValue("background-color"));
		enter_msg.clear();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingWebElements hndlngwebelements = new HandlingWebElements();
		hndlngwebelements.initializebrowser();
		hndlngwebelements.verifyCommands();
		

	}

}
