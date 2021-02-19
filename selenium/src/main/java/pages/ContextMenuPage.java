package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By hotspot= By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver=driver;
    }

    /**Using Actions we can have more flexibility. We can do other things than click
     * Don't forget the trigger ".perform()"
     */
    public void clickHotSpot(){
        Actions actions= new Actions(driver);
        actions.contextClick(driver.findElement(hotspot)).perform();
    }

    public String alert_getExtendAccept(){
        String text=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return text;
    }

    public String getPageTitle(){
     return driver.findElement(By.tagName("h3")).getText();
    }
}
