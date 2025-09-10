package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base{
	
	public void simplealerts()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleclick = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleclick.click();
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		simpleAlert.accept();		
	}
	
	public void verfiyConfirmAlerts()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmclick = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmclick.click();
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println(confirmAlert.getText());
		//confirmAlert.accept();
		confirmAlert.dismiss();
	}
	
	public void verifyPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptclick = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptclick.click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Arunthathi");
		//promptAlert.accept();
		promptAlert.dismiss();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingAlerts handlingalerts = new HandlingAlerts();
		handlingalerts.initializebrowser();
		//handlingalerts.simplealerts();
		//handlingalerts.verfiyConfirmAlerts();
		handlingalerts.verifyPromptAlert();

	}

}
