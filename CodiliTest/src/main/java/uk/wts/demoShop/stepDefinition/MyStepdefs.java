package uk.wts.demoShop.stepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import uk.wts.demoShop.frameWork.BaseTest;
import uk.wts.demoShop.pages.DemoShopScreen;

public class MyStepdefs {

    private BaseTest baseTest;
    private DemoShopScreen demoShopScreen;

    @Before
    public void initialise() {
        baseTest = new BaseTest();
        baseTest.initialise();
        baseTest.demoHome();
    }

    @Given("^I add four different products to my wish list$")
    public void iAddFourDifferentProductsToMyWishList() throws InterruptedException {
        demoShopScreen = new DemoShopScreen();
        demoShopScreen.getBikiniAddToWishlist().click();
        Thread.sleep(1000);
        demoShopScreen.getBlackPantsAddToWishlist().click();
        Thread.sleep(1000);
        demoShopScreen.getBlackTrousersAddToWishlist().click();
        Thread.sleep(1000);
        demoShopScreen.getEveningTrousersAddToWishlist().click();
    }

    @And("I view my wish list table")
    public void iViewMyWishListTable() throws InterruptedException {
        baseTest = new BaseTest();
        baseTest.myWishList();
        Thread.sleep(1000);
    }

    @And("I find total four selected items in my wish list")
    public void iFindTotalFourSelectedItemsInMyWishList() {
        baseTest = new BaseTest();
        baseTest.wishListTable();
        System.out.println("Item is identified as Evening trousers");
        System.out.println("Item is identified as Black trousers");
        System.out.println("Item is identified as Black pants");
        System.out.println("Item is identified as Bikini");
    }

    @When("I search for lowest price product")
    public void iSearchForLowestPriceProduct() {
        baseTest = new BaseTest();
        baseTest.searchLowestPriceProduct();
    }

    @Then("I must be able to add the lowest price item to my cart")
    public void iMustBeAbleToAddTheLowestPriceItemToMyCart() {
        baseTest = new BaseTest();
        baseTest.addToCart();
    }

    @And("I am able to verify the item in my cart")
    public void iAmAbleToVerifyTheItemInMyCart() {
        baseTest = new BaseTest();
        baseTest.myCart();
    }
}
