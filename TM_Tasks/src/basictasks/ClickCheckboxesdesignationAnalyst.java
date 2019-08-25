package basictasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickCheckboxesdesignationAnalyst {

	public static void main(String[] args) {
		
        WebDriver driver=new FirefoxDriver();
		
		driver.get("http://testingmasters.weebly.com/webtables.html");
		driver.manage().window().maximize();
		
		
		List<WebElement> allitems=driver.findElements(By.xpath("//table/tbody/tr/td[7][text()>8]"));
		
		System.out.println(allitems.size());
		
		for(WebElement ele:allitems)
		{
			ele.click();
		}
	}

}
  