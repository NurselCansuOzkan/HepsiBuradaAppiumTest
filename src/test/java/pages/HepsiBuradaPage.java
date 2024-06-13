package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;




public class HepsiBuradaPage {
    public HepsiBuradaPage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);

    }

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    public static WebElement allowButton;





}
