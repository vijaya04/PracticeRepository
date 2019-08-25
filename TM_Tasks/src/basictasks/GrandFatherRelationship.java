package basictasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrandFatherRelationship {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://testingmasters.com/hrm");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ankit3");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
		driver.findElement(By.xpath("//a[text()='Emergency Contacts']")).click();
		List<WebElement> allitems=driver.findElements(By.xpath("//td[text()='Child']/preceding-sibling::td[2]/child::input[@type='checkbox']"));
		
		for(WebElement ele:allitems)
		{
			ele.click();
		}
	}

}
