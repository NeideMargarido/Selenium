package pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {

    private WebDriver driver;
    private By slider= By.tagName("input");
    private By rangeNumber=By.id("range");
    //or---> By.cssSelector(".sliderContainer input")


    public HorizontalSlider(WebDriver driver) {
    this.driver=driver;
    }



    /**
     * Keeps clicking until the value is equals to the @param value*/
    public void SetSliderValue(String value){
        while (!getRange().equals(value)){
            slideRight();
        }
    }


    /**
     * Only click on the right arrow
     */
    public void slideRight(){
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }

    /**
     * @return the value that appears in front of the slider
     */
    public String getRange(){
        return driver.findElement(rangeNumber).getText();
    }
}
