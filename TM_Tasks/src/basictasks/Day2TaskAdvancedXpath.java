package basictasks;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day2TaskAdvancedXpath {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://www.testingmasters.com/hrm");
        
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("ankit3");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Actions act_obj=new Actions(driver);
		
		act_obj.moveToElement(driver.findElement(By.xpath("//b[text()='My Info']"))).build().perform();
		
		driver.findElement(By.xpath("//b[text()='My Info']")).click();
		
		driver.findElement(By.xpath("//a[text()='Emergency Contacts']")).click();
		
		driver.findElement(By.xpath("//td[text()='GrandFather']/preceding-sibling::td/child::input[@name='chkecontactdel[]']")).click();
		
		driver.findElement(By.xpath("//a[text()='kouser']/parent::td/preceding-sibling::td/child::input[@type='checkbox']")).click();
		
		driver.close();
	}
}