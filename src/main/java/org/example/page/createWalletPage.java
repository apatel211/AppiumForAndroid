package org.example.page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;
import utils.helper;
import utils.logger;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class createWalletPage extends BasePage {

    private final By createNewWallet = AppiumBy.xpath("//android.widget.TextView[@text='Create new wallet']");
    private final By backUpManually = AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    private final By backGoogleDrive = AppiumBy.xpath("//android.widget.TextView[@text='Back up to Google Drive']");

    public createWalletPage(final AndroidDriver driver) {
        super(driver);
    }

    public boolean clickCreateNewWallet(final AndroidDriver driver) {
        final boolean createNewWalletText = wait.until(visibilityOfElementLocated(this.createNewWallet)).isEnabled();
        final WebElement createNewWalletElement = wait.until(visibilityOfElementLocated(this.createNewWallet));
        helper.tap(driver, createNewWalletElement);
        logger.info("Clicked on create new wallet successfully ");
        return createNewWalletText;
    }

    public boolean clickBackUpManually(final AndroidDriver driver) {
        final boolean backUpManuallyText = wait.until(visibilityOfElementLocated(this.backUpManually)).isEnabled();
        final WebElement backUpManuallyElement = wait.until(visibilityOfElementLocated(this.backUpManually));
        helper.tap(driver, backUpManuallyElement);
        logger.info("Clicked on back up manually successfully ");
        return backUpManuallyText;
    }

    public boolean clickBackGoogleDrive(final AndroidDriver driver) {
        final boolean backGoogleDriveText = wait.until(visibilityOfElementLocated(this.backGoogleDrive)).isEnabled();
        final WebElement backGoogleDriveElement = wait.until(visibilityOfElementLocated(this.backGoogleDrive));
        helper.tap(driver, backGoogleDriveElement);
        logger.info("Clicked on google drive back up successfully ");
        return backGoogleDriveText;
    }

}
