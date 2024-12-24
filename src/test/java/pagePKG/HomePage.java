package pagePKG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/header/div[2]/div/div/div/div[2]/nav/ul/li[1]/a")
	WebElement home;
	
	@FindBy(xpath="/html/body/section[3]/div/div[2]/div[2]/div/div[1]/a[4]/span/img")
	WebElement itemselect;
	
	@FindBy(xpath="/html/body/section[1]/div/div/div[2]/div/div[6]/div/span[2]")
	WebElement quantityin;
	
	@FindBy(xpath="//*[@id=\"add_cart_detail\"]")
	WebElement addtocart;
	
	@FindBy(xpath="/html/body/header/div[2]/div/div/div/div[3]/div/div/a/i")
	WebElement cart;
	
	@FindBy(xpath="/html/body/header/div[2]/div/div/div/div[3]/div/div/div/div/p[2]/a[1]")
	WebElement viewcart;
	
	@FindBy(xpath="//*[@id=\"coupon_code\"]")
	WebElement couponcode;
	
	@FindBy(xpath="/html/body/div[3]/div/form/table/tbody/tr[2]/td/div/button")
	WebElement applycode;
	
	@FindBy(xpath="/html/body/div[3]/div/form/table/tbody/tr[2]/td/a[2]")
	WebElement continueshop;
	
	@FindBy(xpath="//*[@id=\"collapseCategory\"]/div[1]/ul/li[9]/a")
	WebElement earring;
	
	@FindBy(xpath="//*[@id=\"collapseCategory\"]/div[1]/ul/li[9]/ul/li[2]/a")
	WebElement jimki;
	
	@FindBy(xpath="//*[@id=\"sort\"]")
	WebElement sort;
	
	@FindBy(xpath="/html/body/a[2]")
	WebElement whatsapp;
	
	@FindBy(xpath="//*[@id=\"action-button\"]")
	WebElement chat;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void testHome()
	{
		home.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String ExpectedTitle="Queen galaxy Collections";
		if(actualTitle.equalsIgnoreCase(ExpectedTitle))    //title verification
		{
			System.out.println("Title is Same");
		}
		else
			System.out.println("Title is not same");
		
	}
	public void scrollUpButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		System.out.println("Scroll");
	}
	
	public void itemselect()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		itemselect.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		quantityin.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		addtocart.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cart.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		viewcart.click();
	}
	
	public void addcoupon()
	{
		couponcode.sendKeys("qwert123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		applycode.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		continueshop.click();
	}
	
	public void babiesitems()
	{
		Actions act=new Actions(driver);
		act.moveToElement(earring).perform();
		jimki.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void sortBy()
	{
		Select sortby= new Select(sort);
		sortby.selectByVisibleText("Price -- High to Low");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void windowHandle()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)", "");
		String parentWin=driver.getWindowHandle();
		whatsapp.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Set<String> allWins=driver.getWindowHandles();
		System.out.println("parentwindow:  "+allWins);
		
		for(String handle:allWins)
		{
			if(!handle.equalsIgnoreCase(parentWin))
			{
				System.out.println("handle:  "+handle);
				driver.switchTo().window(handle);
				chat.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.close();
			}
			
			driver.switchTo().window(parentWin);
		}
		
		js.executeScript("window.scrollBy(0,-5000)", "");
	}

}
