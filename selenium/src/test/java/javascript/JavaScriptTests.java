package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollUntilTable(){
        var page=homePage.clickLargeAnsDeepDOMPage();
        page.scrollUntilTable();
    }

    @Test
    public void testScrollToParagraph5(){

        var page=homePage.clickInfiniteScroll();
        page.scrollToParagraph(5);
    }
}
