package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigation(){
    homePage.clickDynamicLoading();
    getWindowManager().goBack();
    getWindowManager().refresh();
    getWindowManager().goTo("https://google.com");

    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

}
