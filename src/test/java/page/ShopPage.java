package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShopPage {
public ShopPage() {
    PageFactory.initElements(Driver.getDriver(), this);
}
@FindBy(xpath = "//li[@class='cat-item cat-item-23']")
public WebElement VoIPGateways;
@FindBy(linkText = "Quintum Tenor CMS MPC-8 supports H.323 or SIP intelligent call routing and QoS")
    public WebElement QuickView;
@FindBy(xpath = "//i[@class='icon-expand']")
    public WebElement enlargepicture;
@FindBy (xpath = "//button[@title='Next (Right arrow key)']")
    public WebElement viewPictures;
@FindBy (xpath = "//button[@title='Close (Esc)']")
    public WebElement closepicture;
@FindBy (xpath = "//p[@class='padT5']")
    public WebElement feature;
@FindBy (xpath = "//h1[@class='product-title entry-title']")
    public WebElement producttitle;
@FindBy (xpath = "//span[@class='woocommerce-Price-amount amount'][1]")
    public WebElement price;
@FindBy (xpath = "//div[@class='floatLeft padL20 width400']/ul/li")
    public WebElement list;
@FindBy (xpath = "//input[@type='button']")
    public WebElement quantitybutton;
@FindBy (xpath = "//button[@class='single_add_to_cart_button button alt']")
    public WebElement addtoCart;
@FindBy (xpath = "//a[@class='button checkout wc-forward']")
    public WebElement checkOut;
@FindBy (xpath = "//span[@class='header-cart-title']")
    public WebElement orderincart;




}
