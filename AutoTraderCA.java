/** Project: autotrader.ca automation ***************************************************************************** 
 **	Team: Muqsit, Ashraf, and Sandi                              
 **	First Draft Date: June 19, 2017                              
 ** Notes: 
 ** Following two methods were created                    
 ** (1) browsersetting() - Chrome browser selection and maximizing browser            
 ** (2) launchAutoTrader() - autotrader.ca web site launched and 3 assertions were made 
 ** (page title, French language toggle text, and Sign In text to verify that the page was successfully launched)
 ** Instructions: Follow Arrange, Act, and Assert model in your coding 
 ******************************************************************************************************************/

package AutoTrader;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTraderCA {

	public static WebDriver driver;

	public static void main(String[] args) {
		// Configure browser and driver path, open browser, and maximize it
		browsersetting();

		// Launch autotrader site and verify that the correct page is launched
		// by verifying the title of the page
		launchAutoTrader();
	}

	public static void browsersetting() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void launchAutoTrader() {
		driver.get("http://www.autotrader.ca");
		String actualText = driver.getTitle();
		Assert.assertTrue(actualText.equals("New & Used Cars for Sale – Auto Classifieds | autoTRADER.ca"));
		// OR same in just one line below
		Assert.assertEquals("New & Used Cars for Sale – Auto Classifieds | autoTRADER.ca", driver.getTitle());

		String languagetoggle = driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_HeaderContent_Header2_frLang']")).getText();
		Assert.assertTrue(languagetoggle.equals("Français"));
		// OR same in just one line below
		Assert.assertEquals("Français",	driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_HeaderContent_Header2_frLang']")).getText());

		String signinlink = driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_HeaderContent_Header2_SignInOut2_lnkSignIn']")).getText();
		Assert.assertTrue(signinlink.equals("Sign In"));
		// OR same in just one line below
		Assert.assertEquals("Sign In", driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_HeaderContent_Header2_SignInOut2_lnkSignIn']")).getText());
	}

}
