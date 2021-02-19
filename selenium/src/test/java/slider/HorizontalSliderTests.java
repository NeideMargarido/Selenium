package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testSlideUntilNumber4(){
        var horizontalSliderPage=homePage.clickHorizontalSlider();
        horizontalSliderPage.SetSliderValue("4");
        assertEquals(horizontalSliderPage.getRange(),
                "4",
                "Slider value is incorrect");
    }
}
