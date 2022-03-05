package renastech.day10_actions;

import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;

public class c5_smartBearPomExample extends TestBase2 {



    @Test
    public void TC1_smartBearPositiveVerification(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
    }
}
