package com.thetestingacademy.task_23120224;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

//1. https://awesomeqa.com/practice.html

public class Task02 {
    @Test
    public void testMethod01() throws Exception{

        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver= new EdgeDriver(edgeOptions);

        driver.get("https://awesomeqa.com/practice.html");
        Assert.assertEquals(driver.getCurrentUrl(), "https://awesomeqa.com/practice.html");

        //Step 1: Verify the First name field
        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Anil");

        //Step 2: Verify the Last name field
        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Dixit");

        //Step 3: Verify the Gender
        //<input id="sex-0"
        // name="sex"
        // style="font-size: 14px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding: 0px; vertical-align: baseline;"
        // type="radio"
        // value="Male">

        WebElement gender = driver.findElement(By.id("sex-0"));
        gender.click();


        //Step 4: Verify the Years of the Experience

        WebElement experience = driver.findElement(By.id("exp-6"));
        experience.click();

        //Step 5: Verify the Date
        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("28122024");

        //Step 6: Verify the Profession
        WebElement profession = driver.findElement(By.id("profession-1"));
        profession.click();


        //Step 7: Verify the AutomationTools
        WebElement autoTool = driver.findElement(By.id("tool-2"));
        autoTool.click();



        Thread.sleep(3000);
        driver.quit();

    }

}
