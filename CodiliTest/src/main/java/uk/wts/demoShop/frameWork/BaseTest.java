package uk.wts.demoShop.frameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uk.wts.demoShop.pages.DemoHomeScreen;
import uk.wts.demoShop.pages.MyWishListScreen;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;

    private DemoHomeScreen demoHomeScreen;
    private MyWishListScreen myWishListScreen;

    public void initialise() {
        System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
        driver = new ChromeDriver();

        //Implicit wait has been implemented to wait for Browser to instantiate
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://testscriptdemo.com");
        driver.manage().window().maximize();
    }

    public void demoHome(){
        demoHomeScreen = new DemoHomeScreen();
        demoHomeScreen.getShopTab().click();
    }

    public void myWishList(){
        demoHomeScreen = new DemoHomeScreen();
        demoHomeScreen.getMyWishListIcon().click();

    }

    public void wishListTable(){
        System.out.println("Wishlist table displayed");
        driver.findElement(By.xpath("//table[@class=\"shop_table cart wishlist_table wishlist_view traditional responsive   \"]"));
        //Explicit wait to identify all 4 items displayed in wishlist
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id=\"yith-wcwl-row-16\"]/td[3]/a")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id=\"yith-wcwl-row-15\"]/td[3]/a")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id=\"yith-wcwl-row-17\"]/td[3]/a")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id=\"yith-wcwl-row-22\"]/td[3]/a")));
    }

    //Verify correct value is displayed after lowest price product is searched
    public void searchLowestPriceProduct(){
        driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
        List<WebElement> rows = driver.findElements(By.xpath("//*[@class='woocommerce yith-wcwl-form wishlist-fragment']/table/tbody/tr"));
        int rowsize = rows.size();

        List<WebElement> coloumns = driver.findElements(By.xpath("//*[@class='woocommerce yith-wcwl-form wishlist-fragment']/table/tbody/tr[1]/td"));
        int coloumnsize = coloumns.size();

        String beforeXpath = "//tr[@id=\"yith-wcwl-row-22\"]/";
        String afterxPath = "td[4]/ins/span/bdi";

        for(int i=2; i<=rowsize;i++){
            for (int j=2;j<=coloumnsize;j++){
                driver.findElement(By.xpath("//*[@class='woocommerce yith-wcwl-form wishlist-fragment']/table/tbody/tr["+ i +"]/td["+ j +"]")).getText();
            }
            String actualXpath = beforeXpath+afterxPath;
            WebElement lowestPriceProduct = driver.findElement(By.xpath(actualXpath));
            if (lowestPriceProduct.getText().equals("£19.00")){
                System.out.println("\nLowest price product is:"+lowestPriceProduct.getText());
                break;
            }
        }
    }
    public void addToCart(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        myWishListScreen = new MyWishListScreen();
        myWishListScreen.getItem4AddToCart().click();
    }

    public  void myCart(){
        demoHomeScreen = new DemoHomeScreen();
        demoHomeScreen.getCartIcon().click();
        System.out.println("\nItem verified in my cart");
        driver.findElement(By.xpath("//div[@class=\"woocommerce\"]/form/table/tbody/tr[1]/td[3]")).getText();
        driver.quit();
    }
}
