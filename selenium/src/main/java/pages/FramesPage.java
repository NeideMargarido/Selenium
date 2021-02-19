package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    WebDriver driver;
    By leftFrame= By.name("frame-left");
    By nestedFrames =By.linkText("Nested Frames");

    public FramesPage(WebDriver driver) {
        this.driver=driver;
    }

    public NestedFramesPage clickNestedFramesLink(){
        driver.findElement(nestedFrames).click();
        return new NestedFramesPage(driver);
    }
}
