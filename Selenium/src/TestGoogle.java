import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {

		  public static void main(String[] args) {

		        System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		        WebDriver driver = new ChromeDriver();              
		        driver.get("https://login.yahoo.com/");
driver.findElement(By.name("username")).sendKeys("harshitdubey408@yahoo.com");
driver.findElement(By.id("login-signin")).click();;
driver.findElement(By.id("login-passwd")).sendKeys("9876Hars1234");
driver.findElement(By.name("signin"));
String url = driver.getCurrentUrl();
if(url.equals("https://www.yahoo.com"))
{
System.out.println("Successful");	
}
else {System.out.println("Unsuccesful");}
//driver.close();
 }
	}
