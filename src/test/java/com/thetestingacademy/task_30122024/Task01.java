package com.thetestingacademy.task_30122024;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

// task
// 1.Open the https://www.idrive360.com/enterprise/login
// 2. Enter the credentials
//     1.email - augtest_040823@idrive.com
//     2. password - 123456
// 3.Verify that the free trial message is visible.

public class Task01 {
    @Test
    public void testMethod() throws InterruptedException {
       // WebDriver driver = new ChromeDriver();

        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver= new EdgeDriver(edgeOptions);


        driver.get("https://www.idrive360.com/enterprise/login");
        Thread.sleep(3000);
        WebElement emailID = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

        emailID.sendKeys("augtest_040823@idrive.com");
        password.sendKeys("123456");

        WebElement signInButton = driver.findElement(By.xpath("//button[@class='id-btn id-info-btn-frm']"));
        signInButton.click();

        Thread.sleep(20000);

        WebElement freeTrialMessage = driver.findElement(By.xpath("//h5[@class='id-card-title']"));
        System.out.println("Free Trial Message = "+freeTrialMessage.getText());
        Assert.assertEquals(freeTrialMessage.getText(), "Your free trial has expired");

        driver.quit();
    }
}
