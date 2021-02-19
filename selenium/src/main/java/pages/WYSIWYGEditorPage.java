package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WYSIWYGEditorPage {

    private WebDriver driver;
    private String editorIFrameId="mce_0_ifr";

    //textArea it's inside the Iframe already
    private By textArea = By.id("tinymce");



    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver=driver;
    }



    /**
     * We first go inside de Iframe, then clear the area and finally we leave
     */
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }



    /**
     * Returns the last button by getting all the buttons and returning the one that we want, the last
     * */
    private WebElement lastButtonElement(){
      WebElement lastButton= driver.findElements(By.tagName("button")).get(14);
      return lastButton;
    }

    public void writeTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void clickLastButton(){
       lastButtonElement().click();
    }


    public String getTextFromEditor(){
        switchToEditArea();
        String text=driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }


    private void switchToEditArea(){
        driver.switchTo().frame(editorIFrameId);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }






}
