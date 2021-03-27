import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("welcome to selenium world");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		/*
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();*/
		driver.findElement(By.className("form-control")).sendKeys("abcd");
		Thread.sleep(5000);
		driver.findElement(By.id("at-cv-lightbox-close")).click();/*
		driver.findElement(By.className("at4-close")).click();*/
		driver.findElement(By.className("btn-default")).click();
		
  
				
				
	}

}
