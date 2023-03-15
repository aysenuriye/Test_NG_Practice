package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.OtomasyonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class Pratik3 {

    OtomasyonPage otomasyonPage = new OtomasyonPage();

    @Test
    public void test01() {

        //2) Enter the URL “http://practice.automationtesting.in/”

        Driver.getDriver().get(ConfigReader.getProperty("practiceUrl"));

        //3) Click on Shop Menu

        otomasyonPage.shopbox.click();
        //4) Click on Sort by High to Low Item in Default sorting dropdown
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().forward();
        Select select = new Select(otomasyonPage.ordeyborbox);

        select.selectByVisibleText("Sort by price: high to low");


         // Kullanıcı fiyatların yükselten alçağa doğru oldupunu doğrular

        List<String> fiyatlarList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            if (i != 2 && i != 4) {

                fiyatlarList.add(Driver.getDriver().findElement(By.xpath("(//*[@class='woocommerce-Price-amount amount'])[" + i + "]")).getText());

            }
        }
        System.out.println(fiyatlarList);

        List<String> expectedFiyatlar = new ArrayList<>();
        expectedFiyatlar.add("₹500.00");
        expectedFiyatlar.add("₹450.00");
        expectedFiyatlar.add("₹400.00");
        expectedFiyatlar.add("₹350.00");
        expectedFiyatlar.add("₹280.00");
        expectedFiyatlar.add("₹250.00");
        expectedFiyatlar.add("₹180.00");
        expectedFiyatlar.add("₹150.00");

        Assert.assertEquals(fiyatlarList, expectedFiyatlar);

    }
}


