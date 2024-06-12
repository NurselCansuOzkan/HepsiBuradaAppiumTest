import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class HepsiBurada {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        //Appium sunucusuna bağlanmak için gerekli bilgiler

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 API 33");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/nurselcansu/IdeaProjects/AppiumDersleri/Apps/Hepsiburada.apk");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.hepsiburada.ui.startup.SplashActivity");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.pozitron.hepsiburada");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30);


        //Appium sunucusuna bağlanma URL'ini oluştur


        //Url url = new Url("http://localhost:4723/wd/hub");
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);





        try {
           /* MobileElement button = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
           // MobileElement button = driver.findElement(By.xpath(""]"));
            Wait<WebDriver> wait = new WebDriverWait(driver, 10);
            wait.until(d -> button.isDisplayed());
            button.click();*/

           /* WebElement hizmetler = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.pozitron.hepsiburada:id/menuItemAllFakeView")));
            hizmetler.click();*/

            MobileElement search = driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox"));
            search.click();
            MobileElement searchText = driver.findElement(By.className("android.widget.EditText"));
            searchText.sendKeys("Karaca");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }





    }
}
