package by.htp.selenium.mail.steps;

import org.openqa.selenium.WebDriver;

import by.htp.selenium.mail.pages.MainPage;

public class Steps {
	private WebDriver driver;

	public void initBrowser(WebDriver driver) {
		this.driver = driver;
		System.out.println("Driver title: " + driver.getTitle());
	}

	public void loginMail(String username, String password) {
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.login(username, password);
	}

	public boolean checkLogin(String username) {
		MainPage mainPage = new MainPage(driver);
		return mainPage.getLoginResult(username);
	}

	public void sendMail() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		mainPage.sendMail();
	}

	public boolean checkSend() {
		MainPage mainPage = new MainPage(driver);
		return mainPage.checkSend();
	}

}
