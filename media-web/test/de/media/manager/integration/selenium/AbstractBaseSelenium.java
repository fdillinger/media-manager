package de.media.manager.integration.selenium;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

import com.thoughtworks.selenium.DefaultSelenium;

public class AbstractBaseSelenium extends AbstractDependencyInjectionSpringContextTests{

	private static final Logger logger = Logger.getLogger(AbstractBaseSelenium.class); 

	private DefaultSelenium selenium;
	private StringBuffer verificationErrors = new StringBuffer();

	@Autowired
	protected SeleniumServerConfig seleniumServerConfig;
	
	protected String[] getConfigLocations() {
		return new String[] { "/selenium.xml"};
	}
	
	
	/** 
	 * Checks for verification errors 
	 * 
	 */
	
	public void checkForVerificationErrors() {		
		assertEquals("", verificationErrors.toString());
		clearVerificationErrors();
	}

	/** 
	 * Clears out the list of verification errors 
	 * 
	 */
	public void clearVerificationErrors() {
		verificationErrors = new StringBuffer();
	}

	@Override
	public void onTearDown() throws Exception {
		try {
			logger.debug("<END>AbstractSeleniumTest.onTearDown()");
			checkForVerificationErrors();
    	} finally {
    		selenium.stop();
    	}
	}
	
	/** 
	 * Gets the browser to be used in the test (specified in selenium.properties) 
	 * @param browser
	 * @return browserPath
	 * @throws InterruptedException
	 */

	protected String getTestBrowserIdentifier(String browser, String browserPath) throws InterruptedException {
		if (browser.equals("firefoxBrowser")) {
			browserPath = (seleniumServerConfig.getFirefoxBrowser());
		}
		else if (browser.equals("iexploreBrowser")) {
			browserPath = (seleniumServerConfig.getIexplorerBrowser());
		}
		else if (browser.equals("chromeBrowser")) {
			browserPath = (seleniumServerConfig.getChromeBrowser());
		}       	   
		else {
			browserPath = (seleniumServerConfig.getFirefoxBrowser());
		}	

		return browserPath;
	}

	/**
	 * 
	 * @param url
	 * @return
	 * @throws Exception
	 */
	protected DefaultSelenium createSeleniumClient(String url, String browser) throws Exception {
		String host = getSeleniumServerConfig().getSeleniumServerHost();
		int port = getSeleniumServerConfig().getSeleniumServerPort(); 
		String browserID = getTestBrowserIdentifier(browser,"");
		if (logger.isDebugEnabled()) {
			logger.debug("Before creating selenium client for " + browserID + " on: " + host + ":"+ port );
			logger.debug("url " + url );
		}
		return new DefaultSelenium(host,port,browserID,url);
	}
	
	/**
	 * @param seleniumServerConfig the seleniumServerConfig to set
	 */
	public void setSeleniumServerConfig(SeleniumServerConfig seleniumServerConfig) {
		this.seleniumServerConfig = seleniumServerConfig;
	}

	/**
	 * @return the selenium
	 */
	protected DefaultSelenium getSelenium() {
		return selenium;
	}

	/**
	 * @param selenium the selenium to set
	 */
	protected void setSelenium(DefaultSelenium selenium) {
		this.selenium = selenium;
	}
	
	/**
	 * @return the seleniumServerConfig
	 */
	public SeleniumServerConfig getSeleniumServerConfig() {
		return seleniumServerConfig;
	}

}
	
