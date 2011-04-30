package de.media.manager.integration.selenium.audioBook;

import de.media.manager.integration.selenium.AbstractBaseSelenium;

public class AudioBookSeleniumTest extends AbstractBaseSelenium {

	public AudioBookSeleniumTest(){
		super();
	}
	
	public void testMediaManagerLogin() throws Exception {
		getSelenium().open("/media-web/");
		getSelenium().click("login");
		getSelenium().waitForPageToLoad("30000");
		getSelenium().click("link=Hörbuch");
		getSelenium().waitForPageToLoad("30000");
		getSelenium().click("//div[@id='contentWrapper']/div[4]/div[1]/ul/li[2]/a");
		getSelenium().waitForPageToLoad("30000");
	}
}
