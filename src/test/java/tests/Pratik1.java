package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.OtomasyonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pratik1 {
  OtomasyonPage otomasyonPage=new OtomasyonPage();

  //1) Open the browser
  //2) Enter the URL “http://practice.automationtesting.in/”
  //3) Click on Shop Menu
      //4) Now click on Home menu button
  //5) Test whether the Home page has Three Sliders only
  //6) The Home page must contains only three sliders

  //1) Open the browser

  @Test
                public void test01anasayfayagitme() throws InterruptedException {

      Driver.getDriver().get(ConfigReader.getProperty("practiceUrl"));

      Driver.getDriver().navigate().refresh();
      otomasyonPage.shopbox.click();
      Driver.getDriver().navigate().back();
      Driver.getDriver().navigate().forward();
      // Ana sayfa menüsüne tıkla
      otomasyonPage.homebutton.click();
      // Sayfadaki kaydırıcıların sayısını kontrol et
      int sliders = Driver.getDriver().findElements(By.className("n2-ss-slide")).size();
      System.out.println(sliders);
      Assert.assertEquals(3,sliders);



      // Close the browser


  }


         }





