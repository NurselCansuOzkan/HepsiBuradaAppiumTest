import org.testng.annotations.Test;
import pages.HepsiBuradaPage;
import utils.Driver;

public class HepsiBurada {
    HepsiBuradaPage elements = new HepsiBuradaPage();
    @Test
    public void Test1(){
        Driver.getDriver();
        elements.allowButton.click();

    }

/*    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        //Appium sunucusuna bağlanmak için gerekli bilgiler

      *//*  DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 API 33");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/nurselcansu/IdeaProjects/AppiumDersleri/Apps/Hepsiburada.apk");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.hepsiburada.ui.startup.SplashActivity");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.pozitron.hepsiburada");
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30);


        //Appium sunucusuna bağlanma URL'ini oluştur


        //Url url = new Url("http://localhost:4723/wd/hub");
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);*//*





        *//*try {
           *//**//* MobileElement button = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
           // MobileElement button = driver.findElement(By.xpath(""]"));
            Wait<WebDriver> wait = new WebDriverWait(driver, 10);
            wait.until(d -> button.isDisplayed());
            button.click();*//**//*

           *//**//* WebElement hizmetler = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.pozitron.hepsiburada:id/menuItemAllFakeView")));
            hizmetler.click();*//**//*

            MobileElement search = driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox"));
            search.click();
            MobileElement searchText = driver.findElement(By.className("android.widget.EditText"));
            searchText.sendKeys("Karaca");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }*//*





    }*/
}
