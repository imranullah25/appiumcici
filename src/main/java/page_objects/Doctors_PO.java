package page_objects;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Doctors_PO {
	public AppiumDriver<MobileElement> driver;

	// Doctors Heading
	By doctors_heading = By.xpath("//android.widget.TextView[@text='Doctors']");

	// online_button
	By online_button = By.xpath("//android.widget.TextView[@content-desc=\"btn-Online\"]");

	// male_button
	By male_button = By.xpath("	//android.widget.TextView[@content-desc=\"btn-Male\"]");
	
	// female_button
	By female_button = By.xpath("//android.widget.TextView[@content-desc=\"btn-Female\"]");
	
	// all_button
	By all_button = By.xpath("(//android.view.ViewGroup[@content-desc=\"btn-All\"])[2]");
	
	// Dr. Imran Ullah
	 By imran_ullah = By.xpath("//android.widget.TextView[@text='Dr. Imran Ullah']");
	
	// More Button
	By more_button = By.xpath("//android.widget.ImageView[@content-desc=\"Home_BottomMenu_More\"]");
	
	
	public Doctors_PO(AppiumDriver<MobileElement> driver2) {
		this.driver = driver2;
	}

	// doctors_heading
	public MobileElement doctors_heading() {
		return driver.findElement(doctors_heading);
	}

	// online_button
	public MobileElement online_button () {
		return driver.findElement(online_button);
	}

	// male_button
	public MobileElement male_button() {
		return driver.findElement(male_button);
	}

	// female_button
	public MobileElement female_button() {
		return driver.findElement(female_button);
	}
	
	// all_button
	public MobileElement all_button() {
		return driver.findElement(all_button);
	}
	
	// imran_ullah
	public MobileElement imran_ullah() {
		return driver.findElement(imran_ullah);
	}
	
	// More Button
	public MobileElement delete_account_b() {
		return driver.findElement(more_button);
	}
	
	
}
