package hover;

import base.BaseTests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
    var hoversPage= homePage.clickHovers();
    var caption= hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "caption is not displayed");
        assertEquals(caption.getTitle(),"name: user1",
                "wrong userText");
        assertEquals(caption.getLink(), "https://the-internet.herokuapp.com/users/1",
                "wrong link");
        assertEquals(caption.getLinkText(), "View profile",
                "wrong link text");
        /*
        assertTrue(caption.getLink().endsWith("/users/1"), "link is incorrect");*/
    }
}
