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
    @FindBy(xpath = "//div[@class='p-2']")
   public WebElement categoryAddLink;
    @FindBy(xpath = "//i[@class='zmdi zmdi-sort-asc']")
    public WebElement categoryShortLink;
    @FindBy(xpath = "//a[@href='/backoffice/food/category_update/id/72']")
    public  WebElement categoryUpdate;
    @FindBy(xpath = "//a[@data-id='72']")
    public WebElement categoryDelete;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement categorySearchtext;
    @FindBy(xpath = "//i[@class='zmdi zmdi-search']")
    public  WebElement categorySearchButton;
    @FindBy(xpath = "//a[text()='Next']")
    public WebElement categoryNextButton;
    @FindBy(xpath = "//a[text()='Previous']")
    public  WebElement categoryPreviousButton;

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
    public void categoryIlkaddLink() {
        MealsCenterPage mealsCenterPage = new MealsCenterPage();
        mealsCenterPage.categoryGiris();
        mealsCenterPage.categoryAddLink.click();

    }
    public void categoryIlkShortLink() {
        MealsCenterPage mealsCenterPage = new MealsCenterPage();
        mealsCenterPage.categoryGiris();
        mealsCenterPage.categoryShortLink.click();

    }
    public void categoryUpdateLink() {
        MealsCenterPage mealsCenterPage = new MealsCenterPage();
        mealsCenterPage.categoryGiris();
        mealsCenterPage.categoryUpdate.click();

    }
    public void categoryDeleteLink() {
        MealsCenterPage mealsCenterPage = new MealsCenterPage();
        mealsCenterPage.categoryGiris();
        mealsCenterPage.categoryDelete.click();

    }




}
