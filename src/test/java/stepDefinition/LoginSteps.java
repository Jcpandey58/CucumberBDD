package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Clock;
import java.time.Duration;

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


	@When("user click on books")
	public void userClickOnBooks() {
		driver.findElement(By.xpath("//ul[@class='top-menu']/li/a[contains(text(),'Books')]")).click();
		System.out.println("Book page opened");
	}

	@When("click Health Book link")
	public void clickHealthBookLink() {
		driver.findElement(By.xpath("(//a[text()='Health Book'])[2]")).click();
		System.out.println("Health Book is Clicked");
	}

	@Then("click add to cart button")
	public void clickAddToCartButton() {
		driver.findElement(By.id("add-to-cart-button-22")).click();
		System.out.println("Success fully added to your shopping cart");
	}

	@Then("success message  should be displayed")
	public void successMessageShouldBeDisplayed() throws InterruptedException {

	Thread.sleep(2000);
	WebElement success = driver.findElement(By.xpath("//div[@id='bar-notification']/p"));

	String successMsg=success.getText();
	System.out.println(successMsg);
	}

	@When("user click on rigistre button")
	public void userClickOnRigistreButton() {
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		System.out.println("Register Button clicked Success fully");
	}

	@When("click on radio button")
	public void clickOnRadioButton() {
		driver.findElement(By.xpath("//input[@name='Gender']")).click();
		System.out.println("Radio Button clicked Success fully");
	}


	@Then("enter firstname")
	public void enterFirstname() {
		driver.findElement(By.id("FirstName")).sendKeys("dharun");
		System.out.println("FirstName Benter Success fully");
	}

	@Then("enter lastname")
	public void enterLastname() {
		driver.findElement(By.id("LastName")).sendKeys("A");
		System.out.println("LastName enterSuccess fully");
	}

	@Then("enter Mailid")
	public void enterMailid() {
		driver.findElement(By.id("Email")).sendKeys("TESTBDD@123.COM");
		System.out.println("Email enter Success fully");
	}

	@Then("ender the password")
	public void enderThePassword() {
		driver.findElement(By.id("Password")).sendKeys("TESTB12");
		System.out.println("Password enter Success fully");
	}

	@Then("enter Confirm password")
	public void enterConfirmPassword() {
		driver.findElement(By.id("ConfirmPassword")).sendKeys("TESTB12");
		System.out.println("ConfirmPassword enter Success fully");
	}

	@Then("click on register button")
	public void clickOnRegisterButton() {
		driver.findElement(By.id("register-button")).click();
		System.out.println("register-button clicked Success fully");
		WebElement errormsg = driver.findElement(By.xpath("//li[text()='The specified email already exists']"));
		Assert.assertEquals(errormsg.getText(),"The specified email already exists");
	}

}
