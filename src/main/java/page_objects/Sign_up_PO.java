package page_objects;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Sign_up_PO {
	public AppiumDriver<MobileElement> driver;

	// Sign up header text
	By sign_up_text = By.xpath("//android.widget.TextView[@text='Sign up']");

	// In order to confirm a consultation, you need to fill in the form below.
	By order_to_text = By.xpath(
			"//android.widget.TextView[@text='In order to confirm a consultation, you need to fill in the form below.']");

	// First name text
	By first_name_text = By.xpath("//android.widget.TextView[@text='First name']");

	// First Name Input
	By first_name_input = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");

// 	Surname text
	By surname_text = By.xpath("//android.widget.TextView[@text='Surname']");

// 	Surname input
	By surname_input = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");

	// Date of Birth (DD/MM/YYYY) text
	By dob_text = By.xpath("//android.widget.TextView[@text='Date of Birth (DD/MM/YYYY)']");

	// Date of Birth (DD/MM/YYYY) input
	By dob_input = By.xpath(
			"	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]");

	// Male Text
	By male_text = By.xpath("//android.widget.TextView[@text='Male']");

	// Male check box
	By male_check_box = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]");

	// Female Text
	By female_text = By.xpath("//android.widget.TextView[@text='Female']");

	// Female check box
	By female_check_box = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]");

	// Email Text
	By email_text = By.xpath("//android.widget.TextView[@text='Email']");

	// Email Input
	By email_input = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.EditText");

	// Mobile Number Text
	By mobile_number_text = By.xpath("//android.widget.TextView[@text='Mobile number']");

	// Mobile Number Input
	By mobile_number_input = By.xpath(
			"	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.EditText");

	// Create password text
	By create_password_text = By.xpath("//android.widget.TextView[@text='Create password']");

	// Create password Input
	By cre_password_input = By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*/*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']])[1]");
			
	// Confirm password text
	By confirm_password_text = By.xpath("//android.widget.TextView[@text='Confirm password']");

	// Confirm password input
	By confirm_password_input = By.xpath("");
			
	// I agree to terms and conditions
	By i_agree_text = By.xpath("//android.widget.TextView[@text='I agree to terms and conditions']");

	// I agree check box
	By i_agree_check_box = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]");

	// Sign up and confirm booking
	By confirm_booking_button = By.xpath("//android.widget.TextView[@text='Sign up and confirm booking']");

	public Sign_up_PO(AppiumDriver<MobileElement> driver2) {
		this.driver = driver2;
	}

	// Sign up header text
	public MobileElement sign_up_text() {
		return driver.findElement(sign_up_text);
	}

	// In order to confirm a consultation, you need to fill in the form below.
	public MobileElement order_to_text() {
		return driver.findElement(order_to_text);
	}

	// First name text
	public MobileElement first_name_text() {
		return driver.findElement(first_name_text);
	}

	// First Name Input
	public MobileElement first_name_input() {
		return driver.findElement(first_name_input);
	}

// 	Surname text
	public MobileElement surname_text() {
		return driver.findElement(surname_text);
	}

// 	Surname input
	public MobileElement surname_input() {
		return driver.findElement(surname_input);
	}

	// Date of Birth (DD/MM/YYYY) text
	public MobileElement dob_text() {
		return driver.findElement(dob_text);
	}

	// Date of Birth (DD/MM/YYYY) input
	public MobileElement dob_input() {
		return driver.findElement(dob_input);
	}

	// Male Text
	public MobileElement male_text() {
		return driver.findElement(male_text);
	}

	// Male check box
	public MobileElement male_check_box() {
		return driver.findElement(male_check_box);
	}

	// Female Text
	public MobileElement female_text() {
		return driver.findElement(female_text);
	}

	// Female check box
	public MobileElement female_check_box() {
		return driver.findElement(female_check_box);
	}

	// Email Text
	public MobileElement email_text() {
		return driver.findElement(email_text);
	}

	// Email Input
	public MobileElement email_input() {
		return driver.findElement(email_input);
	}

	// Mobile Number Text
	public MobileElement mobile_number_text() {
		return driver.findElement(mobile_number_text);
	}

	// Mobile Number Input
	public MobileElement mobile_number_input() {
		return driver.findElement(mobile_number_input);
	}

	// Create password text
	public MobileElement create_password_text() {
		return driver.findElement(create_password_text);
	}

	// Create password Input
	public MobileElement create_password_input() {
		return driver.findElement(cre_password_input);
	}

	// I agree to terms and conditions
	public MobileElement i_agree_text() {
		return driver.findElement(i_agree_text);
	}

	// I agree check box
	public MobileElement i_agree_check_box() {
		return driver.findElement(i_agree_check_box);
	}

	// Sign up and confirm booking
	public MobileElement confirm_booking_button() {
		return driver.findElement(confirm_booking_button);
	}
}
