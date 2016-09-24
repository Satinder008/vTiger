import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class WebDriver_login {
	public static WebDriver eventDriver;
	
	public static void main(String[] args) {
		
		
		eventDriver=new FirefoxDriver();		
		
			eventDriver.get("http://localhost:100/");
		
			eventDriver.findElement(By.name("user_name")).sendKeys("admin");
			
			eventDriver.findElement(By.name("user_password")).sendKeys("admin");
			eventDriver.findElement(By.name("Login")).click();
		
			eventDriver.findElement(By.linkText("New Lead")).click();
			eventDriver.findElement(By.name("salutationtype")).sendKeys("Dr.");
			eventDriver.findElement(By.name("firstname")).sendKeys("Automation");
		
		
			eventDriver.findElement(By.linkText("Logout")).click();
		
		//driver.close();
		//driver.quit();

	}

}
