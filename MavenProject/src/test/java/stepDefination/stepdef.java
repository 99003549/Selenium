package stepDefination;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {
	WebDriver driver;
	@Given("I will launch chrome browser")
	public void i_will_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver.exe");
		 driver=new ChromeDriver();
	
	}

	@Given("I enter url")
	public void i_enter_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	   
	}

	@When("I enter username")
	public void i_enter_username() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	   
	}

	@When("I enter password")
	public void i_enter_password() {
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	}

	@When("Iclick on login button")
	public void iclick_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	   
	}

	@Then("I should see the home screen")
	public void i_should_see_the_home_screen() {
	   
	}
}
