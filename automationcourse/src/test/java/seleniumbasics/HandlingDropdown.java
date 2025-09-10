package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base{

	public void handle_DropDown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(dropdown);
		//select.selectByIndex(1);
		//select.selectByValue("python");
		select.selectByVisibleText("SQL");
		System.out.println(dropdown.isDisplayed());
		System.out.println(dropdown.isEnabled());
	}
	
	public void handle_Checkboxes()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox1.click();
		System.out.println(checkbox1.isSelected());
		System.out.println(checkbox1.isDisplayed());
		System.out.println(checkbox1.isEnabled());
	}
	
	public void handle_radiobutton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio_button = driver.findElement(By.xpath("//input[@value='green']"));
		radio_button.click();
		System.out.println(radio_button.isDisplayed());
		System.out.println(radio_button.isEnabled());
		System.out.println(radio_button.isSelected());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdown hndlng_DropDown = new HandlingDropdown();
		hndlng_DropDown.initializebrowser();
		//hndlng_DropDown.handle_DropDown();
		//hndlng_DropDown.handle_Checkboxes();
		hndlng_DropDown.handle_radiobutton();
	}

}
