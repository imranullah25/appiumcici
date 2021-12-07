package page_objects;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class None_of_these_PO {
	public AppiumDriver<MobileElement> driver;

	// X button
	By x_button = By.xpath(
			"	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");

	// Before booking with one of our doctors, please check that it’s not an
	// emergency
	// By email_text = By.xpath("//android.widget.TextView[@text='Before booking
	// with one of our doctors, please check that it’s not an emergency']");

	By before_booking_sentence = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]");

	// Call 1122 now if you have:
	By call_1122_sentence = By.xpath("//android.widget.TextView[@text='Call 1122 now if you have:']");

	// Signs of a heart attack - pain like a very tight band, heavy weight or squeezing in the centre of your chest
	By sign_heart_attack_sentence = By.xpath(
			"//android.widget.TextView[@text='Signs of a heart attack - pain like a very tight band, heavy weight or squeezing in the centre of your chest']");

	// Signs of a stroke - face drooping on one side, can’t hold both arms up, difficulty speaking
	By sign_stroke_attack_sentence = By.xpath(
			"//android.widget.TextView[@text='Signs of a stroke - face drooping on one side, can’t hold both arms up, difficulty speaking']");

	// Severe difficulty breathing - gasping, not being able to get words out, choking or lips turning blue
	By sever_difficulty_sentence = By.xpath(
			"//android.widget.TextView[@text='Severe difficulty breathing - gasping, not being able to get words out, choking or lips turning blue']");

	// Heavy bleeding - that won’t stop
	// By heavy_bleeding_sentence = By.xpath("//android.widget.TextView[@text='Heavy
	// bleeding - that won’t stop']");
	By heavy_bleeding_sentence = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[6]");

	// Severe injuries - or deep cuts after a serious accident
	By sever_injuries_sentence = By
			.xpath("//android.widget.TextView[@text='Severe injuries - or deep cuts after a serious accident']");

	// Seizure (fit) - someone is shaking or jerking because of a fit, or is unconscious (can’t be woken up)
	By seizure_sentence = By.xpath(
			"//android.widget.TextView[@text='Seizure (fit) - someone is shaking or jerking because of a fit, or is unconscious (can’t be woken up)']");

	// Sudden, rapid swelling - of the eyes, lips, mouth, throat or tongue
	By sudden_rapid_sentence = By.xpath(
			"//android.widget.TextView[@text='Sudden, rapid swelling - of the eyes, lips, mouth, throat or tongue']");

	// I have none of these
	By none_of_these_button = By.xpath("//android.widget.TextView[@content-desc=\"btn-TermandCondition-None-of-These\"]");

	public None_of_these_PO(AppiumDriver<MobileElement> driver2) {
		this.driver = driver2;
	}

	// X button
	public MobileElement x_button() {
		return driver.findElement(x_button);
	}

	// Before booking with one of our doctors, please check that it’s not an
	public MobileElement before_booking_sentence() {
		return driver.findElement(before_booking_sentence);
	}

	// Call 1122 now if you have:
	public MobileElement call_1122_sentence() {
		return driver.findElement(call_1122_sentence);
	}

	// Signs of a heart attack - pain like a very tight band, heavy weight or
	// squeezing in the centre of your chest
	public MobileElement sign_heart_attack_sentence() {
		return driver.findElement(sign_heart_attack_sentence);
	}

	// Signs of a stroke - face drooping on one side, can’t hold both arms up,
	// difficulty speaking
	public MobileElement sign_stroke_attack_sentence() {
		return driver.findElement(sign_stroke_attack_sentence);
	}

// 	Severe difficulty breathing - gasping, not being able to get words out, choking or lips turning blue
	public MobileElement sever_difficulty_sentence() {
		return driver.findElement(sever_difficulty_sentence);
	}

	// Heavy bleeding - that won’t stop
	public MobileElement heavy_bleeding_sentence() {
		return driver.findElement(heavy_bleeding_sentence);
	}

	// Severe injuries - or deep cuts after a serious accident
	public MobileElement sever_injuries_sentence() {
		return driver.findElement(sever_injuries_sentence);
	}

	// Seizure (fit) - someone is shaking or jerking because of a fit, or is
	// unconscious (can’t be woken up)
	public MobileElement seizure_sentence() {
		return driver.findElement(seizure_sentence);
	}

	// Sudden, rapid swelling - of the eyes, lips, mouth, throat or tongue
	public MobileElement sudden_rapid_sentence() {
		return driver.findElement(sudden_rapid_sentence);
	}

	// I have none of these
	public MobileElement none_of_these_button() {
		return driver.findElement(none_of_these_button);
	}
}
