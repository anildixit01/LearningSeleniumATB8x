package com.thetestingacademy.task_23120224;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

// Task01
//1.open the https://katalon-demo-cura.herokuapp.com/
//2.Click on the make appointment button
//3.Find username,password - enter them  , John Doe, ThisIsNotAPassword
//4.Click on the submit button
//5. Verify the driver. currentUrl == https://katalon-demo-cura.herokuapp.com/#appointment
//6. Push the code to github.com

public class Task01 {
    @Test
    public void testMethod01() throws Exception{

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver= new EdgeDriver(edgeOptions);

        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement makeAptBtn= driver.findElement(By.id("btn-make-appointment"));
        makeAptBtn.click();

        Thread.sleep(3000);

        WebElement user= driver.findElement(By.name("username"));
        user.sendKeys("John Doe");

        WebElement pswd= driver.findElement(By.id("txt-password"));
        pswd.sendKeys("ThisIsNotAPassword");

        WebElement loginBtn = driver.findElement(By.id("btn-login"));
        loginBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");
        Thread.sleep(3000);
        driver.quit();

    }

}
