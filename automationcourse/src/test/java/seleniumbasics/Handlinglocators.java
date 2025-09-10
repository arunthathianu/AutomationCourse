package seleniumbasics;

import org.openqa.selenium.By;

public class Handlinglocators extends Base{
	
	public void verifylocators()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.findElement(By.id("button-one"));
		driver.findElement(By.className("btn btn-primary"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple Form"));
		driver.findElement(By.cssSelector("button[id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//button[text()='Get Total']"));
		driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]"));
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handlinglocators locate = new Handlinglocators();
		locate.initializebrowser();
	}

}
