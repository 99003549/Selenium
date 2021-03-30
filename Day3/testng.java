import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testng {
	@Test
	public void login() throws Exception {
		System.out.println("welcome to selenium world");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/button")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

}
}
