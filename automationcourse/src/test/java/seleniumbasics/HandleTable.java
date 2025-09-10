package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleTable extends Base{
	
	public void verifyTableCommands()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table = driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(table.getText());
		System.out.println("\n");
		WebElement row = driver.findElement(By.xpath("//table[@id=\"dataTable\"]/tbody/tr[4]"));
		System.out.println(row.getText());
		System.out.println("\n");
		WebElement col = driver.findElement(By.xpath("//table[@id=\"dataTable\"]/tbody/tr[4]/td[2]"));
		System.out.println(col.getText());
		System.out.println("\n");
		WebElement lastRow = driver.findElement(By.xpath("//table[@id=\"dataTable\"]/tbody/tr[last()]"));
		System.out.println(lastRow.getText());
		System.out.println("\n");
		WebElement lastCol = driver.findElement(By.xpath("//table[@id=\"dataTable\"]/tbody/tr[4]/td[last()]"));
		System.out.println(lastCol.getText());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandleTable handle_table = new HandleTable();
		handle_table.initializebrowser();
		handle_table.verifyTableCommands();
	}

}
