package TestCase;

import io.appium.java_client.android.AndroidDriver;
import org.example.page.*;
import org.testng.Assert;
import utils.BasePage;
import utils.logger;

public class createWalletUnhappyCoverage extends BasePage {

    public createWalletUnhappyCoverage(AndroidDriver driver) {
        super(driver);
    }

    public void testCreateWalletUnsuccessfullyManually() {

        logger.startTestCase("Create wallet unsuccesfully ");
        final landingPage homePage = new landingPage(driver);
        Assert.assertTrue(homePage.clickGetStarted(driver));

        final createWalletPage createWallet = new createWalletPage(driver);
        Assert.assertTrue(createWallet.clickCreateNewWallet(driver));
        Assert.assertTrue(createWallet.clickBackUpManually(driver));

        final termsAndConditionPage termAndCondition = new termsAndConditionPage(driver);
        Assert.assertTrue(termAndCondition.clickTermAndConditionAndContinue(driver));

        final setAndGetSecurityCodePage setAndGetSecurityCode = new setAndGetSecurityCodePage(driver);
        Assert.assertTrue(setAndGetSecurityCode.getSecurityCode(driver));
        Assert.assertTrue(setAndGetSecurityCode.setSecurityCode(driver));

        final setPasscodePage setPasscode = new setPasscodePage(driver);
        Assert.assertTrue(setPasscode.enterPassword(driver));
        Assert.assertTrue(setPasscode.enterIncorrectConfirmPassword(driver));
        Assert.assertTrue(setPasscode.incorrectPasswordMessage());

        logger.info("Happy Test - Create Wallet unsuccessfully completed");

    }

    public void testCreateWalletUnsuccessfullyGoogleDrive() {

        logger.startTestCase("Create wallet successfully google drive");

        final landingPage homePage = new landingPage(driver);
        Assert.assertTrue(homePage.clickGetStarted(driver));

        final createWalletPage createWallet = new createWalletPage(driver);
        Assert.assertTrue(createWallet.clickCreateNewWallet(driver));
        Assert.assertTrue(createWallet.clickBackGoogleDrive(driver));

        final googleDriverPage googleDriver = new googleDriverPage(driver);
        Assert.assertTrue(googleDriver.backUpName(driver));

//        final setAndGetSecurityCodePage setAndGetSecurityCode = new setAndGetSecurityCodePage(driver);
//        Assert.assertTrue(setAndGetSecurityCode.getSecurityCode(driver));
//        Assert.assertTrue(setAndGetSecurityCode.setSecurityCode(driver));
//
//        final setPasscodePage setPasscode = new setPasscodePage(driver);
//        Assert.assertTrue(setPasscode.enterPassword(driver));
//        Assert.assertTrue(setPasscode.enterCorrectConfirmPassword(driver));
//
//        final homePage home = new homePage(driver);
//        Assert.assertTrue(home.enterWelcomePage(driver));
//        Assert.assertTrue(home.enterHomePage());

        logger.info("Happy Test - Create Wallet unsuccessfully completed");
    }
}
