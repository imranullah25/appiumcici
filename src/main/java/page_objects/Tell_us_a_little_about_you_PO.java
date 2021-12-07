package page_objects;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Tell_us_a_little_about_you_PO {
	public AppiumDriver<MobileElement> driver;

	// Tell us a little about you
	By tell_us_header = By.xpath("//android.widget.TextView[@text='Tell us a little about you']");
	
	// Date of Birth (DD/MM/YYYY)
	By dob_heading = By.xpath("//android.widget.TextView[@text='Date of birth (DD/MM/YYYY)']");

	// Date of Birth input
	By dob_input = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");

	// ok
	By dob_ok = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup");

   // Select date
	By select_date = By.xpath("	//android.view.View[@content-desc=\"Selected Year, Value is July 8 2020\"]");
	
	// Symptoms text
	By symptoms_text = By.xpath("//android.widget.TextView[@text='Symptoms']");
	
	// Tell us about your basic symptoms and we can use this information to help us find the doctor you will see.
	By Tell_us_about_your_basic_symptoms_text = By.xpath("//android.widget.TextView[@text='Tell us about your basic symptoms and we can use this information to help us find the doctor you will see.']");
	
	// symptoms_input
	By symptoms_input = By.xpath("//android.widget.EditText[@content-desc=\"TellUSLittle-Symptoms-Field\"]");
	
	// Find a doctor button
	By find_doctor_button=By.xpath("//android.widget.TextView[@content-desc=\"btn-FindDoctor\"]");
	
	
	public Tell_us_a_little_about_you_PO(AppiumDriver<MobileElement> driver2) {
		this.driver = driver2;
	}

	// Tell us a little about you
	public MobileElement tell_us_header() {
		return driver.findElement(tell_us_header);
	}

	// Date of Birth (DD/MM/YYYY)
	public MobileElement dob_heading() {
		return driver.findElement(dob_heading);
	}

	// Date of Birth input
	public MobileElement dob_input() {
		return driver.findElement(dob_input);
	}

	// ok
	public MobileElement dob_ok() {
		return driver.findElement(dob_ok);
	}
	
	  // Select date
	public MobileElement select_date() {
		return driver.findElement(select_date);
	}
	
	// symptoms_text
	public MobileElement symptoms_text() {
		return driver.findElement(symptoms_text);
	}
	
	// Tell_us_about_your_basic_symptoms_text
	public MobileElement Tell_us_about_your_basic_symptoms_text() {
		return driver.findElement(Tell_us_about_your_basic_symptoms_text);
	}
	
    //	symptoms_input
	public MobileElement symptoms_input() {
		return driver.findElement(symptoms_input);
	}
	
	// find_doctor_button
	public MobileElement find_doctor_button() {
		return driver.findElement(find_doctor_button);
	}
	
	
	
}
