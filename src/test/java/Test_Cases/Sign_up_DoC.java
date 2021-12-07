package Test_Cases;


import java.util.Random;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.appium.java_client.MobileElement;

import junit.framework.Assert;

import page_objects.Home_PO;
import page_objects.Sign_in_PO;
import page_objects.Sign_up_PO;
import resources.BaseClass;

public class Sign_up_DoC extends BaseClass {

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

		logger.info("Successfully landed on Sign_in_to_DoC Page");

		Sign_in_PO sign = new Sign_in_PO(driver);

		MobileElement sign_up_text = sign.sign_up();
		Assert.assertEquals(sign_up_text.getText(), "Sign up");
		logger.info("Successful assertion of the text 'Sign up'");

		MobileElement sign_up = sign.sign_up();
		sign_up.click();
		logger.info("Successfully clicked on Sign up Button");

	}

	@Test(priority = 3, enabled = true)
	public void Sign_up() throws InterruptedException {

		String first_name = "John";
		String surname = "Smith";
		String mobile = "03219876543";
	//	String pass = "Admin@123";
	//	String confirm_pass = "Admin@123";
		
		// create instance of Random class
		Random rand = new Random();

		// Generate random integers in range 0 to 999
		int rand_int1 = rand.nextInt(10000);

		String email_id = "xyz";
		String u_email = email_id + "+" + rand_int1 + "@example.com";
		System.out.println("New User's Email ID = " + u_email);

		logger.info("Successfully landed on Sign_up Page");

		Sign_up_PO signup = new Sign_up_PO(driver);
		// MobileElement sign_up_text = signup.sign_up_text();
		// Assert.assertEquals(sign_up_text.getText(),"Sign up");
		logger.info("Successful assertion of the header text 'Sign up'");

		MobileElement order_to_text = signup.order_to_text();
		Assert.assertEquals(order_to_text.getText(),
				"In order to confirm a consultation, you need to fill in the form below.");
		logger.info(
				"Successful assertion of the sentence 'In order to confirm a consultation, you need to fill in the form below.'");

		MobileElement first_name_text = signup.first_name_text();
		Assert.assertEquals(first_name_text.getText(), "First name");
		logger.info("Successful assertion of the text 'First name'");

		MobileElement first_name_input = signup.first_name_input();
		first_name_input.sendKeys(first_name);
		logger.info("Successfully entered the 'First name'");

		MobileElement surname_text = signup.surname_text();
		Assert.assertEquals(surname_text.getText(), "Surname");
		logger.info("Successful assertion of the text 'Surname'");

		MobileElement surname_input = signup.surname_input();
		surname_input.sendKeys(surname);
		logger.info("Successfully entered the 'Surname'");

		MobileElement dob_text = signup.dob_text();
		Assert.assertEquals(dob_text.getText(), "Date of Birth (DD/MM/YYYY)");
		logger.info("Successful assertion of the text 'Date of Birth (DD/MM/YYYY)'");

		// dob program

	    

		MobileElement male_text = signup.male_text();
		Assert.assertEquals(male_text.getText(), "Male");
		logger.info("Successful assertion of the text 'Male'");

		MobileElement male_check_box = signup.male_check_box();
		male_check_box.click();
		logger.info("Successfully clicked on Male Checkbox");

		order_to_text.click();
		
		MobileElement email_text = signup.email_text();
		Assert.assertEquals(email_text.getText(), "Email");
		logger.info("Successful assertion of the text 'Email'");

		MobileElement email_input = signup.email_input();
		email_input.sendKeys(u_email);
		logger.info("Successfully entered the 'Email'");
		
		email_text.click();
		
		MobileElement mobile_number_text = signup.mobile_number_text();
		Assert.assertEquals(mobile_number_text.getText(), "Mobile number");
		logger.info("Successful assertion of the text 'Mobile number'");
		
		MobileElement mobile_number_input = signup.mobile_number_input();
		mobile_number_input.sendKeys(mobile);
		logger.info("Successfully entered the 'Mobile Number'");
		
		email_text.click();
		
		MobileElement create_password_text = signup.create_password_text();
		Assert.assertEquals(create_password_text.getText(), "Create password");
		logger.info("Successful assertion of the text 'Create password'");
		
		
		MobileElement create_password_input = signup.create_password_input();
		
		create_password_input.sendKeys("Admin@123");
		logger.info("Successfully entered the 'Create Password'");
	}
}