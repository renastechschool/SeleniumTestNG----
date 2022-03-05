package renastech.day10_actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.BrowserUtils;
import renastech.utilities.DriverUtil;

public class c1_AllertPractice extends TestBase2 {
/*
         Go to "http://the-internet.herokuapp.com/"
         click JavaScript Alerts
         Click for Js Prompt
         Enter "hello word" text
         Click okay
         Validate your text appearing on the page
         */

    @Test
    public void AllertPractice() throws InterruptedException {
        DriverUtil.getDriver().get("http://the-internet.herokuapp.com/");
        WebElement jsAlertLink=DriverUtil.getDriver().findElement(By.xpath("//a[.='JavaScript Alerts']"));
        jsAlertLink.click();

        WebElement JSPromptLink=DriverUtil.getDriver().findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        JSPromptLink.click();

        Alert alert=DriverUtil.getDriver().switchTo().alert();
        String word="Hello World";
        alert.sendKeys(word);
        BrowserUtils.wait(5);
        alert.accept();

        WebElement actaultext= DriverUtil.getDriver().findElement(By.id("result"));
        Assert.assertTrue(actaultext.getText().contains(word));



    }
}

