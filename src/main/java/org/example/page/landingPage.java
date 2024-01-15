package org.example.page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;
import utils.helper;
import utils.logger;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class landingPage extends BasePage {

    private final By GetStartedButton = AppiumBy.xpath("//android.widget.TextView[@text='Get Started']");

    public landingPage(final AndroidDriver driver) {
        super(driver);
    }

    public boolean clickGetStarted(final AndroidDriver driver) {
        final boolean messageText = wait.until(visibilityOfElementLocated(this.GetStartedButton)).isEnabled();
        final WebElement getStartedElement = wait.until(visibilityOfElementLocated(this.GetStartedButton));
        helper.tap(driver, getStartedElement);
        logger.info("Get started page open successfully ");
        return messageText;

    }

}
