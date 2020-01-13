package com.crm.qa.base;

import com.crm.qa.Utilities.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ApplicationBase
{
   public static String path;
   public static Properties prop;
   public static WebDriver driver;

   static
   {
      path=System.getProperty("user.dir");
   }

   public ApplicationBase()
   {
      try {
         prop = new Properties();
         prop.load(new FileInputStream(path+ Constant.PROP_PATH));
         prop.load(new FileInputStream(path+Constant.APPLICATIONLOCATORS_PROP_PATH));
      }catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }catch (Exception e)
      {
         e.printStackTrace();
      }
   }

   public static void initialization()
   {
     String brouserName=prop.getProperty("brouserName");
     if(brouserName.equalsIgnoreCase("chrome"))
      {
       System.setProperty("webdriver.chrome.driver",path+Constant.CHROME_DRIVER_PATH);
       driver=new ChromeDriver();
      }
     else if(brouserName.equalsIgnoreCase("brouserName"))
     {
        System.setProperty("webdriver.gecko.driver",path+Constant.FIREFOX_DRIVER_PATH);
        driver=new FirefoxDriver();
     }
       driver.manage().timeouts().implicitlyWait(Constant.Implicit_Wait, TimeUnit.SECONDS);
       driver.get(prop.getProperty("url"));
       driver.manage().window().maximize();

   }

}