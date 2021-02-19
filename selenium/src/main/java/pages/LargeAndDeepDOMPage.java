package pages;

import org.openqa.selenium.*;

public class LargeAndDeepDOMPage {

    private WebDriver driver;
    private By tableLink= By.id("large-table");


    public LargeAndDeepDOMPage(WebDriver driver) {
        this.driver=driver;
    }

    /**
     * We can use JS for a function that is not defined in Java, in these case teh Scroll
     */
    public void scrollUntilTable(){
       WebElement tableElement= driver.findElement(tableLink);
       String script= "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, tableElement);
    }

}
