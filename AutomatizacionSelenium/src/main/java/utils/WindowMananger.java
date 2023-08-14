package utils;

import org.openqa.selenium.WebDriver;

public class WindowMananger {
    private WebDriver driver;
    private WebDriver.Navigation navegate;

    public WindowMananger(WebDriver driver){
        this.driver = driver;
        navegate = driver.navigate();
    }
    public void goBack(){
        navegate.back();
    }
    public void goFoward(){
        navegate.forward();
    }
    public void refreshPage(){
        navegate.refresh();
    }
    public void goTo(String url){
        navegate.to(url);
    }

    public void swithToTab(String tabTitle){
        var windows = driver.getWindowHandles();
        System.out.println("number of windows: "+ windows.size());
        windows.forEach(System.out::println);

        for (String window : windows){
            System.out.println("Switching to window: "+ window);
            driver.switchTo().window(window);

            System.out.println("current window title: "+ driver.getTitle());
            if (tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }


}
