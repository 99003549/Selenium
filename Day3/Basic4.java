import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basic4 {
	@BeforeMethod
	public void first()  {
		
	System.out.println("first");
		
		}
	@AfterMethod
	public void last()  {
		System.out.println("Last");
		}
	@Test
	public void a()  {
	System.out.println("a");
	}
	@Test
	public void b()  {
	System.out.println("b");
	}
	@Test
	public void c()  {
	System.out.println("c");
	}
}
	
