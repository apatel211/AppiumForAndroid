package org.example.page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;
import utils.helper;
import utils.logger;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class googleDriverPage extends BasePage {

    private final By backUpName = AppiumBy.xpath("//android.widget.TextView[@text='Backup name']");
    private final By editName = AppiumBy.xpath("//android.widget.EditText");
    private final By clickContinue = AppiumBy.xpath("//android.widget.TextView[@text='Continue']");

    private final By enterEmail = AppiumBy.xpath("//android.widget.TextView[@text='Continue']");

    private final By clickNext = AppiumBy.xpath("//android.widget.TextView[@text='Continue']");


    public googleDriverPage(final AndroidDriver driver) {

        super(driver);
    }

    public boolean backUpName(final AndroidDriver driver) {
        final boolean backUpElement = wait.until(visibilityOfElementLocated(this.backUpName)).isEnabled();
        wait.until(visibilityOfElementLocated(this.editName)).sendKeys("Temp");
        final WebElement continueElement = wait.until(visibilityOfElementLocated(this.clickContinue));
        helper.tap(driver, continueElement);
        logger.info("Set back up name successfully");
        return backUpElement;
    }

    public void enterEmailAndPassword(final AndroidDriver driver) {

        BasePage.switchToWebContext(driver);

        wait.until(visibilityOfElementLocated(this.enterEmail)).sendKeys("Temp");
        final WebElement nextElement = wait.until(visibilityOfElementLocated(this.clickNext));
        helper.tap(driver, nextElement);
        logger.info("Set email id successfully");

        BasePage.switchToNativeContext(driver);
    }
}
