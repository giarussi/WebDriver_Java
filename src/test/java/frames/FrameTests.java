package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test

    public void testWSYIWYG(){
        var editorPage = homePage.clickWYSIGYG();
        editorPage.clearTextArea();

        String text1 = "Hello ";
        String text2 = "World!";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndent();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), "Hello World!", "Text is not valid!");
    }
}
