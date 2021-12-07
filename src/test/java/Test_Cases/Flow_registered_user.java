package Test_Cases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import junit.framework.Assert;
import page_objects.Doctors_PO;
import page_objects.Doctors_Profile_PO;
import page_objects.Home_PO;
import page_objects.None_of_these_PO;
import page_objects.Sign_in_PO;
import page_objects.Tell_us_a_little_about_you_PO;
import resources.BaseClass;


public class Flow_registered_user extends BaseClass {

	@BeforeTest
	public void initialize() {
		try {

			driver = initialize_driver();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@Test(priority = 1, enabled = true)
	public void Home_Page_1() throws InterruptedException {
		logger.info("Successfully landed on the Home Page");

		Home_PO prof = new Home_PO(driver);
		MobileElement profile_button = prof.profile_button();
		profile_button.click();
		logger.info("Successfully clicked on Profile Button");

	}

	@Test(priority = 2, enabled = true)
	public void Sign_in_to_DoC() throws InterruptedException {

		String user_email = "imran.ullah@wearenova.co.uk";
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
		Assert.assertEquals(forgot_password_text.getText(), "Forgot password ?");
		logger.info("Successful assertion of the text 'Forgot password'");

		MobileElement sign_in_button = sign.sign_in_button();
		Assert.assertEquals(sign_in_button.getText(), "Sign in");
		logger.info("Successful assertion of the text 'Sign in'");

		sign_in_button.click();
		logger.info("Successfully clicked on the Sign in Button");
	}

	@Test(priority = 3, enabled = true)
	public void Home_Page() throws InterruptedException {
		logger.info("Successfully landed on the Home Page");

		Home_PO prof = new Home_PO(driver);
		
		prof.doctor_button().click();
		logger.info("Successfully clicked on 'Doctors' Button");
		
		MobileElement book_consultation = prof.book_consultation();
		book_consultation.click();
		logger.info("Successfully clicked on 'Book a Consultation' Button");

	}

	@Test(priority = 4, enabled = true)
	public void None_of_these() throws InterruptedException {
		logger.info("Successfully landed on the 'None of these' Page");
		None_of_these_PO none = new None_of_these_PO(driver);

		MobileElement before_booking_sentence = none.before_booking_sentence();
		Assert.assertEquals(before_booking_sentence.getText(),
				"Before booking with one of our doctors, please check that it’s not an emergency");
		logger.info(
				"Successfully Assertion of the sentence 'Before booking with one of our doctors, please check that it’s not an emergency'");

		MobileElement call_1122_sentence = none.call_1122_sentence();
		Assert.assertEquals(call_1122_sentence.getText(), "Call 1122 now if you have:");
		logger.info("Successfully Assertion of the sentence 'Call 1122 now if you have:'");

		MobileElement sign_heart_attack_sentence = none.sign_heart_attack_sentence();
		Assert.assertEquals(sign_heart_attack_sentence.getText(),
				"Signs of a heart attack - pain like a very tight band, heavy weight or squeezing in the centre of your chest");
		logger.info(
				"Successfully Assertion of the sentence 'Signs of a heart attack - pain like a very tight band, heavy weight or squeezing in the centre of your chest'");

		MobileElement sign_stroke_attack_sentence = none.sign_stroke_attack_sentence();
		Assert.assertEquals(sign_stroke_attack_sentence.getText(),
				"Signs of a stroke - face drooping on one side, can’t hold both arms up, difficulty speaking");
		logger.info(
				"Successfully Assertion of the sentence 'Signs of a stroke - face drooping on one side, can’t hold both arms up, difficulty speaking'");

		MobileElement sever_difficulty_sentence = none.sever_difficulty_sentence();
		Assert.assertEquals(sever_difficulty_sentence.getText(),
				"Severe difficulty breathing - gasping, not being able to get words out, choking or lips turning blue");
		logger.info(
				"Successfully Assertion of the sentence 'Severe difficulty breathing - gasping, not being able to get words out, choking or lips turning blue'");

		MobileElement heavy_bleeding_sentence = none.heavy_bleeding_sentence();
		Assert.assertEquals(heavy_bleeding_sentence.getText(), "Heavy bleeding - that won’t stop");
		logger.info("Successfully Assertion of the sentence 'Heavy bleeding - that won’t stop'");

		MobileElement sever_injuries_sentence = none.sever_injuries_sentence();
		Assert.assertEquals(sever_injuries_sentence.getText(),
				"Severe injuries - or deep cuts after a serious accident");
		logger.info("Successfully Assertion of the sentence 'Severe injuries - or deep cuts after a serious accident'");

		MobileElement seizure_sentence = none.seizure_sentence();
		Assert.assertEquals(seizure_sentence.getText(),
				"Seizure (fit) - someone is shaking or jerking because of a fit, or is unconscious (can’t be woken up)");
		logger.info(
				"Successfully Assertion of the sentence 'Seizure (fit) - someone is shaking or jerking because of a fit, or is unconscious (can’t be woken up)'");

		MobileElement sudden_rapid_sentence = none.sudden_rapid_sentence();
		Assert.assertEquals(sudden_rapid_sentence.getText(),
				"Sudden, rapid swelling - of the eyes, lips, mouth, throat or tongue");
		logger.info(
				"Successfully Assertion of the sentence 'Sudden, rapid swelling - of the eyes, lips, mouth, throat or tongue'");

		MobileElement continue_button = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"I have none of these\"))"));
		continue_button.click();
		logger.info("Successfully clicked on the button 'I have none of these' ");
		

	}
	
