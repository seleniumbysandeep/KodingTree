package kodingtree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to print the htmlcode of the web page ?

public class PrintHtmlSourceCode {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	String	htmlCode=driver.getPageSource();
	System.out.println(htmlCode);
	driver.quit();
	
	}

}
