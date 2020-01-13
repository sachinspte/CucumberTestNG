package com.crm.qa.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ApplicationBase implements Constant
{
   public static String path;
   public static Properties prop;
   public static WebDriver driver;
   public static Logger log;

   static
   {
      path=System.getProperty("user.dir");
   }

   public ApplicationBase()
   {
       log=Logger.getLogger(this.getClass().getName());
       log.debug(this.getClass().getName());
      try {
          prop = new Properties();
          File folder=new File(path+PROP_PATH);
          String[] files=folder.list();
          for(String file : files)
          {
              prop.load(new FileInputStream(path+PROP_PATH+file));
          }
          }catch (FileNotFoundException e)
          {
            e.printStackTrace();
          }catch (Exception e)
          {
            e.printStackTrace();
          }
   }

   public ApplicationBase(WebDriver driver)
   {
       PageFactory.initElements(driver,this);
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