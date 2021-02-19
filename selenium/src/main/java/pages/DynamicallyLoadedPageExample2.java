package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicallyLoadedPageExample2 {

    private WebDriver driver;

    private By startButtonLink= By.cssSelector("#start button");
    private By finishTextLink= By.id("finish");

    public DynamicallyLoadedPageExample2(WebDriver driver) {
        this.driver=driver;
    }

    public void clickStartButton(){
        driver.findElement(startButtonLink).click();
        WebDriverWait wait= new WebDriverWait(driver,7);
        wait.until(ExpectedConditions.presenceOfElementLocated(finishTextLink));

    }

    public boolean buttonIsDisplayed(){
        return driver.findElement(startButtonLink).isDisplayed();
    }

    public String getTextFromFinish(){
       return driver.findElement(finishTextLink).getText();
    }
}
