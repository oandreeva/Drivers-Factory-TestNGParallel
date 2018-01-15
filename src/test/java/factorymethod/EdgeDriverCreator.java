package factorymethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverCreator extends WebDriverCreator {

	private final String EDGE_PATH = "src\\main\\resources\\MicrosoftWebDriver.exe";

	@Override
	public WebDriver factoryMethod() {
		System.setProperty("webdriver.edge.driver", EDGE_PATH);
		driver = new EdgeDriver();

		setupDriver();
		return driver;
	}

}
