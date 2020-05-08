package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;

public class CategoriesPage {

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/categories");
  }

  public void createCategory() {
    waitAbit(2000);
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Category')]")).click();
  }

  public void categoryName() {
    waitAbit(2000);
    String randomName = RandomUtils.generateRandomFoodName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Category Name']")).sendKeys(randomName);
  }

  public void btnSave() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary PhtzjEWwHfB2xdkEDI8ca']")).click();
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
