package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Teacher.Teacher.Execution;

public class teacherlogin extends Execution{
	
	@FindBy (xpath = "//*[@id=\"__next\"]/nav/div/div/div[4]/div/div[1]/a/button")
	WebElement becometeacherbutton;
	
	@FindBy (xpath = "//*[@id=\"__next\"]/main/div/div[2]/div/div[2]/a/button")
	WebElement applynow;
	
	
	
	public void becometeacher()
	{
		becometeacherbutton.click();
	}
	
	public void applynowbutton()
	{
		applynow.click();
	}
}
