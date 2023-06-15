package stepDefinations;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Register_Base;
import io.cucumber.java.en.*;
import pages.Registration_Page;
public class RegisterSteps  {
	public WebDriver driver;
	public Registration_Page p;
	
	@Test
	@Given("user in register page with url {string}")
	public void user_in_register_page_with_url(String url) {
		driver = new ChromeDriver();
		p=new Registration_Page(driver);
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user chose male")
	public void user_chose_male() {
//	    p.selectGender();
		p.selectGender();
	}

	@When("user enter first name {string}")
	public void user_enter_first_name(String fname) {
	   p.enterFname(fname);
	}

	@When("user enter last  name {string}")
	public void user_enter_last_name(String lname) {
	    p.enterLname(lname);
	}

	@When("chose date of birth")
	public void chose_date_of_birth() {
		System.out.println("date of birth");
	}

	@When("enter E-meil address {string}")
	public void enter_e_meil_address(String emaill) {
	    p.enterEmail(emaill);
	}

	@When("company name  {string}")
	public void company_name(String string1) {
	    System.out.println(string1);
	}

	@When("select newsletter checkbox")
	public void select_newsletter_checkbox() {
	    System.out.println("news");
	}

	@When("enter password {string}")
	public void enter_password(String pwd) {
	    p.enterPassword(pwd);
	}

	
	@When("enter conform password {string}")
	public void enter_conform_password(String cpwd) {
	    p.enterCPwd(cpwd);
	}

	@Then("user should be register\\(your registeration completed)")
	public void user_should_be_register_your_registeration_completed() {
	    p.clickReg();
	   
	}

	

}
