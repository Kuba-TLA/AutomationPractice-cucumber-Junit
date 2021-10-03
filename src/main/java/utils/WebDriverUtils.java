package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WebDriverUtils {
    //singleton WebDriver
    private static WebDriver driver = null;
    private static String sauceUsername = ConfigReader.readProperty("sauceUser");
    private static String sauceKey = ConfigReader.readProperty("sauceKey");
    private static String URL = "https://" + sauceUsername + ":" + sauceKey + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";

    private WebDriverUtils(){}

    public static WebDriver getDriver(){
        if(driver == null)
            initializeDriver();
        return driver;
    }

    public static void quitDriver(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static void closeDriver(){
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

    private static void initializeDriver() {
        if(ConfigReader.readProperty("runInSaucelabs").equals("true")){
            driver = getRemoteDriver();
        }else {
            switch (ConfigReader.readProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
            }
        }
//        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static WebDriver getRemoteDriver(){
        WebDriver driver = null;
        try {
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability("browserName","chrome");
            capabilities.setCapability("version", ConfigReader.readProperty("browser_version"));
            capabilities.setCapability("platform", ConfigReader.readProperty("os"));
            driver = new RemoteWebDriver(new URL(URL), capabilities);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return driver;
    }

}
