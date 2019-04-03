package Teacher.Teacher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Applicationform;
import Pages.teacherlogin;
import io.github.bonigarcia.wdm.WebDriverManager;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class Execution
{
	protected static WebDriver driver;



	//Opening browser and hit the url
	@BeforeTest
	public void setup() {
		
//		System.setProperty("webdriver.chrome.driver", "/Users/swathi/Downloads/chromedriver");
	    WebDriverManager.chromedriver().setup();
	    ChromeOptions ChromeOptions = new ChromeOptions();
	    //ChromeOptions.addArguments("--headless", "window-size=1024,768", "--no-sandbox");

		driver = new ChromeDriver(ChromeOptions);
		driver.get("http://website.staging.cuemath.com/");
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public void teacher_application() throws InterruptedException {
		teacherlogin tl = PageFactory.initElements(driver, teacherlogin.class);
		Applicationform ap= PageFactory.initElements(driver, Applicationform.class);
		tl.becometeacher();
		Thread.sleep(1000L);
		tl.applynowbutton();
		Thread.sleep(1000L);
		ap.fullname("dabba");
		ap.emailid("sw@cuemath.com");
		ap.phonenum("9098980890");
		ap.daydd();
		Thread.sleep(1000L);
		ap.month_m();
		Thread.sleep(1000L);
		ap.year_y();
		ap.gender_selection();
		ap.materialstatus_select();
		ap.grade_selection();
		ap.relocation_plan();
		ap.postalocde("560044");
		Thread.sleep(1000L);
		ap.submitbutton();
		//ap.validation_msg();
		Thread.sleep(1000L);
		ap.otpfld("8466");
		ap.login_button();
		
		
	}
	
}
