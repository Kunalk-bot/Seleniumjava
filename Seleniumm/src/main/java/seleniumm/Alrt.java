package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alrt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\browser\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("alertbtn")).click();
       System.out.println (driver.switchTo().alert().getText());
       driver.switchTo().alert().accept();
       Thread.sleep(2000);
		driver.findElement(By.id("confirmbtn")).click();
	       System.out.println (driver.switchTo().alert().getText());
	       driver.switchTo().alert().dismiss();
	       


	}

}
