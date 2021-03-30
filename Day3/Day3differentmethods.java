import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Day3differentmethods {
	WebDriver driver;
		@Test(priority = 1,description = "launch",alwaysRun = true)
		public void login1()  {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			
			}
		@Test(priority = 2,description = "logging in",dependsOnMethods = "login1")
		public void login()  {
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			}
		@Test(priority = 3,description = "logging out",enabled = false)
		public void logout()  {
		
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
			}
	}
