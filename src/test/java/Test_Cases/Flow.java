package Test_Cases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.appium.java_client.MobileElement;

import junit.framework.Assert;
import page_objects.Home_PO;
import page_objects.None_of_these_PO;
import page_objects.Tell_us_a_little_about_you_PO;
import resources.BaseClass;


public class Flow extends BaseClass {

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
		MobileElement book_consultation = prof.book_consultation();
		book_consultation.click();
		logger.info("Successfully clicked on 'Book a Consultation' Button");

	}

	@Test(priority = 2, enabled = true)
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

		
		MobileElement none_of_these_button = none.none_of_these_button();
		Assert.assertEquals(none_of_these_button.getText(),"I have none of these");
		logger.info("Successfully Assertion of the button text 'I have none of these' ");
		none_of_these_button.click();
		logger.info("Successfully clicked on the button 'I have none of these' ");
		

	}
	
	@Test(priority = 3, enabled = true)
	public void Tell_us_about_you() throws InterruptedException {
		
		logger.info("Successfully landed on the 'Tell us a little about you' Page");
		Tell_us_a_little_about_you_PO tell=new Tell_us_a_little_about_you_PO(driver);
		
		MobileElement tell_us_header = tell.tell_us_header();
		Assert.assertEquals(tell_us_header.getText(), "Tell us a little about you");
		logger.info("Successfully Assertion of the text 'Tell us a little about you' ");
		
		MobileElement dob_heading = tell.dob_heading();
		Assert.assertEquals(dob_heading.getText(), "Date of Birth (DD/MM/YYYY)");
		logger.info("Successfully Assertion of the text 'Date of Birth (DD/MM/YYYY)' ");
		
		MobileElement dob_input = tell.dob_input();
		dob_input.click();
		
		Thread.sleep(3000);
		MobileElement select_date = tell.select_date();
		select_date.click();
		
		
		
		
	}
	
}