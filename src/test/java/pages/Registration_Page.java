package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Register_Base;

public class Registration_Page  {
	WebDriver driver;
	public Registration_Page(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "gender-male")
	WebElement gender;
	@FindBy(id = "FirstName")
	WebElement firstname;
	@FindBy(id = "LastName")
	WebElement lastname;
	@FindBy(id = "Email")
	WebElement email;
	@FindBy(id = "Password")
	WebElement password;
	@FindBy(id = "ConfirmPassword")
	WebElement cpassword;
	@FindBy(id = "register-button")
	WebElement register;
	
	
	
	public void selectGender() {
		gender.click();
	}

	public void enterFname(String fname) {
		firstname.sendKeys(fname);
	}

	public void enterLname(String lname) {
		lastname.sendKeys(lname);
	}

	public void enterEmail(String emaill) {
		email.sendKeys(emaill);
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void enterCPwd(String cpwd) {
		cpassword.sendKeys(cpwd);
	}

	public void clickReg() {
		register.click();
	}
}
