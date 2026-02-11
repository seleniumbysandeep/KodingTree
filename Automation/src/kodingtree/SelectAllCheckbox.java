package kodingtree;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckbox {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/sande/OneDrive/Desktop/XpathByAttribute.html");
	List<WebElement> allCHKbx = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=0;i<allCHKbx.size();i++) {
		Thread.sleep(1000);
		allCHKbx.get(i).click();
	}
	}

}
