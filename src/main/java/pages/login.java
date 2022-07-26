package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.ui.WebDriverWait;

import GenericMethods.BrowserStackAndroid;

public class login {
	
	public AndroidDriver driver;

	
	

	public login(AndroidDriver driver) {
		
		this.driver=driver;
	}

	WebElement email = driver.findElement(By.xpath("//android.widget.EditText[@content-desc='email address']"));

	WebElement emailID = driver.findElement(By.xpath("//android.widget.EditText[@content-desc='email address']"));
	WebElement next = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']"));
	WebElement okbutton = driver.findElement(By
			.xpath("//android.widget.Button[@content-desc='Sign in using authenticator app']/android.view.ViewGroup"));
	WebElement siggin = driver.findElement(By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[1]"));

	public void geturl(String url) throws InterruptedException {

		driver.get(url);
		driver.manage().window().maximize();

	}

	public void gettitle() {
		driver.getTitle();
	}

	public void click() {
		try {
			driver.findElement(By.xpath("//android.widget.EditText[@content-desc='email address']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@content-desc='email address']"))
					.sendKeys("crmol.test02@nalco.com");
			next.click();
			Thread.sleep(5000);
			okbutton.click();
			siggin.click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
