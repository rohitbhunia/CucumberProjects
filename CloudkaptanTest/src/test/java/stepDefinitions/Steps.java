package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps {
	
	WebDriver driver; 

	@Given("the user is on CloudKaptan HomePage")
	public void the_user_is_on_CloudKaptan_HomePage() {
		driver = new ChromeDriver();
		driver.get("https://www.cloudkaptan.com/en");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
	    
	}

	@And("the user clicks on Contact Page")
	public void the_user_clicks_on_Contact_Page() {
		driver.findElement(By.xpath("//button[@id='acceptBtn']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Contact']")).click();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    
	}

	@When("user enters <Company> and <Country> and <FirstName> and <LastName> and <Email> and <Mobile> and <lookingFor>")
	public void user_enters_company_and_country_and_first_name_and_last_name_and_email_and_mobile_and_looking_for() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("rohit");
	    driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("bhunia");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sriju@gmail.com");
	    driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("888888888");
	    driver.findElement(By.xpath("//input[@id='company']")).sendKeys("capgemini");
	    driver.findElement(By.xpath("//input[@placeholder='Enter Your Designation']")).sendKeys("QA");
	    driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
	    driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Automation Test Engineer");
	    driver.findElement(By.xpath("//*[contains(@for,'Consent 1')]")).click();
	    driver.findElement(By.xpath("//label[@for='Consent 2']")).click();
	    
	}



}
