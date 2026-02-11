package kodingtree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGetCurrentUrl {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String eUrl = "https://www.selenium.dev/";
		String aUrl = driver.getCurrentUrl();
		if(eUrl.equals(aUrl)) {
			System.out.println("Url is successfully navigating and pass");
		}
		else {
			System.out.println("Url is not successfully navigating and fail");
		}
		driver.quit();
	}
}
