package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Selenium_01_CheckEnvironment {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		
		driver = new FirefoxDriver();
		driver.get("http://live.guru99.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void TC_01_CheckUrlAndTitle() {
		String url =driver.getCurrentUrl();
		Assert.assertEquals("http://live.guru99.com/", url);
		String title =driver.getTitle();
		Assert.assertEquals("Home page", title);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
