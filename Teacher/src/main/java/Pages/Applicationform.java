package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Teacher.Teacher.Execution;

public class Applicationform extends Execution{

	@FindBy (id = "id_full_name")
	WebElement fullname;
	
	
	@FindBy (id = "id_email")
	WebElement email;
	
	@FindBy (id = "id_phone")
	WebElement phone;
	
	@FindBy (xpath = "//*[@id=\"__next\"]/main/div/div/div/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/select")
	WebElement day;
	
	@FindBy (xpath = "//*[@id=\"__next\"]/main/div/div/div/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div/select")
	WebElement month;
	
	@FindBy (xpath = "//*[@id=\"__next\"]/main/div/div/div/div/div/div[2]/div[2]/div[2]/div[2]/div[3]/div/select")
	WebElement year;
	
	@FindBy (id = "gender_F")
	WebElement gender;
	
	@FindBy (id = "marital_status_MA")
	WebElement materialstatus;
	
	@FindBy (id = "math_stage_12+")
	WebElement grade;
	
	@FindBy (id = "relocation_plan_N")
	WebElement relocation;
	
	@FindBy (id = "id_postal_code")
	WebElement pincode;
	
	@FindBy(xpath= "//*[@id=\"__next\"]/main/div/div/div/div/div/div[2]/button")
	WebElement submitbutton;
	
	@FindBy(id = "id_otp")
	WebElement otp;
	
	@FindBy(id = "log-in")
	WebElement logn;
	
//	@FindBy(xpath = "s//div[contains(text(),'Invalid number')]")
//	WebElement validation;
//	
	public void fullname(String name) {
		fullname.sendKeys(name);
	}
	
	public void emailid(String emal) {
		email.sendKeys(emal);
	}
	
	public void phonenum(String number) {
		phone.sendKeys(number);
	}
	
	public void daydd() {
		Select sel= new Select(day);
		sel.selectByIndex(2);
	}
	
	public void month_m() {
		Select sel= new Select(month);
		sel.selectByIndex(5);
	}
	public void year_y() {
		Select sel= new Select(year);
		sel.selectByIndex(6);
	}
	public void gender_selection() {
		gender.click();
	}
	
	public void materialstatus_select() {
		materialstatus.click();
	}
	
	public void grade_selection() {
		grade.click();
	}
	
	public void relocation_plan() {
		relocation.click();
	}
	
	public void postalocde(String pin) {
		pincode.sendKeys(pin);
	}
	
	public void submitbutton() {
		submitbutton.click();
	}
	public void otpfld(String otpnum) {
		otp.sendKeys(otpnum);
	}
	
	public void login_button() {
		logn.click();
	}
	
//	public void validation_msg()
//	{
//		if(validation.isDisplayed())
//		{
//			System.out.println("wrong data enterted");
//		}
//	}
}

