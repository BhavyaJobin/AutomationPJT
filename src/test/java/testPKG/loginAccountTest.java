package testPKG;

import org.testng.annotations.Test;

import basePKG.QueenGalaxyBase;
import pagePKG.HomePage;
import pagePKG.loginAccount;

public class loginAccountTest extends QueenGalaxyBase{

	@Test (priority = 1)
	public void testloginaccount()
	{
		loginAccount la=new loginAccount(driver);
		la.accLogin();
	}
	
	@Test(priority = 2)
	public void testHomePage()
	{
		HomePage hp= new HomePage(driver);
		hp.testHome();
		hp.scrollUpButton();
		hp.itemselect();
		hp.addcoupon();
		hp.babiesitems();
		hp.sortBy();
		hp.windowHandle();
	}
}
