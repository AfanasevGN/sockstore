package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class CataloguePage {
  protected final Page page;
  public final Locator addToCartButtons;
  public final Locator goToCart;

  public CataloguePage(Page page) {
    this.page = page;
    this.addToCartButtons = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add to cart"));
    this.goToCart = page.locator("xpath=//span[@id='numItemsInCart']");


  }

  public void addToCart(int index) {
    addToCartButtons.nth(index).click();
  }

  public void addToCart(String positionName) {
    page.locator("//a[text()='" + positionName + "']/ancestor::div[@class='product']/descendant::a[text()='Add to cart']").click();
  }





  //нужен метод, который добавит любой товар по индексу или имени
}
