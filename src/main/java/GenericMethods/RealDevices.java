package GenericMethods;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RealDevices {

	public static AppiumDriver driver;

	public void setDriver() throws InterruptedException {
		DesiredCapabilities options = new DesiredCapabilities();
		options.setCapability(MobileCapabilityType.DEVICE_NAME, "DRGID18082915221");
		options.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		options.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		options.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\mtgo\\apk file\\com.microsoft.crm.crmphone.fieldServices-3.21122.25-APK4Fun.com (1).apk");
		options.setCapability("appWaitActivity", "com.microsoft.*");
		options.setCapability("autoGrantPermissions", "true");
		options.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		options.setCapability("name", "Android Demo");
		try {
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver(url, options);

			Thread.sleep(20000);
		} catch (MalformedURLException e) {

			e.printStackTrace();
			e.getCause();
			e.getLocalizedMessage();
		}
		driver.findElement(By.xpath(
				"//android.widget.Button[@content-desc='Close']/android.view.ViewGroup/android.widget.ImageView"))
				.click();
		Thread.sleep(10000);
       
	}

	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='email address']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='email address']"))
				.sendKeys("CRMOL.Test02@nalco.com");
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']")).click();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Sign in using authenticator app']/android.view.ViewGroup")).click();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[1]")).click();

	}

	public static WebDriver getDriver() {

		return driver;
	}

	

}
