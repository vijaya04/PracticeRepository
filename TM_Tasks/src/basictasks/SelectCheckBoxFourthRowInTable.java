package basictasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectCheckBoxFourthRowInTable {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Actions act_obj=new Actions(driver);
		
		WebElement move=driver.findElement(By.xpath("//b[text()='My Info']"));
		
		act_obj.moveToElement(move).build().perform();
		
		move.click();
		
		driver.findElement(By.xpath("//a[text()='Emergency Contacts']")).click();
		
		driver.findElement(By.xpath("//table/tbody/tr[4]/td[1]/input[@type='checkbox']")).click();
		
		
	
		

	}

}
