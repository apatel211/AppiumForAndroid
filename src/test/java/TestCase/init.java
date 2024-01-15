package TestCase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.time.Duration;

public class init {

    private static AndroidDriver driver;

    public static AndroidDriver initializeDriver() {
        final UiAutomator2Options options = new UiAutomator2Options();
        options.setApp(Paths.get(System.getProperty("user.dir"), "src", "test", "testAndroidFile", "tw.apk").toString());
        options.setDeviceName("Pixel 7");
        options.setAvd("Pixel_7_API_31");
        options.setCapability("autoGrantPermissions", true);
        options.setAppWaitActivity("com.wallet.crypto.trustapp.ui.app.AppActivity");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;

    }


}
