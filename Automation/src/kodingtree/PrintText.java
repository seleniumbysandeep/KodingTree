package kodingtree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to print the text of fogot your password link present in actitime?

public class PrintText {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/ktree/login.do");
		String text = driver.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("onclick");
		System.out.println(text);
		driver.quit();	
	}
}
