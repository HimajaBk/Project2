package seleniumEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver obj1 = new FirefoxDriver();
		obj1.get("http://qaclickacademy.usefedora.com/");
		obj1.findElement(By.xpath("html/body/div[1]/center/a")).click(); 
		// Absolute Xpath with single slash. Start selection from document/node.
		// Doble slashes for Relative xpath .it selects the element from anywhre in the Document. 

	}

}
