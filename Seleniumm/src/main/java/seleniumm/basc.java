package seleniumm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Input;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\browser\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//Static drop dwon 
		WebElement staticddropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select sel= new Select(staticddropdown);
	//	sel.selectByIndex(3);
		sel.selectByVisibleText("AED");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i=1;
		while(i<4) {
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		//for(int i=1;i<5;i++) {
			//driver.findElement(By.id("hrefIncAdt")).click();

			
			
		}
		Thread.sleep(3000);
		//Dynamic dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		
		//driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='MAA'")).click();
		
		//Autosiggestive dropdwon
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option:options) {
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		
		driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("Input[type='checkbox']")).getSize());
		
	}

}
