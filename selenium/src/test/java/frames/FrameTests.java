package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWYISIWYG(){
        String text1="Hello ";
        String text2="world!";
        var editorWysiwyg=homePage.clickWYSIWYGeditor();
        editorWysiwyg.clearTextArea();
        editorWysiwyg.writeTextArea(text1);
        editorWysiwyg.clickLastButton();
        editorWysiwyg.writeTextArea(text2);
        assertEquals(editorWysiwyg.getTextFromEditor(),
                text1+text2,
                "Incorrect text on the editor");
    }

    @Test
    public void testNestedFrames(){
      var nestedFrame=  homePage.clickFrames().clickNestedFramesLink();
      String textFromLeft=nestedFrame.getTextFromLeftFrame();
      String textFromBottom= nestedFrame.getTextFromBottomFrame();
      assertEquals(textFromLeft,
              "LEFT",
              "incorrect text Frame on left");
      assertEquals(textFromBottom,
              "BOTTOM",
              "incorrect text from the bottom frame");
    }
}
