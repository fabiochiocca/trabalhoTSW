package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCaseCommon {

	public static  WebDriver driver;
	public static final String URL_BASE = "http://www2.csi.com.br/mantis";
	
	public static WebDriver getDriver() {
		if(driver == null) {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		return driver;
	}
	

}