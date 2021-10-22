package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGPage {

    private WebDriver driver;
    private String editorFrameID = "mce_0_ifr";
    private By editorArea = By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("#mceu_12 button");


    public WYSIWYGPage(WebDriver driver){
        this.driver = driver;
    }

    private void switchToEdit(){
        driver.switchTo().frame(editorFrameID);
    }

    public void clearTextArea(){
       switchToEdit();
       driver.findElement(editorArea).clear();
       switchToMainArea();
    }

    public void setTextArea(String text){
        switchToEdit();
        driver.findElement(editorArea).sendKeys(text);
        switchToMainArea();
    }

    public void decreaseIndent(){
        driver.findElement(decreaseIndentButton).click();
    }

    public String getTextFromEditor(){
        switchToEdit();
        String text = driver.findElement(editorArea).getText();
        switchToMainArea();
        return text;
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
