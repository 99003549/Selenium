import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day2draganddrop {
	public static void main(String[] args) {
		System.out.println("welcome to selenium world");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement drag1=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement drop1=driver.findElement(By.id("//*[@id=\"fourth\"]/a"));
		Actions act= new Actions(driver);
		act.dragAndDrop(drag1, drop1);
		
		
	}

}
