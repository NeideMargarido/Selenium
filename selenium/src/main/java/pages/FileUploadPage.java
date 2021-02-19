package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By input= By.id("file-upload");
    private By fileSubmitButton= By.id("file-submit");
    private By fileUploaded= By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver=driver;
    }
    public void clickUpload(){
        driver.findElement(fileSubmitButton).click();
    }

    /***
     * @param path is the complete path of the file to upload
     */
    public void upLoadFile (String path){
        driver.findElement(input).sendKeys(path);
        clickUpload();
    }

    public String getFileUploadedName(){
        return driver.findElement(fileUploaded).getText();
    }


}
