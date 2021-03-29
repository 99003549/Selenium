import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	public static void main(String[] args) {
		System.out.println("welcome to selenium world");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_maintenance_purgeEmployee\"]/b")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_maintenance_accessEmployeeData\"]")).click();
		driver.findElement(By.id("confirm_password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"frmPurgeEmployeeAuthenticate\"]/div/div/input")).click();
		driver.findElement(By.id("employee_empName")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"frmAccessEmployeeData\"]/div/div/input")).click();
		
	}

}
