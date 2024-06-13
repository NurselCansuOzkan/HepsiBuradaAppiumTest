package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {
    private static UiAutomator2Options options;

    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {

        if(driver == null){
            switch (ConfigReader.getProperty("platformName")){
                case "android":
                    options = new UiAutomator2Options();
                    options.setAppPackage(ConfigReader.getProperty("appPackage"));
                    options.setAppActivity(ConfigReader.getProperty("appActivity"));
                    //options.setUdid("");
                    options.setNoReset(false);
                    options.setDeviceName(ConfigReader.getProperty("deviceName"));
                    options.setPlatformName(ConfigReader.getProperty("platformName"));
                    options.setPlatformVersion(ConfigReader.getProperty("platformVersion"));
                    options.setNewCommandTimeout(Duration.ofMinutes(Integer.parseInt(ConfigReader.getProperty("newCommandTimeout"))));
                    //driver = new AppiumDriver(HttpClient.Factory.create(ConfigReader.getProperty("url")), options);
                    break;
                case "ios":
                    break;
                default:
                    throw new RuntimeException("Invalid platform name");

            }

            try {
                driver = new AppiumDriver(new URL("http://127.0.0.1:4723"), options);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(ConfigReader.getProperty("implicitlyWait"))));
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }

        }
        return driver;
    }
}
