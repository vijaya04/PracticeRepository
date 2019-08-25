package basictasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableThirdRowFourthColumn {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		driver.manage().window().maximize();
		
		/*WebElement ele=driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]"));
		
		System.out.println(ele.getText());*/
		
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]")).getText());
		
		
		
	}

}
