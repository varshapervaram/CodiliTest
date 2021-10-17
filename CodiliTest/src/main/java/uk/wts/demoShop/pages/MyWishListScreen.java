package uk.wts.demoShop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.wts.demoShop.frameWork.BaseTest;

public class MyWishListScreen extends BaseTest {

    private WebElement item4AddToCart;

    public WebElement getItem4AddToCart() { return item4AddToCart; }

    public MyWishListScreen(){
        item4AddToCart = driver.findElement(By.xpath("//tr[@id=\"yith-wcwl-row-22\"]/td[6]"));
    }
}
