import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day12 {
public static void main(String[] args) throws Exception {
	System.out.println("welcome to selenium world");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	
	//maximize window
	driver.manage().window().maximize();
	
	
	Select dd=new Select(driver.findElement(By.id("select-demo")));
	dd.selectByVisibleText("Sunday");
	Thread.sleep(5000);
	dd.selectByValue("Friday");
	Thread.sleep(5000);
	dd.selectByIndex(3);
	Thread.sleep(5000);

	
	Select d=new Select(driver.findElement(By.id("multi-select")));
	d.selectByValue("California");
	Thread.sleep(5000);
	d.selectByValue("Florida");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"printMe\"]")).click();
	Thread.sleep(5000);
	
	
	driver.close();
}
}
