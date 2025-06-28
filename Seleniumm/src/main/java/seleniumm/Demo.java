package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class Demo implements WebDriver{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\browser\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]"))).build().perform();
		a.moveToElement(driver.findElement(By.id("gh-ac"))).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().contextClick().build().perform();
	}

}
