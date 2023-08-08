package core;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CataloguePage;
import pages.MainPage;

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
    cartPage.getBasketTotal();
    cartPage.getOrderTotal();
    Assert.assertEquals(cartPage.basketValue(), cartPage.orderValue());
  }
}

