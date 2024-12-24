package pagePKG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreateAccount {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/header/div[2]/div/div/div/div[1]/div/a/img")
	WebElement logo;
	
	@FindBy(xpath="/html/body/header/div[2]/div/div/div/div[3]/div/a[1]/i")
	WebElement myAccbutton;
	
	@FindBy(xpath="//*[@id='container']/div[1]/div/form/input[2]")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"container\"]/div[1]/div/form/input[3]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"container\"]/div[1]/div/form/input[4]")
	WebElement phno;
	
	@FindBy(xpath="//*[@id=\"container\"]/div[1]/div/form/input[5]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"container\"]/div[1]/div/form/button")
	WebElement signupbutton;
	
	public CreateAccount(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void myAccCreation()
	{
		myAccbutton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void signUp()
	{
		name.sendKeys("Bhavya");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		email.sendKeys("bhavyaayinikkal@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		phno.sendKeys("7903494189");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		password.sendKeys("Queeng@laxy@123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		signupbutton.click();
		
		boolean b=logo.isDisplayed();
		Assert.assertTrue(b);
		
		if(b==true)
			System.out.println("Logo is available");
		else
			System.out.println("Logo is not available");
	}
}
