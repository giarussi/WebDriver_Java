package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDOM().scrollToTable();
        }

    @Test
    public void testInfiniteScroll(){
        homePage.clickInfiniteScroll().scrollToParagraph(10);
    }


    }

