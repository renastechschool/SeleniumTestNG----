package renastech.day10_actions;

import org.testng.annotations.Test;
import renastech.Pages.SmartBearLoginPage;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;

public class c5_smartBearPomExample extends TestBase2 {


    SmartBearLoginPage smartBearLoginPage;

    @Test
    public void TC1_smartBearPositiveVerification(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));

        smartBearLoginPage=new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_username"),
                PropertiesReadingUtil.getProperties("SmartBear_password"));




    }
}
