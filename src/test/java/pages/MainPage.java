package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class MainPage {
  protected final Page page;
  public final Locator login;
  public final Locator loginInput;
  public final Locator passwordInput;
  public final Locator loginButton;
  public final Locator catalogue;

  public MainPage(Page page) {
    this.page = page;
    this.login = page.locator("#login");
    this.loginInput = page.locator("#username-modal");
    this.passwordInput = page.locator("#password-modal");
    this.loginButton = page.getByText("Log in");
    this.catalogue = page.locator("#tabCatalogue").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Catalogue"));
  }

  public void navigate() {
    page.navigate("http://localhost/");
  }

  public void loginShop(){
    login.click();
    page.waitForLoadState();
    loginInput.fill("afnsw");
    passwordInput.fill("xplosion-x");
    loginButton.click();
    page.waitForLoadState();
    catalogue.click();
    page.waitForLoadState();
  }
}
