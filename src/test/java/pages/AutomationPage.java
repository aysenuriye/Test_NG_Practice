package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {

    public AutomationPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//img[@alt = 'Website for automation practice']")
    public WebElement basariliGirisElementi;

    @FindBy(xpath = "(//*[@alt='ecommerce website products'])[1]")
    public WebElement urun;


    @FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])["+2+"]")
    public WebElement addToCart;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath = "//*[text()='Shopping Cart']")
    public WebElement cartVerify;

    @FindBy (xpath = "//a[@class='cart_quantity_delete']")
    public WebElement xButton;
}