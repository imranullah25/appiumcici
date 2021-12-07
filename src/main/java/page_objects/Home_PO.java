package page_objects;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Home_PO {
	public AppiumDriver<MobileElement> driver;

	// High Quality
	By high_quailty = By.xpath("//android.widget.TextView[@text='High Quality']");

	// Health care at Home
	By health_care_home = By.xpath("//android.widget.TextView[@text='Healthcare at Home']");

	// Book a consultation
	
	By book_consultationt = By.xpath("	//android.view.ViewGroup[@content-desc='Home_Book_Consultation']");
	
	// Doctors Button
	By doctor_button = By.xpath("//android.view.ViewGroup[@content-desc=\"Home_BottomMenu_Doctor\"]/android.widget.TextView[1]");
	
	// Consultation Button
	By consultation_button = By.xpath("	//android.widget.ImageView[@content-desc=\"Home_BottomMenu_Consultation\"]");
	
	// Profile Button
	 By profile_b = By.xpath("//android.view.ViewGroup[@content-desc='Home_BottomMenu_Profile']/android.widget.TextView[1]");
	
	// More Button
	By more_button = By.xpath("//android.widget.ImageView[@content-desc=\"Home_BottomMenu_More\"]");
	
	
	public Home_PO(AppiumDriver<MobileElement> driver2) {
		this.driver = driver2;
	}

	// High Quality
	public MobileElement high_quailty() {
		return driver.findElement(high_quailty);
	}

	// Health care at Home
	public MobileElement health_care_home () {
		return driver.findElement(health_care_home);
	}

	// Book a consultation
	public MobileElement book_consultation() {
		return driver.findElement(book_consultationt);
	}

	// Doctors Button
	public MobileElement doctor_button() {
		return driver.findElement(doctor_button);
	}
	
	// Consultation Button
	public MobileElement consultation_button() {
		return driver.findElement(consultation_button);
	}
	
	// Profile Button
	public MobileElement profile_button() {
		return driver.findElement(profile_b);
	}
	
	// More Button
	public MobileElement delete_account_b() {
		return driver.findElement(more_button);
	}
	
	
}
