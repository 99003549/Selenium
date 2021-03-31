import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day3TextEnter {
	public static void main(String[] args) {
		System.out.println("welcome to selenium world");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		//driver.switchTo().frame("singleframe");
		//driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Rehana");
		
		//driver.findElement(By.className("analystic")).click();
		

		driver.findElement(By.xpath("//section/div/div/div/div/div/div/ul/li[2]/a[@class=\"analystic\"]")).click();
		
		WebElement ele= driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[2]/iframe"));
		driver.switchTo().frame(ele);
		WebElement ele1= driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(ele1);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Rehana");
	}

}
