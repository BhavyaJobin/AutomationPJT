package basePKG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class QueenGalaxyBase {
	public static WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.queengalaxycollections.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	}
}
