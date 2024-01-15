package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class BasePage {
    protected final AndroidDriver driver;
    protected final WebDriverWait wait;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public static void switchToWebContext(final AndroidDriver driver) {
        Set<String> contextHandles = driver.getContextHandles();
        for (String context : contextHandles) {
            if (context.startsWith("WEBVIEW")) {
                driver.context(context);
                return;
            }
        }
    }

    public static void switchToNativeContext(final AndroidDriver driver) {
        driver.context("NATIVE_APP");
    }
}
