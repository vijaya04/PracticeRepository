package basictasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintMoileNumberWhoseDesignationAnalyst {
	
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		List<WebElement> allitems=driver.findElements(By.xpath("//td[text()='Analyst']/following-sibling::td[position()=1]"));
		
		for(WebElement ele:allitems)
		{
			System.out.println(ele.getText());
			
		}
		
	}

}
