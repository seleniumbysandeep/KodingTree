package kodingtree;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//WAS to copy the text from one textbox and paste it into another textbox

public class CopyPaste {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/sande/OneDrive/Desktop/XpathByAttribute.html");
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(Keys.CONTROL+"ac");
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Keys.CONTROL+"av");
	driver.close();
	}

}
