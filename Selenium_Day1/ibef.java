import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ibef {
public static void main(String[] args) throws Exception {
	System.out.println("welcome to selenium world");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.ibef.org/ibefusers/signUpRequest");
	
	driver.findElement(By.xpath("//*[@id=\"userSignUpForm\"]/div/div/div[1]/ul/li[1]/div/div/div/a")).click();
	Thread.sleep(5000);

	driver.findElement(By.id("signupFname")).sendKeys("abcd");
	driver.findElement(By.id("signupLname")).sendKeys("efgh");
	driver.findElement(By.xpath("//*[@id=\"userSignUpForm\"]/div/div/div[2]/ul[1]/li/span[2]/span/a")).click();
	driver.findElement(By.id("signupEmail")).sendKeys("efgh.abcmail.com");
	driver.findElement(By.id("signupPassword")).sendKeys("K$gaurav");
	driver.findElement(By.id("signupCPassword")).sendKeys("K$gaurav");
	driver.findElement(By.id("signupUserOrg")).sendKeys("ltts");
	driver.findElement(By.id("signupUserContact")).sendKeys("9121912101");
	/*Select dd=new Select(driver.findElement(By.id("signupUserCountry")));
	dd.selectByValue("84");
	Thread.sleep(5000);*/
	driver.findElement(By.className("captchaContainer")).sendKeys("3918");
	driver.findElement(By.id("signUpTerms")).click();
	driver.findElement(By.id("submitSignUpForm")).click();
	
	
	
	
}
}