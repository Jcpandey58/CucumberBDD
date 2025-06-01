package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	

	@Before
	public void setUp() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	}

	
	@Given("User navigates to application")
	public void userShouldNavigatetoApplication() {
		driver.get("https://demowebshop.tricentis.com");
		System.out.println("Url opened");
	}
	@Given("User clicks the login link")
	public void userClicksTheLoginLink() {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		System.out.println("Login link clicked");
	}

	@When("User Enter the username as TESTBDD@123.COM")
	public void userEnterTheUsernameAs() {
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("TESTBDD@123.COM");
		System.out.println("UN Entrered as 'TESTBDD@123.COM'");
	}

	@When("User enters the password as testBDD")
	public void userEntersThePasswordAs() {
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("testBDD");
		System.out.println("UN Entrered as 'testBDD'");
		}

	@Then("User click the login button")
	public void userClickTheLoginButton() {
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("Login Button Clicked");
	}

	@Then("login should be success")
	public void loginShouldBeSuccess() {
		driver.findElement(By.xpath("//div[@class='header-links']/ul/li/a[contains(text(),'@')]"));
		System.out.println("Login Success");
	}

	@Then("login should be failed")
	public void loginShouldBeFailed() {
		System.out.println("At implementation");
	}
}
