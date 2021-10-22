package alerts;

import base.BaseTests;
import com.google.errorprone.annotations.Var;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test

    public void testAcceptAlerts(){
        var alertsPage = homePage.clickJSAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Alert is invalid!");
    }

    @Test

    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJSAlerts();
        alertsPage.triggerConfirm();
        assertEquals(alertsPage.alert_getText(), "I am a JS Confirm", "Message not valid!");
        alertsPage.alert_clickToCancel();
        assertEquals(alertsPage.getResult(), "You clicked: Cancel", "Result is invalid!");
    }

    @Test
    public void testPrompt(){
        var alertsPage = homePage.clickJSAlerts();
        alertsPage.triggerPrompt();
        alertsPage.alert_enterText("TAU Rocks!");
        alertsPage.alert_clickToAccept();
        alertsPage.getResult();
        assertEquals(alertsPage.getResult(), "You entered: TAU Rocks!", "Text Not Valid!");
    }
}
