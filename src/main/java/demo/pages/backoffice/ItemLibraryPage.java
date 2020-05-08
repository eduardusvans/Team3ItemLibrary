package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;

import java.util.Random;

public class ItemLibraryPage {

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/list");
  }

  public void createItem() {
    waitAbit(2000);
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Item')]")).click();
  }

  public void inputName() {
    waitAbit(2000);
    String randomName = RandomUtils.generateRandomFoodName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Item Name']")).sendKeys(randomName);
  }

  public void inputPrice() {
    waitAbit(2000);
    String price = RandomUtils.generateRandomNumber();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Price']"))
            .sendKeys(price);
  }

  public void inputSku() {
    waitAbit(2000);
    String sku = RandomUtils.generateRandomSKU();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='SKU']"))
            .sendKeys(sku);
  }

  public void inputOreo() {
    waitAbit(2000);
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@id='modifier-123038']")).click();
  }

  public void description() {
    waitAbit(2000);
    String randomName = RandomUtils.generateRandomFoodName();
    WebDriverInstance.webDriver.findElement(By.xpath("//textarea[@placeholder='Item Description']")).sendKeys(randomName);
  }

  public void btnSave() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary no-outline']")).click();
    waitAbit(2000);
  }

  public void waitAbit(int milis) {
    try {
      Thread.sleep(milis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
