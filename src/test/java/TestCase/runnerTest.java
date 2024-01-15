package TestCase;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class runnerTest {

    private AndroidDriver driver;

    @BeforeMethod
    public void setupClass() {
        driver = init.initializeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }

    @Test(description = "UnHappy Case Manually", priority = 2)
    public void testCreateWalletUnsuccessfullyManually() {
        final createWalletUnhappyCoverage tc = new createWalletUnhappyCoverage(driver);
        tc.testCreateWalletUnsuccessfullyManually();
    }

    @Test(description = "Happy Case Manually", priority = 1)
    public void testCreateWalletSuccessfullyManually() {
        final createWalletHappyCoverage tc = new createWalletHappyCoverage(driver);
        tc.testCreateWalletSuccessfullyManually();
    }

    @Test(description = "UnHappy Case googleDrive", priority = 3)
    public void testCreateWalletSuccessfullyGoogleDrive() {
        final createWalletUnhappyCoverage tc = new createWalletUnhappyCoverage(driver);
        tc.testCreateWalletUnsuccessfullyGoogleDrive();
    }


}
