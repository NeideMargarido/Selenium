package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var dynamicPage=homePage.clickDynamicLoading();
        var dynamicLoadings=dynamicPage.clickExampleLink1();
        dynamicLoadings.clickStartButton();
        assertEquals(dynamicLoadings.getTextFromFinish(),
                "Hello World!",
                "Incorrect text");
    }


    @Test
    public void testWaitUntilRenderAfterSomething(){
        var optionPage=homePage.clickDynamicLoading();
        var example2page= optionPage.clickExampleLink2();
        example2page.clickStartButton();
        assertEquals(example2page.getTextFromFinish(),
                "Hello World!",
                "Incorrect text");
    }
}
