package kodingtree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to check whether un and pw textbox are properly aligned or not?

public class VerifyAlignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/ktree");
		int x1 = driver.findElement(By.id("username")).getLocation().getX();
		int x2 = driver.findElement(By.name("pwd")).getLocation().getX();
		if(x1==x2) {
			System.out.println("un and pw textbox are properly aligned and pass");
		}
		else {
			System.out.println("un and pw textbox are not properly aligned and fail");
		}
		driver.quit();
	}
}
