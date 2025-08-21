package part2.com.saucedemo;

import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test
    public void isProductsHeaderDisplayed() {
        ProductsPage productsPage =  loginPage.loginToApplication( "standard_user" ,"secret_sauce");
        Assert.assertTrue(productsPage.isProductsHeaderDisplayed(), "Products header is not displayed" );
    }
}
