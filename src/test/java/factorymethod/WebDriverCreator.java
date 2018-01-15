package factorymethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverCreator {

	protected WebDriver driver;

	public abstract WebDriver factoryMethod();

	protected void setupDriver() {
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void closeDriver() {
		driver.quit();
		driver = null;
	}
}