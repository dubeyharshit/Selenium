
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Methods {

		  public static void main(String[] args) {
			 {
		        System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		        WebDriver driver = new ChromeDriver();              
		        driver.get("http://seleniumhq.github.io/selenium/docs/api/java/");
//Select drop = new  Select (driver.findElement(By.id("flight-children")));
//drop.selectByIndex(2);
//List<WebElement> a = drop.getOptions();
//int d = a.size();
//System.out.println(d);
		        try {
		        driver.manage().window().maximize();
		        driver.switchTo().frame("packageListFrame");
		        driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		        driver.switchTo().defaultContent();
		        Thread.sleep(100);
		        driver.switchTo().frame("packageFrame");
		        driver.findElement(By.linkText("CommandProcessor")).click();
		        driver.switchTo().defaultContent(); 
		        }
		        catch (Exception e){
		        	e.printStackTrace();
		        }
		        }
	}
}
