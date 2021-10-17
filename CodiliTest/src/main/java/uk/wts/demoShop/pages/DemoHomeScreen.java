package uk.wts.demoShop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.wts.demoShop.frameWork.BaseTest;

public class DemoHomeScreen extends BaseTest {

    private WebElement shopTab;
    private WebElement myWishListIcon;
    private WebElement cartIcon;

    public WebElement getShopTab() { return shopTab; }
    public WebElement getMyWishListIcon() { return myWishListIcon; }
    public WebElement getCartIcon() { return cartIcon; }

    public DemoHomeScreen(){
        shopTab = driver.findElement(By.cssSelector("li#menu-item-310>a"));
        myWishListIcon = driver.findElement(By.xpath("//*[@class=\"header-right col-md-3 hidden-xs\"]/div[3]"));
        cartIcon = driver.findElement(By.xpath("//div[@class=\"header-right col-md-3 hidden-xs\"]/div[1]"));
    }
}
