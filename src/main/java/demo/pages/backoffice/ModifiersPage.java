package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;

public class ModifiersPage {

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/modifier");
  }

  public void btnCreateModifier() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Modifier')]")).click();
  }

  public void inputName() {
    waitAbit(2000);
    String randomName = RandomUtils.generateRandomFoodName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(randomName);
  }

  public void btnSave() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
    waitAbit(2000);
  }

  public void waitAbit(int milis) {
    try {
      Thread.sleep(milis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void variant() {
    waitAbit(2000);
    WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
  }

  public void variantDetail() {
    waitAbit(2000);
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Add Options')]")).click();
  }

  public void variantDetail2() {
    waitAbit(2000);
    String randomName = RandomUtils.generateRandomFoodName();
    WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='form-group col-sm-6']//input[@placeholder='Name']")).sendKeys(randomName);
  }

  public void btnSave2() {
    waitAbit(2000);
    WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='modal-footer']//button[@class='btn btn-primary'][contains(text(),'Save')]")).click();
  }
}
