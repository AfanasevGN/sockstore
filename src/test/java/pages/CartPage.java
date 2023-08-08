package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CartPage {
  protected final Page page;
  protected final Locator basketTotal;
  protected final Locator orderTotal;

  public CartPage(Page page) {
    this.page = page;
    page.waitForLoadState();
    this.basketTotal = page.locator("th#cartTotal");
    this.orderTotal = page.locator("th#orderSubtotal");
  }

  public String basketValue() {
    return basketTotal.innerText();
  }

  public String orderValue() {
    return orderTotal.innerText();
  }

  public void getBasketTotal() {
    System.out.println(basketValue());
  }
  public void getOrderTotal() {
    System.out.println(orderValue());
  }
}

