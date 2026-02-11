package kodingtree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to print the color of forgotten password link present in FB?
public class PrintColour {

	public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	String colour = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
	System.out.println(colour);	
	}

}
