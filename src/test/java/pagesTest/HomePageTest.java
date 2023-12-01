package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	@Test(enabled = true, priority = 01)
	public void signUpButton() throws InterruptedException {
		homePage.clickSignUpButton();
	}

	@Test(enabled = false, priority = 02)
	public void EnterYourEmailButtonTest() throws InterruptedException {
		homePage.clickSignUpButton();
		homePage.clickEnterYourEmailButton();
	}

	@Test(enabled = false, priority = 03)
	public void condoButton() throws InterruptedException {
		homePage.clickCondoButton();
	}

	@Test(enabled = false, priority = 04)
	public void rentersButton() throws InterruptedException {
		homePage.clickRentersButton();
	}

	@Test(enabled = false, priority = 05)
	public void LoginButtonTest() throws InterruptedException {
		homePage.clickLoginButton();
	}
}
