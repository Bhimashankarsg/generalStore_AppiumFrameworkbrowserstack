package cart_gstoreTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class sampleipa_ios {
	@Parameters({ "device", "os_version" })
	@Test
public void test(String device, String osVersion)  throws MalformedURLException, InterruptedException
{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		HashMap<String, Object> bstackOptions = new HashMap<String, Object>();
		bstackOptions.put("userName", "bhimashankarghat_MkXTQ1");
		bstackOptions.put("accessKey", "zwvzq5ppDxxS3p4XnzFv");
		bstackOptions.put("projectName", "sample");
		bstackOptions.put("buildName", "build1.0");
		bstackOptions.put("debug", "true");
		bstackOptions.put("networkLogs", "true");
		bstackOptions.put("appProfiling", "true");
		capabilities.setCapability("platformName", "ios");
		capabilities.setCapability("appium:platformVersion", osVersion);
		capabilities.setCapability("appium:deviceName", device);
		capabilities.setCapability("bstack:options", bstackOptions);

			 
		capabilities.setCapability("appium:app", "bs://e24ee1007ffd88f411277d74e28b4838c790d1b8");
 

		IOSDriver driver = new IOSDriver(
		    new URL("http://hub-cloud.browserstack.com/wd/hub"), capabilities
		);
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Alert\"`]")).click();
		driver.findElement(AppiumBy.accessibilityId("OK")).click();

	 
}
}
