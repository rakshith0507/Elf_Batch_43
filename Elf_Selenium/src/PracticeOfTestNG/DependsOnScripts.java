package PracticeOfTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnScripts {
	@Test(dependsOnMethods = "registerAccount")

	public void createAccount() {
		Reporter.log("From createAccount",true);
		
	}
	@Test
	public void registerAccount() {
		Reporter.log("From registerAccount",true);
		
	}
	@Test(dependsOnMethods = {"createAccount","modifyAccount"})
	public void deleteAccount() {
		Reporter.log("From deleteAccount",true);
		
	}
	@Test (dependsOnMethods = "createAccount")
	public void modifyAccount() {
		Reporter.log("From modifyAccount",true);
		int i=1/0;
		
	}
	@Test(dependsOnMethods = "createAccount")
	public void amountTransfer() {
		Reporter.log("From amountTransfer",true);
		
	}

}
