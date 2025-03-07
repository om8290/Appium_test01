import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;





public class BaseTest {
    public AndroidDriver androidDriver;

    @BeforeClass
    public void appiumDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setPlatformVersion("15");
        options.setUdid("00055343C001574");
         options.setAutomationName("UiAutomator2");

        options.setAppActivity("com.swaglabsmobileapp.MainActivity");
        options.setAppWaitDuration(Duration.ofSeconds(20));
        options.setNewCommandTimeout(Duration.ofMinutes(30));
        options.setCapability("autoGrantPermission", true);
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

}
