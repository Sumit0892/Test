package DFSMApp;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.Activity;

public class DFSM_Login extends BaseTest {

	@Test
	
	public void ecom() {
//		Activity activity= new Activity();
		Set<String> contexts=driver.getContextHandles();
		for(String contextName:contexts)
		{
			System.out.println(contextName);
		}
//		driver.context("WebView");
//		driver.findElement(By.id("SignInModel_EmailAddress")).sendKeys("Sumit.testing121@gmail.com");
//		driver.findElement(By.id("userPwd_UserInputSecret")).sendKeys("Sumit@1234");
	}
}
