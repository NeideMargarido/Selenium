package upload;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class UploadFileTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.upLoadFile("/home/neide/Desktop/Depois da AC/selenium/resources/chromedriver");
        assertEquals(fileUploadPage.getFileUploadedName(),
                "chromedriver",
                "Uploaded file is incorrect");
    }
}
