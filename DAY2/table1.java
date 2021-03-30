import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table1 {
	public static void main(String[] args) throws Exception {
		System.out.println("welcome to selenium world");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[5]/td[4]"));
		String tabletxt = ele.getText();
		System.out.println(tabletxt);
		

}
}

