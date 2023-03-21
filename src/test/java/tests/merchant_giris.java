package tests;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.MealsCenterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


import static utilities.Driver.getDriver;

public class merchant_giris {
    MealsCenterPage mealsCenterPage = new MealsCenterPage();

    @Test
    public void test01() {
    mealsCenterPage.categoryGiris();
        //Down-casting our driver type to JavascriptExecutor,
        // so we are able to use the methods coming from that interface
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //3- Scroll down to “Cydeo” link
ReusableMethods.bekle(2);
        js.executeScript("arguments[0].scrollIntoView(true)", mealsCenterPage.categoryNextButton);

        //4- Scroll up to “Home” link
ReusableMethods.bekle(2);
mealsCenterPage.categoryNextButton.click();
ReusableMethods.bekle(1);
        js.executeScript("arguments[0].scrollIntoView(true)", mealsCenterPage.categoryPreviousButton);
        ReusableMethods.bekle(1);
        mealsCenterPage.categoryPreviousButton.click();

        //js.executeScript("arguments[1].scrollIntoView(true)", cydeoLink, homeLink);
       // js.executeScript("arguments[0].scrollIntoView(true)", homeLink);



//Actions actions=new Actions(Driver.getDriver());
//actions.scrollToElement(mealsCenterPage.categoryNextButton);
//
//actions.click(mealsCenterPage.categoryNextButton);

    }
}

