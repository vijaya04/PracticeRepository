package basictasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintAllCountries {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/mercuryreservation.php?osCsid=9cfa66acfaf7c05b8782ecb279afb54b");
		
		List<WebElement> allcities=driver.findElements(By.xpath("//select[@name='fromPort']/child::option"));
		
		for(WebElement ele:allcities)
		{
			System.out.println(ele.getText());
		}
		
		
	}

}
