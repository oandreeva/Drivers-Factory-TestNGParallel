package by.htp.selenium.mail;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import by.htp.selenium.mail.steps.Steps;
import factorymethod.ChromeDriverCreator;
import factorymethod.EdgeDriverCreator;
import factorymethod.FirefoxDriverCreator;
import factorymethod.WebDriverCreator;

/**
 * Unit test for simple App.
 */
public class AppTest {
	private Steps steps;
	private WebDriverCreator driverCreator;
	private final String USERNAME = "htp-tat5-andreeva";
	private final String PASSWORD = "12345qwert";

	@BeforeMethod(description = "Init browser")
	@Parameters("browser")
	public void setUp(String browser) {
		System.out.println(browser);
		switch (browser) {
		case "Firefox":
			driverCreator = new FirefoxDriverCreator();
			break;
		case "Chrome":
			driverCreator = new ChromeDriverCreator();
			break;
		case "Edge":
			driverCreator = new EdgeDriverCreator();
			break;
		default:
			break;
		}

		steps = new Steps();
		steps.initBrowser(driverCreator.factoryMethod());
	}

	@Test
	public void sendMail() throws InterruptedException {
		steps.loginMail(USERNAME, PASSWORD);
		Assert.assertTrue(steps.checkLogin(USERNAME));

		steps.sendMail();
		Assert.assertTrue(steps.checkSend());

	}

	@AfterMethod(description = "Stop Browser")
	public void stopBrowser() {
		driverCreator.closeDriver();
	}
}
