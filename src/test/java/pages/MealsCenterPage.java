package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class MealsCenterPage {

    public MealsCenterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()='Food']")
    public WebElement foodlink;
    @FindBy(xpath = "//a[text()='Category']")
    public WebElement categortLink;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement usernameButton;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordButton;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginSignInButton;

 public void loginMethod() {
    //kullanıcı Merchant giris = https://qa.mealscenter.com/backoffice/auth/login sayfaya gider

    Driver.getDriver().get(ConfigReader.getProperty("merchantUrl"));

    //kullanıcı giriş sayfasında  username ve passwordu bilgilerini girip giriş yapar

    ReusableMethods.bekle(2);
    MealsCenterPage mealsCenterPage = new MealsCenterPage();
    mealsCenterPage.usernameButton.sendKeys("thaiAdmin");
    ReusableMethods.bekle(2);

    mealsCenterPage.passwordButton.sendKeys("1234567");
    mealsCenterPage.loginSignInButton.click();

}
    public void categoryGiris() {
        MealsCenterPage mealsCenterPage = new MealsCenterPage();
        mealsCenterPage.loginMethod();
        mealsCenterPage.foodlink.click();
        ReusableMethods.bekle(1);
        mealsCenterPage.categortLink.click();

    }


}
