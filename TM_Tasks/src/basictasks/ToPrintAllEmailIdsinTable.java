package basictasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToPrintAllEmailIdsinTable {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> allitems=driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		
		for(WebElement ele:allitems)
		{
			System.out.println(ele.getText());
		}
		
		
		
		

	}

}
