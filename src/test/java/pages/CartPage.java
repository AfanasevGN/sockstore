package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.testng.mustache.Value;

public class CartPage {
  protected final Page page;
  protected final Locator basketTotal;
  protected final Locator orderTotal;

  public CartPage(Page page) {
    this.page = page;
    this.basketTotal = page.locator("#cartTotal");
    this.orderTotal = page.locator("#orderSubtotal");
  }

  public String getBasketTotal(){
    return basketTotal.innerText();

  }

  public String getOrderTotal(){
    return orderTotal.innerText();
  }

}
