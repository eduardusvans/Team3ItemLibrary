package demo.pages.pos;

import static demo.webdriver.AndroidDriverInstance.androidDriver;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartPage {

  public boolean isOnPage() {
    WebDriverWait wait = new WebDriverWait(androidDriver, 30);
    WebElement signInLabel = wait
            .until(ExpectedConditions.presenceOfElementLocated(By.id("alreadySignInTextView")));
    return signInLabel.isDisplayed();
  }

  public void clikSignInButton() {
    Point coord = androidDriver.findElement(By.id("alreadySignInTextView"))
            .getCenter();
    TouchAction touchAction = new TouchAction(androidDriver);
    touchAction.tap(PointOption.point(coord.getX() + 200, coord.getY())).perform();
  }

  public void enterEmail() {
    String email = "zodiacfleut@gmail.com";
    AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver.findElement(MobileBy.id("emailOrPhoneEditText"));
    buttonSubmit.sendKeys(email);
  }

  public void enterPassword() {
    String pw = "vans123";
    AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("passwordEditText"));
    buttonSubmit.sendKeys(pw);
  }

  public void signIn() {
    AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("signInButton"));
    buttonSubmit.click();
  }

  public void addFavorite(String itemName) {
    String xpath = "//android.widget.TextView[contains(@resource-id, 'grid_favourite_name') and @text = 'Green Tea Latte']";
    AndroidDriverInstance.androidDriver.findElement(By.xpath(String.format(xpath, itemName))).click();
  }

  public void isOnFavorites() {
    AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("toolbar_bar_favourite"));
    buttonSubmit.click();
  }

  public void chargeButton() {
    AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("checkoutButton"));
    buttonSubmit.click();
  }

  public void saveButton() {
    AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("btnPositive"));
    buttonSubmit.click();
  }

  public boolean checkOutPopOut() {
    WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
    return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tablet_title")))
            .isDisplayed();
  }

  public void clickCashSuggest() {
    AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("cash_suggest_lowest"));
    buttonSubmit.click();
  }

  public void chargeButton2() {
    AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("tablet_ok_button"));
    buttonSubmit.click();
  }

  public void noThankYouButton() {
    AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
            .findElement(MobileBy.id("no_send_button"));
    buttonSubmit.click();
  }
}
