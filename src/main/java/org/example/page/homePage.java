package org.example.page;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;
import utils.helper;
import utils.logger;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class homePage extends BasePage {

    private final By welcomePage = AppiumBy.xpath("//android.widget.TextView[@text='Welcome aboard']");
    private final By startUsingTrustWalletPage = AppiumBy.xpath("//android.widget.TextView[@text='Start using Trust Wallet']");
    private final By homePage = AppiumBy.xpath("(//android.widget.TextView[@text='Home'])[1]");

    public homePage(final AndroidDriver driver) {
        super(driver);
    }

    public boolean enterWelcomePage(final AndroidDriver driver) {
        final boolean enterWelcomePageElement = wait.until(visibilityOfElementLocated(this.welcomePage)).isEnabled();
        logger.info("Clicked on eWelcome Page  successfully ");
        final WebElement startUsingTrustWalletPageElement = wait.until(visibilityOfElementLocated(this.startUsingTrustWalletPage));
        helper.tap(driver, startUsingTrustWalletPageElement);
        logger.info(" Clicked on start Using Trust Wallet successfully ");
        return enterWelcomePageElement;
    }


    public boolean enterHomePage() {
        final boolean homePageElement = wait.until(visibilityOfElementLocated(this.homePage)).isEnabled();
        logger.info("Clicked on home Page  successfully ");
        return homePageElement;

    }
}

