package factorymethod;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MailTest {
	@Test
	public void testMail() {
		WebDriverCreator creator = new ChromeDriverCreator();
		WebDriver driver = creator.factoryMethod();
		driver.navigate().to("https://mail.ru/");
	}

}
