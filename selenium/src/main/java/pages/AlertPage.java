package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

    private WebDriver driver;

    private By triggerAlertButton= By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmButton= By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptButton= By.xpath(".//button[text()='Click for JS Prompt']");
    private By result= By.id("result");


    public AlertPage(WebDriver driver) {
        this.driver=driver;
    }

    public void clickTriggerAlertButton(){
        driver.findElement(triggerAlertButton).click();
    }

    public void clickTriggerConfirmButton(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void clickTriggerPromptButton() {
        driver.findElement(triggerPromptButton).click();
    }

    /**
     * Switch to the Alert context and accept the Alert
     */
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    /**
     * Switch to the Alert context and dismisses the Alert
     */
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_inputText(String text){
        driver.switchTo().alert().sendKeys(text);
    }


    public String getResultText(){
        return driver.findElement(result).getText();
    }



}
