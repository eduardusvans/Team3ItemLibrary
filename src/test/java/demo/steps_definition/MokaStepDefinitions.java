package demo.steps_definition;

import demo.pages.backoffice.LoginPage;
import demo.pages.pos.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MokaStepDefinitions {

  StartPage startPage = new StartPage();

  @Given("User is on moka start page")
  public void userIsOnMokaStartPage() {
    boolean actual = startPage.isOnPage();
    Assert.assertTrue(actual);
  }

  @When("User click sign in button on moka start page")
  public void userClickSignInButtonOnMokaStartPage() {
    startPage.clikSignInButton();
  }

  @When("User is on Home Page on moka pos")
  public void userIsOnHomePageOnMokaPos() {
    startPage.enterEmail();
    startPage.enterPassword();
    startPage.signIn();
  }

  @When("User checkout from favorites on moka pos")
  public void userCheckoutFromFavoritesOnMokaPos() {
    startPage.isOnFavorites();
  }

  @When("User click {string} on moka pos")
  public void userClickOnMokaPos(String itemName) {
    startPage.addFavorite(itemName);
  }

  @When("User click charge button on shopping cart on moka pos")
  public void userClickChargeButtonOnShoppingCartOnMokaPos() {
    startPage.saveButton();
    startPage.chargeButton();
  }

  @When("User see checkout pop up on moka pos")
  public void userSeeCheckoutPopUpOnMokaPos() {
    boolean result = startPage.checkOutPopOut();
    Assert.assertTrue(result);
  }

  @When("User choose cash suggest on moka pos")
  public void userChooseCashSuggestOnMokaPos() {
    startPage.clickCashSuggest();
  }

  @When("User click charge button on checkout pop up on moka pos")
  public void userClickChargeButtonOnCheckoutPopUpOnMokaPos() {
    startPage.chargeButton2();
  }

  @When("User click no, thank you button")
  public void userClickNoThankYouButton() {
    startPage.noThankYouButton();
  }

  @When("User redirect to Home Page")
  public void userRedirectToHomePage() {
    startPage.isOnFavorites();
  }


}
