package kodingtree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to remove the text present in the textbox in static webpage?

public class RemoveText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sande/OneDrive/Desktop/XpathByAttribute.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
		
	}
}
