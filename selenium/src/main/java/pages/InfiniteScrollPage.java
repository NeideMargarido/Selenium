package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private WebDriver driver;
    private By textBlockLink= By.className("jscroll-added");


    public InfiniteScrollPage(WebDriver driver) {
    this.driver=driver;
    }

    /**
     * Scroll until paragraph with index specified is in view
     * @param index 1-based
     */
    public void scrollToParagraph(int index){
        // scrollTo first argument is coordinate X, second is Y
        String script="window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutorDriver= ((JavascriptExecutor)driver);

        while (getNumberOfParagraphsPresent() < index){
           // System.out.println(getNumberOfParagraphsPresent());
            jsExecutorDriver.executeScript(script);
        }
    }

    private int getNumberOfParagraphsPresent(){
        return driver.findElements(textBlockLink).size();
    }
}
