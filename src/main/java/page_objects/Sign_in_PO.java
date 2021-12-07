package page_objects;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Sign_in_PO {
	public AppiumDriver<MobileElement> driver;

	// Sign in to DoC
	By sign_in_to_DoC_text = By.xpath("//android.widget.TextView[@text='Sign in to DoC']");

	// Email text
	By email_text = By.xpath("//android.widget.TextView[@text='Email']");

	// Email input
	By email_input = By.xpath("//android.widget.EditText[@content-desc='login-Email']");
	
	// Password text
	By password_text = By.xpath("//android.widget.TextView[@text='Password']");

	// Password input
	By password_input = By.xpath("//android.widget.EditText[@content-desc='login-Password']");
	
	// Forgot password
	By forgot_password_text = By.xpath("//android.widget.TextView[@text='Forgot password ?']");

	// Sign in button
	By sign_in_button = By.xpath("//android.widget.TextView[@text='Sign in']");

	// New to DoC?
	By new_to_doc_text = By.xpath("//android.widget.TextView[@text='New to DoC?']");

	// Sign up
	By sign_up = By.xpath("//android.widget.TextView[@text='Sign up']");

	// Back Button
	By back_button = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");

	public Sign_in_PO(AppiumDriver<MobileElement> driver2) {
		this.driver = driver2;
	}

	// Sign in to DoC
	public MobileElement sign_in_to_DoC_text() {
		return driver.findElement(sign_in_to_DoC_text);
	}

	// Email text
	public MobileElement email_text() {
		return driver.findElement(email_text);
	}

	// Email input
	public MobileElement email_input() {
		return driver.findElement(email_input);
	}

	// Password text
	public MobileElement password_text() {
		return driver.findElement(password_text);
	}

	// Password input
	public MobileElement password_input() {
		return driver.findElement(password_input);
	}

	// Forgot password
	public MobileElement forgot_password_text() {
		return driver.findElement(forgot_password_text);
	}

	// Sign in button
	public MobileElement sign_in_button() {
		return driver.findElement(sign_in_button);
	}

	// New to DoC?
	public MobileElement new_to_doc_text() {
		return driver.findElement(new_to_doc_text);
	}

	// Sign up
	public MobileElement sign_up() {
		return driver.findElement(sign_up);
	}

	// Back Button
	public MobileElement back_button() {
		return driver.findElement(back_button);
	}
}
