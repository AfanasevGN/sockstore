package core;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CataloguePage;
import pages.MainPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SockTest extends BaseTest {

  @Test
  public void checkSumTest(){
    MainPage mainpage = new MainPage(page);
      mainpage.navigate();
      mainpage.loginShop();
    CataloguePage cataloguePage = new CataloguePage(page);
      cataloguePage.addToCart("Holy");
      cataloguePage.addToCart("Colourful");
      cataloguePage.goToCart.click();
    CartPage cartPage = new CartPage(page);
    page.waitForLoadState();
    Assert.assertEquals(cartPage.getBasketTotal(), cartPage.getOrderTotal());

  }

}
