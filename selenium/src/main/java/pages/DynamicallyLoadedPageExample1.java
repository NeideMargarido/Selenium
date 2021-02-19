package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class DynamicallyLoadedPageExample1 {

    private WebDriver driver;
    private By buttonLink = By.cssSelector("#start button");
    private   By loadingIndicator= By.id("loading");
    private By finishLink=By.id("finish");


    public DynamicallyLoadedPageExample1(WebDriver driver) {
        this.driver=driver;
    }

    /**
     * EXPLICIT WAIT
   */
    public void clickStartButton(){
        driver.findElement(buttonLink).click();
        WebDriverWait wait= new WebDriverWait(driver, 7);
        wait.until(ExpectedConditions.
                invisibilityOf(driver.findElement(loadingIndicator)));
    }


   /*FLUENT WAIT is more flexible and gives us more options

   public void clickStartButton(){
        driver.findElement(buttonLink).click();
        FluentWait wait = new FluentWait(driver).
                withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

    }*/



    public String getTextFromFinish(){
        return driver.findElement(finishLink).getText();
    }
}
