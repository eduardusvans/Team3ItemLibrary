package demo.steps_definition;

import demo.pages.backoffice.CategoriesPage;
import demo.pages.backoffice.DashboardPage;
import demo.pages.backoffice.ItemLibraryPage;
import demo.pages.backoffice.LoginPage;
import demo.pages.backoffice.ModifiersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BackOfficeStepDefinitions {

  LoginPage loginPage = new LoginPage();
  DashboardPage dashboardPage = new DashboardPage();
  CategoriesPage categoriesPage = new CategoriesPage();
  ItemLibraryPage itemLibraryPage = new ItemLibraryPage();
  ModifiersPage modifiersPage = new ModifiersPage();

  @Given("User open moka backoffice login page")
  public void userOpenMokaBackofficeLoginPage() {
    loginPage.openPage();
  }

  @When("User input email/phone {string} on backoffice login page")
  public void userInputEmailOnBackofficeLoginPage(String emailOrPhone) {
    emailOrPhone = "zodiacfleut@gmail.com";
    loginPage.inputEmailorPhone(emailOrPhone);
  }

  @When("User input password {string} on backoffice login page")
  public void userInputPasswordOnBackofficeLoginPage(String password) {
    password = "vans123";
    loginPage.inputPassword(password);
  }

  @When("User click Sign in on backoffice login page")
  public void userClickSignInOnBackofficeLoginPage() {
    loginPage.clickSignIn();
  }


  @Then("User successfully login on backoffice")
  public void userSuccessfullyLoginOnBackoffice() {
    Assert.assertTrue(dashboardPage.isOnPage());
  }

  @When("User go to menu categories on backoffice")
  public void userGoToMenuCategoriesOnBackoffice() {
    categoriesPage.openPage();
  }


  @When("User go to menu item library on backoffice")
  public void userGoToMenuItemLibraryOnBackoffice() {
    itemLibraryPage.openPage();
  }

  @When("User go to menu modifiers on backoffice")
  public void userGoToMenuModifiersOnBackoffice() {
    modifiersPage.openPage();
  }

  @When("User click create item button on backoffice item library")
  public void userClickCreateItemButtonOnBackofficeItemLibrary() {
    itemLibraryPage.createItem();
  }

  @When("User input random item name on backoffice item library")
  public void userInputRandomItemNameOnBackofficeItemLibrary() {
    itemLibraryPage.inputName();
  }

  @When("User input random item price on backoffice item library")
  public void userInputRandomItemPriceOnBackofficeItemLibrary() {
    itemLibraryPage.inputPrice();
  }

  @When("User choose random item sku on backoffice item library")
  public void userChooseRandomItemSkuOnBackofficeItemLibrary() {
    itemLibraryPage.inputSku();
  }

  @When("User choose modifier oreo on backoffice item library")
  public void userChooseModifierOreoOnBackofficeItemLibrary() {
    itemLibraryPage.inputOreo();
  }

  @When("User input item description on backoffice item library")
  public void userInputItemDescriptionOnBackofficeItemLibrary() {
    itemLibraryPage.description();
  }

  @When("User click save button on backoffice item library")
  public void userClickSaveButtonOnBackofficeItemLibrary() {
    itemLibraryPage.btnSave();
  }

  @When("User click create modifier button on backoffice modifier")
  public void userClickCreateModifierButtonOnBackofficeModifier() {
    modifiersPage.btnCreateModifier();
  }

  @When("User input random modifier name on backoffice modifier")
  public void userInputRandomModifierNameOnBackofficeModifier() {
    modifiersPage.inputName();
    modifiersPage.variant();
    modifiersPage.variantDetail();
    modifiersPage.variantDetail2();
    modifiersPage.btnSave2();
  }

  @When("User click save button on backoffice modifier")
  public void userClickSaveButtonOnBackofficeModifier() {
    modifiersPage.btnSave();
  }

  @When("User click create category button on backoffice category")
  public void userClickCreateCategoryButtonOnBackofficeCategory() {
    categoriesPage.createCategory();
  }

  @When("User input name on backoffice category")
  public void userInputNameOnBackofficeCategory() {
    categoriesPage.categoryName();
  }

  @When("User click save btn on backoffice category")
  public void userClickSaveBtnOnBackofficeCategory() {
    categoriesPage.btnSave();
  }
}
