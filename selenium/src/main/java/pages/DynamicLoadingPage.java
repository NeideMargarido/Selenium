package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By example1Link= By.linkText("Example 1: Element on page that is hidden");
    private By example2Link=By.linkText("Example 2: Element rendered after the fact");
    public DynamicLoadingPage(WebDriver driver) {
        this.driver=driver;
    }

    public DynamicallyLoadedPageExample1 clickExampleLink1(){
       driver.findElement(example1Link).click();
       return new DynamicallyLoadedPageExample1(driver);
    }

    public DynamicallyLoadedPageExample2 clickExampleLink2(){
        driver.findElement(example2Link).click();
    return new DynamicallyLoadedPageExample2(driver);
    }

    public DynamicallyLoadedPageExample2  clickCtrlExample2(){
       WebElement example2LinkElement = driver.findElement(example2Link);
        Actions actions= new Actions(driver);

        actions.keyDown(Keys.CONTROL).click(example2LinkElement).perform();
        return new DynamicallyLoadedPageExample2(driver);
    }
}
