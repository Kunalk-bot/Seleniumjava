package seleniumm;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wndowhaneling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\browser\\chromedriver-win64");
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\DELL\\eclipse-workspace\\browser\\geckodriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();//(.classname)
		Set<String> winid= driver.getWindowHandles();//parent ,child win id
		Iterator<String>it = winid.iterator();
		String parentid=it.next();
		String childid = it.next();
		driver.switchTo().window(childid);////// get the child winndow
		String emailid=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0].trim();   //[0]1st  [1]2nd
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(emailid);
		System.out.println(emailid);





	}

}
