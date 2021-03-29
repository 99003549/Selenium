import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) throws Exception {
		System.out.println("welcome to selenium world");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		WebElement firstname=driver.findElement(By.id(""))

}
}