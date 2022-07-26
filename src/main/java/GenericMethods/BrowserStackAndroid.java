package GenericMethods;

import java.net.URL;

import java.time.Duration;
import java.util.HashMap;
import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

public class BrowserStackAndroid {
	public static AndroidDriver driver;
	
	public BrowserStackAndroid(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	

	public static void Browserstack_Launch_App() throws MalformedURLException, InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();
		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();

		// Set your access credentials
		browserstackOptions.put("userName", "gowthamireddy_rwv1LT");
		browserstackOptions.put("accessKey", "4zx2KhKZUJ8zWmv6u3No");

		// Set other BrowserStack capabilities

		browserstackOptions.put("projectName", "First Java Project");
		browserstackOptions.put("buildName", "browserstack-build-1");
		browserstackOptions.put("sessionName", "first_test");

		// Passing browserstack capabilities inside bstack:options
		caps.setCapability("bstack:options", browserstackOptions);

		// Set URL of the application under test
		caps.setCapability("app", "bs://76ada4b718b4fe3be00bf900e35c825f23d93ecc");

		// Specify deviceName and platformName for testing
		caps.setCapability("deviceName", "Google Pixel 3");
		caps.setCapability("platformName", "android");
		caps.setCapability("platformVersion", "9.0");

		// Initialise the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above
		driver = new AndroidDriver(new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);
		// If you have uploaded your app, update the test case here.

		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//android.widget.Button[@content-desc='Close']/android.view.ViewGroup/android.widget.ImageView"))
				.click();
		Thread.sleep(5000);


		// Invoke driver.quit() after the test is done to indicate that the test is
		// completed.
	}

	public static AndroidDriver getdriver()

	{

		return driver;
	}

	

}
