import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	 public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
	        WebDriver driver = new ChromeDriver();              
	        driver.get("http://www.carmax.com/");
	        
	    Actions builder	 = new Actions(driver);
	    WebElement menuElement  = driver.findElement(By.linkText("Sell Us Your Car"));
	        builder.moveToElement(menuElement).build().perform();
	        driver.findElement(By.linkText("FAQ")).click();;
	        Thread.sleep(5000);
	        driver.close();
	       /*String s = driver.getWindowHandle();
	       System.out.println(s);
	       int[] a = {1,2,3,4,5,6};
	    */
	        }
}
