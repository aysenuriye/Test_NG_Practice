package tests;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.NoSuchElementException;

import static org.testng.AssertJUnit.*;

public class pratik_6 {
    AutomationPage automationPage = new AutomationPage();

    @Test
    public void test01() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that home page is visible successfully
        assertTrue(automationPage.basariliGirisElementi.isDisplayed());
        //4. Add products to cart
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(automationPage.urun);
        //5. Click 'Cart' button
        automationPage.addToCart.click();

        //6. Verify that cart page is displayed
        automationPage.viewCart.click();
        assertTrue(automationPage.cartVerify.isDisplayed());
        //7. Click 'X' button corresponding to particular product
        automationPage.xButton.click();
        //8. Verify that product is removed from the cart
        ReusableMethods.bekle(3);
        try {
            assertFalse(automationPage.urun.isDisplayed());
        } catch (NoSuchElementException e) {
            assertTrue(true);

        }

        Driver.quitDriver();
    }
}

