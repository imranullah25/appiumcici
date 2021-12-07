package helping;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import junit.framework.Assert;

import page_objects.Home_PO;
import page_objects.Sign_in_PO;
import resources.BaseClass;

public class Sign_in_DoC_main extends BaseClass {

	@BeforeTest
	public void initialize() {
		try {

			driver = initialize_driver();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 1, enabled = true)
	public void Home_Page() throws InterruptedException {
		logger.info("Successfully landed on the Home Page");

		Home_PO prof = new Home_PO(driver);
		MobileElement profile_button = prof.profile_button();
		profile_button.click();
		logger.info("Successfully clicked on Profile Button");

	}

	@Test(priority = 2, enabled = true)
	public void Sign_in_to_DoC() throws InterruptedException {

		String user_email = "imran.ullah+10@wearenova.co.uk";
		String user_password = "Admin@123";

		logger.info("Successfully landed on Sign_in_to_DoC Page");

		Sign_in_PO sign = new Sign_in_PO(driver);

		MobileElement sign_in_to_DoC_text = sign.sign_in_to_DoC_text();
		Assert.assertEquals(sign_in_to_DoC_text.getText(), "Sign in to DoC");
		logger.info("Successful assertion of the text 'Sign in to DoC'");

		/*
		 * MobileElement new_to_doc_text = sign.new_to_doc_text();
		 * Assert.assertEquals(new_to_doc_text.getText(), "New to DoC?");
		 * logger.info("Successful assertion of the text 'New to DoC?'");
		 */

		MobileElement sign_up = sign.sign_up();
		Assert.assertEquals(sign_up.getText(), "Sign up");
		logger.info("Successful assertion of the text 'Sign up'");

		MobileElement email_text = sign.email_text();
		Assert.assertEquals(email_text.getText(), "Email");
		logger.info("Successful assertion of the text 'Email'");

		MobileElement email_input = sign.email_input();
		email_input.sendKeys(user_email);
		logger.info("Successfully entered the Email");

		MobileElement password_text = sign.password_text();
		Assert.assertEquals(password_text.getText(), "Password");
		logger.info("Successful assertion of the text 'Password'");

		MobileElement password_input = sign.password_input();
		password_input.sendKeys(user_password);
		logger.info("Successfully entered the Password");

		MobileElement forgot_password_text = sign.forgot_password_text();
		Assert.assertEquals(forgot_password_text.getText(), "Forgot password");
		logger.info("Successful assertion of the text 'Forgot password'");

		MobileElement sign_in_button = sign.sign_in_button();
		Assert.assertEquals(sign_in_button.getText(), "Sign in");
		logger.info("Successful assertion of the text 'Sign in'");

		sign_in_button.click();
		logger.info("Successfully clicked on the Sign in Botton");
	}
}