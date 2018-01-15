package factorymethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverCreator extends WebDriverCreator {

	public static final String PATH_TO_CHROMEDRIVER = "src\\main\\resources\\chromedriver.exe";

	@Override
	public WebDriver factoryMethod() {
		System.setProperty("webdriver.chrome.driver", PATH_TO_CHROMEDRIVER);
		driver = new ChromeDriver();

		setupDriver();

		System.out.println("Chrome browser started.");
		return driver;
	}
}