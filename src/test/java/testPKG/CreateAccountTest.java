package testPKG;

import org.testng.annotations.Test;

import basePKG.QueenGalaxyBase;
import pagePKG.CreateAccount;

public class CreateAccountTest extends QueenGalaxyBase{

	@Test
	public void testcreateAccount()
	{
		CreateAccount ca=new CreateAccount(driver);
		ca.myAccCreation();
		ca.signUp();
	}
}
