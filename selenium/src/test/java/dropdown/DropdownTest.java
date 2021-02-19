package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTests {

    @Test
    public void testSelectedOption(){
       var dropdownPage= homePage.clickDropdown();
       dropdownPage.selectFromDropdown("Option 1");
       var selectedOptions=  dropdownPage.getSelectedOptions();

       assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");

       assertTrue(selectedOptions.contains("Option 1"),"Incorrect option selected");
    }


}
