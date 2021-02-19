package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests  extends BaseTests {


    @Test
    public void testAcceptAlert(){
        var alertPage=homePage.clickJavaScriptAlerts();
        alertPage.clickTriggerAlertButton();
        var textFromAlert=alertPage.alert_getText();
        alertPage.alert_clickToAccept();

        assertEquals(alertPage.getResultText(),
                "You successfully clicked an alert",
                "Result text is wrong");


        assertEquals(textFromAlert,
                "I am a JS Alert",
                "Alert text is incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertPage= homePage.clickJavaScriptAlerts();
        alertPage.clickTriggerConfirmButton();
        String text= alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        assertEquals(text,
                "I am a JS Confirm",
                "Wrong text");
    }

    @Test
    public void testPromptInputText(){
        var alertPage= homePage.clickJavaScriptAlerts();
        alertPage.clickTriggerPromptButton();
        alertPage.alert_inputText("mmmm");
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResultText(),
                "You entered: "+"mmmm",
                "Wrong text" );
    }


}
