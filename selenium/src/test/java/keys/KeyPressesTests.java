package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class KeyPressesTests extends BaseTests {

    @Test
    public void testBackSpace(){
      var keyPage=  homePage.clickKeyPresses();
      keyPage.enterText("A"+ Keys.BACK_SPACE);
      assertEquals(keyPage.getKeyPressed(),
              "You entered: BACK_SPACE",
              "You entered the wrong key");
    }

    @Test
    public void testPi(){
        var keyPage= homePage.clickKeyPresses();
        keyPage.enterPi();
        assertEquals(keyPage.getKeyPressed(),
                "You entered: 4",
                "Wrong character pressed");

    }
}
