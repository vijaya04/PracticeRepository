package basictasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintEmpIdWhoseMoreThan8 {

	public static void main(String[] args) {
		
		
      FirefoxDriver driver=new FirefoxDriver();
    
		driver.get("http://testingmasters.weebly.com/webtables.html");
		
		//List<WebElement> rows=driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr"));
		
		//System.out.println(rows.size());
		
		
		List<WebElement>  days=driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr/td[7][text()>='8']/preceding-sibling::td[position()=5]"));
		
		for(WebElement ele:days)
		{
			
			
			
				//WebElement  str1=driver.findElement(By.xpath("//table[@id='VisitingTable']/tbody/tr/td[7][text()>='8']/preceding-sibling::td[position()=5]"));
				System.out.println(ele.getText());
				
				
			
					
					
					
				
				}
			
			
	  
		}
		
		
		
		 
		}
		
		

	


