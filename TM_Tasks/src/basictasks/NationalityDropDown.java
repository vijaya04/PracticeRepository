package basictasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NationalityDropDown {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		WebElement ele=driver.findElement(By.xpath("//b[text()='My Info']"));
		
		Actions act_obj=new Actions(driver);
		
		act_obj.moveToElement(ele).build().perform();
		
		driver.findElement(By.xpath("//b[text()='My Info']")).click();
		
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		
		List<WebElement> allcountries=driver.findElements(By.xpath("(//select[@name='personal[cmbNation]']/child::option)[position()<=15]"));
		
		for(WebElement ele1:allcountries)
		{
			System.out.println(ele1.getText());
		}
		
		
		
		
		
		

	}

}
