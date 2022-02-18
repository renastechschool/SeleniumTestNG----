package renastech.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleNameLocator {
    public static void main(String[] args) {

        //TASK: Google search
        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Write “orange” in search box
        //4- Click google search button
        //5- Verify title:
        //Expected: Title should start with “orange” word
        //6-navigate back
        //7-write banana in search box
        //8-verify title contains banana.




        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://google.com
        driver.get("https://google.com");
        //3- Write “orange” in search box
        //we find this element using name locator
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("orange");

        //4- Click google search button

        driver.findElement(By.name("btnK")).click();




    }
}
