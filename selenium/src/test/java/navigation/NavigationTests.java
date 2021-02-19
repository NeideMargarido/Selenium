package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExampleLink1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }


    @Test
    public void testSwitchToNewTabWithCtrlAndClick(){
        var page2=homePage.clickDynamicLoading().clickCtrlExample2();
        getWindowManager().switchToTheOtherTab();
        assertTrue(page2.buttonIsDisplayed(),
                "The start Button is not displayed");
    }
}