	@Test(priority = 5, enabled = true)
	public void Tell_us_about_you() throws InterruptedException {
		
		logger.info("Successfully landed on the 'Tell us a little about you' Page");
		Tell_us_a_little_about_you_PO tell=new Tell_us_a_little_about_you_PO(driver);
		
		MobileElement tell_us_header = tell.tell_us_header();
		Assert.assertEquals(tell_us_header.getText(), "Tell us a little about you");
		logger.info("Successfully Assertion of the text 'Tell us a little about you' ");
		
		MobileElement dob_heading = tell.dob_heading();
		Assert.assertEquals(dob_heading.getText(), "Date of birth (DD/MM/YYYY)");
		logger.info("Successfully Assertion of the text 'Date of birth (DD/MM/YYYY)' ");
		
		MobileElement symptoms_text = tell.symptoms_text();
		Assert.assertEquals(symptoms_text.getText(), "Symptoms");
		logger.info("Successfully Assertion of the Heading 'Symptoms' ");
		
		MobileElement Tell_us_about_your_basic_symptoms_text = tell.Tell_us_about_your_basic_symptoms_text();
		Assert.assertEquals(Tell_us_about_your_basic_symptoms_text.getText(), "Tell us about your basic symptoms and we can use this information to help us find the doctor you will see.");
		logger.info("Successfully Assertion of the text 'Tell us about your basic symptoms and we can use this information to help us find the doctor you will see.' ");
		
		MobileElement symptoms_input = tell.symptoms_input();
		String sympytom = "I am not feeling well";
		symptoms_input.sendKeys(sympytom);
		logger.info("Successfully entered the symptom ");
		
		
		MobileElement find_doctor_button = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Find a doctor\"))"));
		find_doctor_button.click();
		logger.info("Successfully clicked on the button 'Find a doctor' ");
		
		
	}
	
	@Test(priority = 6, enabled = true)
	public void Doctors_Page() throws InterruptedException {
		
		logger.info("Successfully landed on the 'Doctors Page'");
		
	Doctors_PO doc=new Doctors_PO(driver);
	MobileElement doctors_heading = doc.doctors_heading();
	Assert.assertEquals(doctors_heading.getText(), "Doctors");
	logger.info("Successfully Assertion of the Heading 'Doctors' ");
	
	MobileElement online_button = doc.online_button();
	online_button.click();
	logger.info("Successfully clicked on Online button ");
	
	Thread.sleep(1000);
	doc.imran_ullah().click();
	logger.info("Successfully clicked on Dr. Imran Ullah ");
		
	}
	
	@Test(priority = 7, enabled = true)
	public void Doctors_Profile() throws InterruptedException {
		
		logger.info("Successfully landed on the 'Doctors Profile'");
		
	Doctors_Profile_PO doc_pro=new Doctors_Profile_PO(driver);
	MobileElement available_heading = doc_pro.available_heading();
	Assert.assertEquals(available_heading.getText(), "Available");
	logger.info("Successfully Assertion of the Heading 'Available' ");	
	
	MobileElement book_consultation_button = doc_pro.book_consultation_button();
	book_consultation_button.click();
	logger.info("Successfully clicked on Book Consultation button");
	
	
	
	}
	
}