package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base{
	
	public void fileuploadusingsendkeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement choosefile = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		choosefile.sendKeys("D:\\Obsqura\\Automation Mven Projects\\src\\test\\resources\\4313264810_Chakki 24012025.pdf");
		WebElement terms = driver.findElement(By.xpath("//input[@id='terms']"));
		terms.click();
		WebElement submit_btn = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submit_btn.click();
	}
	
	public void fileUploadUsingKeyBoard() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement upload = driver.findElement(By.id("pickfiles"));
		upload.click();
		StringSelection selection =  new StringSelection("D:\\Obsqura\\Automation Mven Projects\\src\\test\\resources\\4313264810_Chakki 24012025.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		//Toolkit-java.awt provide panra abstract class, clipboard is copied content is saved in one place
		Robot robot= new Robot();
		//For handling the operating time and no error occur
		robot.delay(2500);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease (KeyEvent.VK_ENTER);
		robot.keyPress (KeyEvent.VK_CONTROL);
		robot.keyPress (KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload file_upload = new FileUpload();
		file_upload.initializebrowser();
		//file_upload.fileuploadusingsendkeys();
		
		try {
			file_upload.fileUploadUsingKeyBoard();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
