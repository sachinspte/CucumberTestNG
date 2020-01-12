package com.crm.qa.StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class tableTest
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.freecrm.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("patesachin9@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Sachin@123");
        driver.findElement(By.xpath("//div[text()='Login']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Contacts']")).click();
        Thread.sleep(3000);
        List <WebElement>col=driver.findElements(By.xpath("//table//thead//tr/th"));
        System.out.println(col.size());
        List  <WebElement>rows = driver.findElements(By.xpath("//table//tbody//tr//td[2]"));
        System.out.println(rows.size());
        for(int i=1;i<=rows.size();i++)
        {
            String text=driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[2]")).getText();
            System.out.println("Printing text::::::>>>"+text);
           if(text.equals("sachin pate"))
           {
               driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[7]//i[@class='trash icon']")).click();
               Thread.sleep(2000);
               driver.findElement(By.xpath("//button[text()='Delete']")).click();
           }
        }
    }
}