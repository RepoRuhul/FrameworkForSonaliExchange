package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	@Test(enabled = true, priority = 01)
	public void signUpButton() throws InterruptedException {
		homePage.clickSignUpButton();
	}

	@Test(enabled = true, priority = 02)
	public void EnterYourEmailButtonTest() throws InterruptedException {
		homePage.clickSignUpButton();
		homePage.clickEnterYourEmailButton();
	}

}
