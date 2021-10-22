package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver = driver;

    }
    public LoginPage clickFormAuthentication(){

        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDown(){

        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public HoversPage clickHovers(){

        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){

        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public JavascriptAlertsPage clickJSAlerts(){

        clickLink("JavaScript Alerts");
        return new JavascriptAlertsPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public WYSIWYGPage clickWYSIGYG(){
        clickLink("WYSIWYG Editor");
        return new WYSIWYGPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public MultipleWindowPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowPage(driver);
    }

    public LargeAndDeepDOMPage clickLargeAndDeepDOM(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDOMPage(driver);
    }

    private void clickLink(String linkText){

        driver.findElement(By.linkText(linkText)).click();
    }


}
