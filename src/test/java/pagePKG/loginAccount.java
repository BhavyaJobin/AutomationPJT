package pagePKG;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginAccount {
WebDriver driver;
	
	@FindBy(xpath="/html/body/header/div[2]/div/div/div/div[3]/div/a[1]/i")
	WebElement myAccbutton;
	
	@FindBy(xpath="//*[@id=\"signIn\"]")
	WebElement signIn;
	
	@FindBy(xpath="//*[@id=\"container\"]/div[2]/div/form/input[2]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"container\"]/div[2]/div/form/input[3]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"container\"]/div[2]/div/form/button") 
	WebElement signinbutton;
	
	public loginAccount(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 public void accLogin() 
	 {
		 myAccbutton.click();	 
		 signIn.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 email.sendKeys("bhavyaayinikkal@gmail.com");
		 password.sendKeys("Queeng@laxy@123");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 signinbutton.click();
	 }
}
