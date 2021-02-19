package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {

    private WebDriver driver;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
    }

    public void goBack(){
        driver.navigate().back();
    }

    public void goForward(){
        driver.navigate().forward();
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }

    public void goTo(String url){
        driver.navigate().to(url);
    }

    /**
     * Switch to a specific tab
     */
    public void switchToTab(String tabTitle){
        //for each tab a new handler is created
        var windows=driver.getWindowHandles();

        System.out.println("Number of tabs: "+windows.size());
        windows.forEach(System.out::println);


        for (String window : windows){
            System.out.println("Switching to window: "+ window);
            driver.switchTo().window(window);

            System.out.println("Current window title: "+ driver.getTitle());


            if (tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }

    public void switchToTheOtherTab(){
        var handlers=driver.getWindowHandles();
        handlers.forEach(driver.switchTo()::window);
    }
}
