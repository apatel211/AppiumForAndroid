package org.example.page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;
import utils.helper;
import utils.logger;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class setAndGetSecurityCodePage extends BasePage {

    private final By securityPageText = AppiumBy.xpath("//android.widget.TextView[@text='Secret phrase']");
    private final By word1 = AppiumBy.xpath("//android.widget.TextView[@index='0']");
    private final By word4 = AppiumBy.xpath("//android.widget.TextView[@index='6']");
    private final By word10 = AppiumBy.xpath("//android.widget.TextView[@index='7']");
    private final By word7 = AppiumBy.xpath("//android.widget.TextView[@index='1' and starts-with(@text, '7.')]");
    private final By continueSecurity = AppiumBy.xpath("//android.widget.TextView[@text='Continue']");
    private final By clickConfirm = AppiumBy.xpath("//android.widget.TextView[@text='Confirm']");

    public setAndGetSecurityCodePage(final AndroidDriver driver) {
        super(driver);
    }

    public boolean getSecurityCode(final AndroidDriver driver) {
        final boolean securityPageText = wait.until(visibilityOfElementLocated(this.securityPageText)).isEnabled();
        final String getWord1 = wait.until(visibilityOfElementLocated(this.word1)).getText();
        final String getWord4 = wait.until(visibilityOfElementLocated(this.word4)).getText();
        final String getWord7 = wait.until(visibilityOfElementLocated(this.word7)).getText();
        final String getWord10 = wait.until(visibilityOfElementLocated(this.word10)).getText();
        final WebElement continueSecurity = wait.until(visibilityOfElementLocated(this.continueSecurity));
        helper.tap(driver, continueSecurity);

        helper.tap(driver, wait.until(visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text='" + helper.extractText(getWord1) + "']"))));
        helper.tap(driver, wait.until(visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text='" + helper.extractText(getWord4) + "']"))));
        helper.tap(driver, wait.until(visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text='" + helper.extractText(getWord7) + "']"))));
        helper.tap(driver, wait.until(visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text='" + helper.extractText(getWord10) + "']"))));
        logger.info("Get security code successfully ");
        return securityPageText;
    }
    
    public boolean setSecurityCode(final AndroidDriver driver) {
        final boolean clickConfirmText = wait.until(visibilityOfElementLocated(this.clickConfirm)).isEnabled();
        final WebElement clickConfirm = wait.until(visibilityOfElementLocated(this.clickConfirm));
        helper.tap(driver, clickConfirm);
        logger.info("Set security code successfully ");
        return clickConfirmText;
    }
}
