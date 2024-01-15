package org.example.page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;
import utils.helper;
import utils.logger;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class termsAndConditionPage extends BasePage {
    private final By tc1 = AppiumBy.xpath("//android.widget.TextView[@text='Trust Wallet does not keep a copy of your secret phrase.']");
    private final By tc2 = AppiumBy.xpath("//android.widget.TextView[@text='Saving this digitally in plain text is NOT recommended. Examples include screenshots, text files, or emailing yourself']");
    private final By tc3 = AppiumBy.xpath("//android.widget.TextView[@text='Write down your secret phrase, and store it in a secure offline location!']");
    private final By continueButton = AppiumBy.xpath("//android.widget.ScrollView/android.view.View[4]/android.widget.Button");

    public termsAndConditionPage(final AndroidDriver driver) {
        super(driver);
    }

    public boolean clickTermAndConditionAndContinue(final AndroidDriver driver) {
        final boolean continueElementText = wait.until(visibilityOfElementLocated(this.continueButton)).isEnabled();
        final WebElement tc1Element = wait.until(visibilityOfElementLocated(this.tc1));
        final WebElement tc2Element = wait.until(visibilityOfElementLocated(this.tc2));
        final WebElement tc3Element = wait.until(visibilityOfElementLocated(this.tc3));
        final WebElement continueElement = wait.until(visibilityOfElementLocated(this.continueButton));
        helper.tap(driver, tc1Element);
        helper.tap(driver, tc2Element);
        helper.tap(driver, tc3Element);
        helper.tap(driver, continueElement);
        logger.info("Select all terms &conditions successfully ");
        return continueElementText;
    }

}
