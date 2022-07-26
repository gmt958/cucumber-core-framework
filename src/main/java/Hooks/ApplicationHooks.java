package Hooks;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import GenericMethods.BrowserStackAndroid;
import GenericMethods.RealDevices;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	
	

	@Before
	public void setbrowser() {
		

		try {
			BrowserStackAndroid.Browserstack_Launch_App();

		} catch (MalformedURLException | InterruptedException e) {
			
			e.printStackTrace();
		}

	}

	@AfterStep
	public void TearDown(Scenario scenario) throws IOException, InterruptedException {
		String screenshotname = scenario.getName().replaceAll(" ", "_");
		scenario.attach(ApplicationHooks.getByteScreenshot(), "image/png", screenshotname);
	}
   
	public void teardown() {

    	 BrowserStackAndroid.getdriver().quit();
	}

	public static byte[] getByteScreenshot() throws IOException {

		byte[] sourcepath = ((TakesScreenshot) BrowserStackAndroid.getdriver()).getScreenshotAs(OutputType.BYTES);
		return sourcepath;

	}

}
