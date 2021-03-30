import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class basicbeforeclass {
	@BeforeClass
	public void first()  {
		
	System.out.println("first");
		
		}
	@AfterClass
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
