import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day22 {
	public static void main(String[] args) throws Exception {
		System.out.println("welcome to selenium world");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//cursor on leave
		WebElement ele=driver.findElement(By.linkText("Leave"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		WebElement e=driver.findElement(By.linkText("Entitlements"));
		Actions a= new Actions(driver);
		act.moveToElement(e).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveEntitlements\"]")).click();

}
}