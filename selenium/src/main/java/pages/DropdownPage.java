package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {

    private WebDriver driver;


    private By dropdownMenu = By.id("dropdown");



    public DropdownPage(WebDriver driver){
        this.driver=driver;

    }


    /**
     * Allow us to select one of the option of the dropdownMenu
     */
    public void selectFromDropdown (String option){
        Select dropdownElement = findDropdownElement();
        dropdownElement.selectByVisibleText(option);
    }

    /**
     * Creates a List of Strings of all the selected option on teh dropdownMenu
     */
    public List<String> getSelectedOptions(){
       List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
            return selectedElements.stream()
                    .map(e->e.getText()).collect(Collectors.toList());
    }

    /**
     * Auxiliary method to find the dropdownMenu Element using Select
     */
    private Select findDropdownElement(){
        return new Select(driver.findElement(dropdownMenu));
    }
}
