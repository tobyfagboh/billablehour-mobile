package appiumTest.TestCase;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.microsoft.appcenter.appium.Factory;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import org.junit.rules.TestWatcher;
import org.junit.Rule;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import appiumTest.base.TestBase;
import io.appium.java_client.MobileElement;


public class loginTest extends TestBase {

	@Rule
    public TestWatcher watcher = Factory.createWatcher();
	
	@Test(priority=1)
	public void InvalidLoginTest() throws IOException, InterruptedException {

		EnhancedAndroidDriver<MobileElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		log.info("App opened");
		
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(OR.getProperty("filePath_XPATH"))).sendKeys(OR.getProperty("filepath_Text"));
		log.info("user filepath  passed into text box");	
		
		driver.findElement(By.xpath(OR.getProperty("Continue_XPATH"))).click();
		log.info("Continue button clicked");

	}
	
	
}
