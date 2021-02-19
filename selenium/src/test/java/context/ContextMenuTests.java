package context;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void contextClickAlertTest(){
        var contextMenu=homePage.clickContextMenu();
        contextMenu.clickHotSpot();
        String returnedText=contextMenu.alert_getExtendAccept();
        assertEquals(returnedText,
                "You selected a context menu",
                "Incorrect alert text");
        assertEquals(contextMenu.getPageTitle(),
                "Context Menu",
                "You didn't return to the Context Page");
    }
}
