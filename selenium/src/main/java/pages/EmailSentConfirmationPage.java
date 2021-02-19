package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentConfirmationPage {

    private WebDriver driver;
    private By confirmationAlertText= By.id("content");

    public EmailSentConfirmationPage(WebDriver driver) {
        this.driver=driver;
    }

    public String getConfirmationText(){
        return driver.findElement(confirmationAlertText).getText();
    }
}
