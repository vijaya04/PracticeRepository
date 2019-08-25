package basictasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectRejectedToEmpId {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		driver.findElement(By.xpath("//td[text()='S148101']/following-sibling::td[position()=6]/child::select/child::option[text()='Rejected']")).click();

	}

}
