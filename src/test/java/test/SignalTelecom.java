package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.ShopPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class SignalTelecom {

    //When user go to  https://www.signal-telecom.com/shop/, user should click on VoIp Gateways under the Product Categories
    //TestSteps:
    // 1-Go to link https://www.signal-telecom.com/shop/
    // 2-Click on VoIp Gateways under the Product Categories

    //User should click on Quick View of Quintum Tenor CMS MPC-8 supports H.323 or SIP intelligent call routing and QoS
    //3- Click on Quick View of Quintum Tenor CMS MPC-8 supports H.323 or SIP intelligent call routing and QoS

    //After clicking on Quick View, the user should see the different pictures of this product by enlarging them.
    //4-See the different pictures of this product by enlarging them

    //User should see the title, price and the features of this product and should buy it as much as he/she wants.
    //5-User sees the title of the product
    //6-User sees the price of the product
    //7-User sees the features of the product
    //8-User buys the product as much as he/she wants

@Test
    public void shop(){
    ShopPage shopPage = new ShopPage();
    Actions actions = new Actions(Driver.getDriver());
    Driver.getDriver().get(ConfigReader.getProperty("signal_Url"));
    shopPage.VoIPGateways.click();
    shopPage.QuickView.click();
    shopPage.enlargepicture.click();
    shopPage.viewPictures.click();
//    try {
//        Thread.sleep(4000);
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    }

    actions.doubleClick(shopPage.viewPictures).perform();

    try {
        Thread.sleep(4000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    actions.doubleClick(shopPage.viewPictures).perform();
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    actions.doubleClick(shopPage.viewPictures).perform();
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    actions.doubleClick(shopPage.viewPictures).perform();

    shopPage.closepicture.click();
    //5-User sees the title of the product
    Assert.assertTrue(shopPage.producttitle.getText().contains("Quintum Tenor CMS MPC-8 supports H.323 or SIP intelligent call routing and QoS"));
    System.out.println(shopPage.producttitle.getText());

    //6-User sees the price of the product
  //  Assert.assertTrue(shopPage.price.getText().contains(" $4,999.00"));
    System.out.println(shopPage.price.getText());

//7-User sees the features of the product
    Assert.assertTrue(shopPage.feature.getText().contains("Features"));
    List<WebElement> list = Driver.getDriver().findElements(By.xpath("//div[@class='floatLeft padL20 width400']/ul/li"));
//listing the features
//    try {
//        Thread.sleep(3000);
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    }
//    for( WebElement product : list) {
//
//        System.out.println(product.getText());
//
//        System.out.println("*****");

        //8-User buys the product as much as he/she wants
        actions.doubleClick(shopPage.quantitybutton).perform();

        shopPage.addtoCart.click();
        shopPage.checkOut.click();
        //Veirfy to see "YOUR ORDER"
        Assert.assertTrue(shopPage.orderincart.getText().contains("CART / $4,999.00"));

        // hi everyone
        // hi

    }}



