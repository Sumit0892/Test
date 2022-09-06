package DFSMApp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {

	public AndroidDriver driver;
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException
	{

							
			UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("Android Device"); //real
		    options.setApp("C:\\Users\\sumit_tulsyan\\eclipse-workspace\\Appium\\src\\main\\java\\resources\\Dell.Dfsm.Mobile.Android (41).apk");	
			
			 driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
//	@AfterClass
//	public void tearDown()
//	{
//		driver.quit();
//        service.stop();
		}
	
//}
