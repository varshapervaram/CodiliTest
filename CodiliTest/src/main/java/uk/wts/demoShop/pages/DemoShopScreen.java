package uk.wts.demoShop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.wts.demoShop.frameWork.BaseTest;

public class DemoShopScreen extends BaseTest {
    private WebElement bikiniAddToWishlist;
    private WebElement blackPantsAddToWishlist;
    private WebElement blackTrousersAddToWishlist;
    private WebElement eveningTrousersAddToWishlist;

    //Getters
    public WebElement getBikiniAddToWishlist() { return bikiniAddToWishlist; }
    public WebElement getBlackPantsAddToWishlist() { return blackPantsAddToWishlist; }
    public WebElement getBlackTrousersAddToWishlist() { return blackTrousersAddToWishlist; }
    public WebElement getEveningTrousersAddToWishlist() { return eveningTrousersAddToWishlist; }

    public DemoShopScreen(){
        bikiniAddToWishlist = driver.findElement(By.xpath("//*[@id=\"site-content\"]/div/div/article/ul/li[1]/div/div[2]/div/div/a"));
        blackPantsAddToWishlist = driver.findElement(By.xpath("//*[@id=\"site-content\"]/div/div/article/ul/li[2]/div/div[2]/div/div/a"));
        blackTrousersAddToWishlist = driver.findElement(By.xpath("//*[@id=\"site-content\"]/div/div/article/ul/li[3]/div/div[2]/div/div/a"));
        eveningTrousersAddToWishlist = driver.findElement(By.xpath("//*[@id=\"site-content\"]/div/div/article/ul/li[4]/div/div[2]/div/div/a"));
    }
}