import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class day21leaveapply {
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
		
		
		//leave type
		driver.findElement(By.xpath("//*[@id=\"menu_leave_applyLeave\"]")).click();
		
		Select dd=new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
		dd.selectByValue("9");
		
		//from date
		driver.findElement(By.xpath("//*[@id=\"applyleave_txtFromDate\"]")).click();
		Select d=new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
		d.selectByValue("1");
		Select d1=new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));
		d1.selectByValue("1998");
		driver.findElement(By.linkText("10")).click();
		
		
		//to date
		driver.findElement(By.xpath("//*[@id=\"applyleave_txtToDate\"]")).click();
		Select d2=new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
		d2.selectByValue("1");
		Select d3=new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));
		d3.selectByValue("1998");
		driver.findElement(By.linkText("16")).click();
		
		//apply
		driver.findElement(By.xpath("//*[@id=\"applyBtn\"]")).click();
}
}