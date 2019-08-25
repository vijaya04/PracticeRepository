package basictasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AppoloMunichInsurance {
	
	public static void main(String[] args)
	{
		
	System.setProperty("WebDriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://buy.apollomunichinsurance.com/easy-health-individual");
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8765679876");
	
	
	
}

}