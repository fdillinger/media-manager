package de.media.manager.integration.selenium;

import org.apache.log4j.Logger;



public class SeleniumServerConfig {
	
	private static Logger logger = Logger.getLogger(SeleniumServerConfig.class);

	/** The default WEB_APP_URL. */
	public final  static String WEB_APP_URL = "http://localhost:1225";

	/** The default WEB_CONTEXT_NAME. */
	public final  static String WEB_CONTEXT_NAME = "webcontracts-webapp-2.3.0-SNAPSHOT";

	/** The default SELENIUM_HOST. */
	public final  static String SELENIUM_HOST = "localhost";

	/** The default SELENIUM_PORT. */
	public final  static int SELENIUM_PORT = 4444;

	/** The default CONTRACT_INITIATOR_LOGIN. */
	//public final  static String CONTRACT_INITIATOR_LOGIN = "jsprenger";

	/** The default EX_ANTE_LOGIN. */
	//public final  static String EX_ANTE_LOGIN = "greinsch";

	/** The default CONTRACT_ARCHIVIST_LOGIN. */
	//public final  static String CONTRACT_ARCHIVIST_LOGIN = "iurquhart"; 

	/** The default GROUP. */
	//public final  static String GROUP = "Test_Group"; 

	/** The default AWARD_INITIATOR_LOGIN. */
	//public final  static String AWARD_INITIATOR_LOGIN = "gferguson"; 
	
	/** The default FINANCIAL_YEAR. */
	//public final  static String FINANCIAL_YEAR = "nextYear";

	/** The default *_BROWSER paths. */
	public final static String FIREFOX_BROWSER = "*firefox R:/Program Files/Mozilla Firefox/ffBrowser.exe";
	public final static String IEXPLORER_BROWSER = "*iexplore C:/Program Files/Internet Explorer/iexplore.exe";
	public final static String CHROME_BROWSER = "*googlechrome C:/Documents and Settings/gferguson/Local Settings/Application Data/Google/Chrome/Application/chrome.exe";
	public final static String CURRENT_TEST_BROWSER = "firefoxBrowser";

	/** 
	 * The web app url. 
	 * initialised to the default jetty value - http://localhost:1225
	 */
	private String webAppUrl = WEB_APP_URL;
	private String urlBase = "http://";

	/** 
	 * The browser path. 
	 * initialised to the default
	 */    
//	private String contractInitiatorLogin = CONTRACT_INITIATOR_LOGIN;
//	private String exAnteLogin = EX_ANTE_LOGIN;
//	private String contractArchivistLogin = CONTRACT_ARCHIVIST_LOGIN;
//	private String awardInitiatorLogin = AWARD_INITIATOR_LOGIN;
//	private String group = GROUP;
//	private String financialYear = FINANCIAL_YEAR;

	/** 
	 * The user logins. 
	 * initialised to the default
	 */    
	private String currentTestBrowser = CURRENT_TEST_BROWSER;
	private String firefoxBrowser = FIREFOX_BROWSER;
	private String iexplorerBrowser = IEXPLORER_BROWSER;
	private String chromeBrowser = CHROME_BROWSER;



	/** 
	 * The web app context name.     
	 * initialised to the default value - "webcontracts-webapp"
	 */
	private String webAppContextName = WEB_CONTEXT_NAME;

	/** 
	 * The selenium server host.   
	 * initialised to the default value - localhoast
	 */
	private String seleniumServerHost = SELENIUM_HOST;

	/** 
	 * The selenium server port.     
	 * initialised to the default value - 4444 
	 */
	private int seleniumServerPort = SELENIUM_PORT;

	/**
	 * default constructor
	 * Results in the default values being used for all properties.
	 */
	public SeleniumServerConfig () {
		super();
		if (logger.isDebugEnabled()) {
			logger.debug("SeleniumServerConfig constructed");
		}
	}

	/**
	 * Gets the web app url.
	 * 
	 * @return the webAppUrl
	 */
	public String getWebAppUrl() {
		return webAppUrl;
	}

	/**
	 * Sets the web app url.
	 * 
	 * @param webAppUrl the webAppUrl to set
	 */
	public void setWebAppUrl(String webAppUrl) {
		this.webAppUrl = webAppUrl;
	}

	/**
	 * Gets the web app context name.
	 * 
	 * @return the webAppContextName
	 */
	public String getWebAppContextName() {
		return webAppContextName;
	}

	/**
	 * Sets the web app context name.
	 * 
	 * @param webAppContextName the webAppContextName to set
	 */
	public void setWebAppContextName(String webAppContextName) {
		this.webAppContextName = webAppContextName;
	}

	public String getCurrentTestBrowser() {
		return currentTestBrowser;

	}

	public void setCurrentTestBrowser(String currentTestBrowser) {
		this.currentTestBrowser = currentTestBrowser;

	}

	/**
	 * Gets the selenium server host.
	 * 
	 * @return the seleniumServerHost
	 */
	public String getSeleniumServerHost() {
		return seleniumServerHost;
	}

	/**
	 * Sets the selenium server host.
	 * 
	 * @param seleniumServerHost the seleniumServerHost to set
	 */
	public void setSeleniumServerHost(String seleniumServerHost) {
		this.seleniumServerHost = seleniumServerHost;
	}

	/**
	 * Gets the selenium server port.
	 * 
	 * @return the seleniumServerPort
	 */
	public int getSeleniumServerPort() {
		return seleniumServerPort;
	}

	/**
	 * Sets the selenium server port.
	 * 
	 * @param seleniumServerPort the seleniumServerPort to set
	 */
	public void setSeleniumServerPort(int seleniumServerPort) {
		this.seleniumServerPort = seleniumServerPort;
	}

	public String getUrlBase() {
		return urlBase;
	}

	public void setUrlBase(String urlBase) {
		this.urlBase = urlBase;
	}

	public String getFirefoxBrowser() {
		return firefoxBrowser;

	}

	public void setFirefoxBrowser(String firefoxBrowser) {
		this.firefoxBrowser = firefoxBrowser;

	}	

	public String getIexplorerBrowser() {
		return iexplorerBrowser;

	}

	public void setIexplorerBrowser(String iexplorerBrowser) {
		this.iexplorerBrowser = iexplorerBrowser;

	}	

	public String getChromeBrowser() {
		return chromeBrowser;

	}

	public void setChromeBrowser(String chromeBrowser) {
		this.chromeBrowser = chromeBrowser;

	}	

//	public String getContractInitiatorLogin() {
//		return contractInitiatorLogin;
//	}

//	public void setContractInitiatorLogin(String contractInitiatorLogin) {
//		this.contractInitiatorLogin = contractInitiatorLogin;
//	}

//	public String getExAnteLogin() {
//		return exAnteLogin;
//	}

//	public void setExAnteLogin(String exAnteLogin) {
//		this.exAnteLogin = exAnteLogin;
//	}

//	public String getContractArchivistLogin() {
//		return contractArchivistLogin;
//	}

//	public void setContractArchivistLogin(String contractArchivistLogin) {
//		this.contractArchivistLogin = contractArchivistLogin;
//	}

//	public String getAwardInitiatorLogin() {
//		return awardInitiatorLogin;
//	}

//	public void setAwardInitiatorLogin(String awardInitiatorLogin) {
//		this.awardInitiatorLogin = awardInitiatorLogin;
//	}

//	public String getGroup() {
//		return group;
//	}

//	public void setGroup(String group) {
//		this.group = group;
//	}

//	public String getFinancialYear() {
//		return financialYear;
//	}

//	public void setFinancialYear(String financialYear) {
//		this.financialYear = financialYear;
//	}
	
	
}
