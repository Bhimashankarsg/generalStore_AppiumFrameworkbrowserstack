package cart_gstoreTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class generalstoreBstack {
	@Test
public void test() throws MalformedURLException, InterruptedException
{
		
	DesiredCapabilities capabilities = new DesiredCapabilities();
	HashMap<String, Object> bstackOptions = new HashMap<String, Object>();
	bstackOptions.put("userName", "bhimashankarghat_MkXTQ1");
	bstackOptions.put("accessKey", "zwvzq5ppDxxS3p4XnzFv");
	bstackOptions.put("projectName", "generalstore");
	bstackOptions.put("buildName", "1.0.2");
	bstackOptions.put("sessionName", "login");
	bstackOptions.put("debug", "true");
	bstackOptions.put("networkLogs", "true");
	bstackOptions.put("appProfiling", "true");
	capabilities.setCapability("platformName", "android");
	capabilities.setCapability("appium:platformVersion", "13.0");
	capabilities.setCapability("appium:deviceName", "Samsung Galaxy S23 Ultra");
	capabilities.setCapability("appium:app", "bs://d44a5badcd73fcdab8382509a1f5596837957b0b");
	capabilities.setCapability("bstack:options", bstackOptions);
	capabilities.setCapability("orientation", "PORTRAIT");
	
//	AndroidDriver driver = new AndroidDriver(new URL("http://bhimashankarghat_MkXTQ1:zwvzq5ppDxxS3p4XnzFv@hub-cloud.browserstack.com/wd/hub"),capabilities);
//	
	 AndroidDriver driver = new AndroidDriver(
	            new URL("http://bhimashankarghat_MkXTQ1:zwvzq5ppDxxS3p4XnzFv@hub-cloud.browserstack.com/wd/hub"),
	            capabilities
	        );
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("bshankar");
		Thread.sleep(1000);
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath(
				"//android.widget.TextView[@text='Air Jordan 1 Mid SE']/..//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"]"))
				.click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed")).click();

}
}
