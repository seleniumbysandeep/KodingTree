package kodingtree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to print the height and width of login button present in FB?
public class PrintHeightAndWidth {

	public static void main(String[] args)  {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    WebElement lgBtn = driver.findElement(By.name("login"));
	int height = lgBtn.getSize().getHeight();
    int width = lgBtn.getSize().getWidth();
    System.out.println("Height = "+height);
    System.out.println("Width = "+width);
    driver.quit();
	}

}
