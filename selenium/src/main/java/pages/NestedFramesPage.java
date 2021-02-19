package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private By bodyFromLeftFrame=By.tagName("body");
    private By bodyFromBottomFrame=By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToOutsideFrame(){
        driver.switchTo().frame(0);
    }

    public void exitToOutsideFrame(){
        driver.switchTo().parentFrame();
    }

    public void switchToLeftFrame(){
        driver.switchTo().frame(0);
    }

    public void exitLeftFrame(){
        driver.switchTo().parentFrame();
    }

    public void switchToBottomFrame(){
        driver.switchTo().frame(1);
    }

    public void exitBottomFrame(){
        driver.switchTo().parentFrame();
    }

    public String getTextFromLeftFrame(){
        switchToOutsideFrame();
        switchToLeftFrame();
        String text = driver.findElement(bodyFromLeftFrame).getText();
        exitLeftFrame();
        exitToOutsideFrame();
        return text;
    }

    public String getTextFromBottomFrame(){
        switchToBottomFrame();
        String text =driver.findElement(bodyFromBottomFrame).getText();
        exitBottomFrame();
        return text;

    }

}
