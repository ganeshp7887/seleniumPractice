package seleniumConcepts;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;


public class WebDriverMethods {

	public static void main(String[] args) {
	
		initDriver init = new initDriver();
		
		WebDriver driver = init.openBrowser();
		
		init.setUrl();
		
		String findelement =  driver.findElement(By.xpath("//li[@class= 'dropdown']/a")).getText();		// Webdriver methods :- To find element in web page. returns first occurred element if multiple elements found in DOM.
		
		List<WebElement> findelements = driver.findElements(By.xpath("//li[@class= 'dropdown']/a"));	// WebDriver methods :- To find multiple webElements in web page.
		
		// driver.get("https://www.demo.guru99.com/v2/");											 	// Webdriver methods :- To navigate to url.
		
		String url = driver.getCurrentUrl(); 					 										// Webdriver methods :- To Get current url location.
		
		String pageSource = driver.getPageSource(); 			 										// Webdriver methods :- To get complete web page.
		
		String title = driver.getTitle(); 						 										// Webdriver methods :- To get web page title.
		
		String windowID = driver.getWindowHandle();  			 										// Webdriver methods :- To get id of currently working window.
		
		Set<String> wn = driver.getWindowHandles();    			 										// Webdriver methods :- To get list of windows on current sessions
		
		Options manage = driver.manage(); 						 										// Webdriver methods :- To perform web page operations like cookies, timeouts, and windows maximize, minimize.
				
		Navigation nav = driver.navigate(); 					 										// Webdriver methods :- To navigate web page forward backward or to move to url.
		
		TargetLocator switches = driver.switchTo(); 			 										// Webdriver methods :- To perform operations on alerts, frames and windows.
		
		
		System.out.println("The element multiple found but return first only : \t"+findelement);
		System.out.print("The elements are :\t");
		for (WebElement element : findelements) {
			System.out.print(element.getText()+"\t");
		}
		System.out.println();
		System.out.println("The url is : \t"+url);
		System.out.println("the title  is : \t"+title);
		System.out.println("the window id  is : \t"+windowID);
		
		for (String ss : wn) {
			System.out.println("the windows in current :\t"+ss);
		}
		
		System.out.println("the page source is : \t"+pageSource);
		
		if(driver != null) {
			driver.quit();
		}
	}
}
