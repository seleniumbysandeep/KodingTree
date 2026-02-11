package kodingtree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to check whether facebook logo is displayed or not?

public class VerifyLogoIsDisplayed {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(logo==true) {
			System.out.println("Logo is displayed and pass");
		}
		else
		{
			System.out.println("Logo is not displayed and fail");
		}
		driver.quit();		
	}
}
