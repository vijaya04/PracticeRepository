package basictasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHrmEmergencyContacts1 {

	public static void main(String[] args) throws InterruptedException {
		
            WebDriver driver = new FirefoxDriver();
			driver.get("http://www.testingmasters.com/hrm");
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
			driver.findElement(By.xpath("//input[@name='Submit']")).click();
			driver.findElement(By.xpath("//b[text()='My Info']")).click();
			driver.findElement(By.xpath("//a[text()='Immigration']")).click();
			driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
			driver.findElement(By.xpath("//input[@id='immigration_passport_issue_date']")).click();
			driver.findElement(By.xpath("//input[@id='immigration_passport_issue_date']")).sendKeys("2017-03-14");
			driver.findElement(By.xpath("//label[text()='Expiry Date']")).click();
			driver.findElement(By.xpath("//label[@for='immigration_passport_expire_date']")).sendKeys("2020-03-14");
			//driver.findElement(By.xpath("//a[text()='Welcome mohammed']")).click();
			
			WebElement ele=driver.findElement(By.xpath("//a[text()='Logout']"));
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			
			
			js.executeScript("arguments[0].click();", ele);
			
			//driver.findElement(By.xpath("//a[text()='Logout']")).click();
			
			
			
		

	}

}
