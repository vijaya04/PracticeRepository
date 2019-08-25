package basictasks;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NOPRegistration {
	
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://demo.nopcommerce.com/register");
		
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Vijaya");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Allam");
		
		Select obj=new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
		obj.selectByVisibleText("4");
		
		Select obj1=new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
		obj1.selectByVisibleText("December");
		
		Select obj2=new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
		obj2.selectByVisibleText("1990");
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("gvlakshmi1990@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Winnow IT Services");

		driver.findElement(By.xpath("//input[@id='Newsletter']")).click();
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("hanvesh11");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("hanvesh11");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		//driver.quit();
	}


}
