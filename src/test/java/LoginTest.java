import io.appium.java_client.AppiumBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {


    @Test(priority = 0)
    public void login() {
        WebElement username = androidDriver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc='test-Username']"));
        username.click();
        username.sendKeys("standard_user");

        WebElement password = androidDriver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc='test-Password']"));
        password.click();
        ;
        password.sendKeys("secret_sauce");

        WebElement loginButton = androidDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']"));
        loginButton.click();
    }
//    @Test(priority = 1)
//    public  void  ProductClick(){
//        WebElement Clicked= androidDriver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"test-Item\"])[1]/android.view.ViewGroup"));
//        Clicked.click();
//    }

    @Test(priority = 1)
    public  void Addcart(){
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement AddKart1 = androidDriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"ADD TO CART\"])[1]"));
        AddKart1.click();

        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement cart= androidDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView"));
        cart.click();

    }

@Test(priority = 3)
    public void  otherpro(){
       WebElement addmore=  androidDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"CONTINUE SHOPPING\"]"));
       addmore.click();
       WebElement item2= androidDriver.findElement(AppiumBy.accessibilityId("test-ADD TO CART"));
       item2.click();
    androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebElement cart= androidDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView"));
    cart.click();


}
@Test(priority = 4)
    public  void  checkout(){
    androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         WebElement check= androidDriver.findElement(By.xpath("//android.widget.TextView[@text=\"CHECKOUT\"]"));
         check.click();
         androidDriver.findElement(AppiumBy.accessibilityId("test-First Name")).sendKeys("om rastogi");
         androidDriver.findElement(AppiumBy.accessibilityId("test-Last Name")).sendKeys("Rastogi");
         androidDriver.findElement(AppiumBy.accessibilityId("test-Zip/Postal Code")).sendKeys("244713");
    androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         androidDriver.findElement(AppiumBy.accessibilityId("test-CONTINUE")).click();

}
@Test(priority = 5)
    public void last(){
        WebElement Finsh= androidDriver.findElement(AppiumBy.accessibilityId("test-FINISH"));
        Finsh.click();
    androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebElement checking = androidDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"THANK YOU FOR YOU ORDER\"]"));
    String text= checking.getText();
    Assert.assertEquals("THANK YOU FOR YOU ORDER",text);
    WebElement end= androidDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"BACK HOME\"]"));
    end.click();

}


}

