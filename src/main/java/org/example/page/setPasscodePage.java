package org.example.page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;
import utils.helper;
import utils.logger;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class setPasscodePage extends BasePage {

    private final By enterPassword = AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]");
    private final By correctPassword = AppiumBy.xpath("//android.widget.TextView[@text='1']");
    private final By incorrectPassword = AppiumBy.xpath("//android.widget.TextView[@text='2']");

    private final By incorrectPasswordMessage = AppiumBy.xpath("//android.widget.TextView[@text='Those passwords didn’t match!']");

    public setPasscodePage(final AndroidDriver driver) {
        super(driver);
    }

    public boolean enterPassword(final AndroidDriver driver) {
        final boolean enterPasswordElement = wait.until(visibilityOfElementLocated(this.enterPassword)).isEnabled();
        logger.info("Clicked on enter Password successfully ");
        final WebElement correctPasswordElement = wait.until(visibilityOfElementLocated(this.correctPassword));
        helper.tap(driver, correctPasswordElement);
        helper.tap(driver, correctPasswordElement);
        helper.tap(driver, correctPasswordElement);
        helper.tap(driver, correctPasswordElement);
        helper.tap(driver, correctPasswordElement);
        helper.tap(driver, correctPasswordElement);
        logger.info(" enter Password successfully ");
        return enterPasswordElement;
    }

    public boolean enterCorrectConfirmPassword(final AndroidDriver driver) {
        final boolean confirmPassword = enterPassword(driver);
        return confirmPassword;
    }

    public boolean enterIncorrectConfirmPassword(final AndroidDriver driver) {
        final boolean enterPasswordElement = wait.until(visibilityOfElementLocated(this.enterPassword)).isEnabled();
        logger.info("Clicked on enter Password successfully ");
        final WebElement correctPasswordElement = wait.until(visibilityOfElementLocated(this.incorrectPassword));
        helper.tap(driver, correctPasswordElement);
        helper.tap(driver, correctPasswordElement);
        helper.tap(driver, correctPasswordElement);
        helper.tap(driver, correctPasswordElement);
        helper.tap(driver, correctPasswordElement);
        helper.tap(driver, correctPasswordElement);
        logger.info(" enter Password unsuccessfully ");
        return enterPasswordElement;
    }

    public boolean incorrectPasswordMessage() {
        final boolean incorrectPasswordMessageElement = wait.until(visibilityOfElementLocated(this.incorrectPasswordMessage)).isEnabled();
        logger.info("Those psswords didn't match ");
        return incorrectPasswordMessageElement;
    }

}
