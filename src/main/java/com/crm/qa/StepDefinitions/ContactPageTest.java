package com.crm.qa.StepDefinitions;
import com.crm.qa.base.ApplicationBase;
import com.crm.qa.Pages.ContactPage;
import com.crm.qa.Pages.LoginPage;
import com.crm.qa.Utilities.CommonFunction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ContactPageTest extends ApplicationBase
{
    LoginPage loginPage;
    ContactPage contactPage;

    @Given("^user is on home page$")
    public void user_is_on_home_page()
    {
      log.info("Start user_is_on_home_page()");
      log.info("Before initialization");
      initialization();
      log.info("Initilization done");
      driver.findElement(By.xpath(prop.getProperty("redirectLoginPage"))).click();
      loginPage=new LoginPage(driver);
      loginPage.login(prop.getProperty("userName"),prop.getProperty("passWord"));
      CommonFunction.sleepMethod();
      log.info("End user_is_on_home_page()");
    }

    @When("^user click on conact page$")
    public void user_click_on_conact_page()
    {
     log.info("Start user_click_on_conact_page()");
     driver.findElement(By.xpath(prop.getProperty("contactLink"))).click();
     CommonFunction.sleepMethod();
     log.info("Start user_click_on_conact_page()");
    }

    @Then("^user click on New button and enters users details$")
    public void user_click_on_New_button_and_enters_users_details()
    {
    log.info("Start of user_click_on_New_button_and_enters_users_details()");
    driver.findElement(By.xpath(prop.getProperty("newButton"))).click();
    contactPage=new ContactPage(driver);
    contactPage.createContact();
    CommonFunction.sleepMethod();
    log.info("End of user_click_on_New_button_and_enters_users_details()");
    }

    @Then("^user click on save button$")
    public void user_click_on_save_button()
    {
    log.info("Start user_click_on_save_button()");
    driver.findElement(By.xpath(prop.getProperty("saveButton"))).click();
    CommonFunction.sleepMethod();
    log.info("Start user_click_on_save_button()");
    }

    @Then("^verify Success message$")
    public void verify_Success_message()
    {
     log.info("Start verify_Success_message()");
    driver.findElement(By.xpath(prop.getProperty("contactLink"))).click();
    CommonFunction.sleepMethod();
    List<WebElement> rows=driver.findElements(By.xpath(prop.getProperty("rowXpath")));
    log.info("Row size:"+rows.size());
    for(int i=1;i<=rows.size();i++)
    {
        String text=driver.findElement(By.xpath(prop.getProperty("getTextOfRow"))).getText();
        if(text.equals(prop.getProperty("firstName")+" "+prop.getProperty("lastName")))
        {
            Assert.assertEquals(text,prop.getProperty("firstName")+" "+prop.getProperty("lastName"));
            break;
        }
        else if(text!=(prop.getProperty("firstName")+" "+prop.getProperty("lastName")))
        {
           if(i==rows.size())
           {
               Assert.assertEquals(text,prop.getProperty("firstName")+" "+prop.getProperty("lastName"));
           }
        }
    }
        log.info("End verify_Success_message()");
    }

    @Then("^close the brouser$")
    public void close_the_brouser()
    {
        driver.close();
        log.info("closed_the_brouser");
    }


    @When("^Select the user that is to be deleted$")
    public String select_the_user_that_is_to_be_deleted() throws Throwable
    {
      String user=prop.getProperty("firstName")+" "+prop.getProperty("lastName");
      return user;
    }

    @Then("^Click on Delete Item$")
    public void click_on_Delete_Item() throws Throwable
    {
        log.info("Start click_on_Delete_Item()");
        List<WebElement> rows=driver.findElements(By.xpath(prop.getProperty("rowXpath")));
        log.info("Row size:"+rows.size());
        for(int i=1;i<=rows.size();i++)
        {
            String text=driver.findElement(By.xpath(prop.getProperty("getTextOfRow"))).getText();
            String user=select_the_user_that_is_to_be_deleted();
            if(text.equals(user))
            {
                driver.findElement(By.xpath(prop.getProperty("clickOnDelete"))).click();
                CommonFunction.sleepMethod();
               driver.findElement(By.xpath(prop.getProperty("clickOnConfirmDelete"))).click();
            }
            else if(text!=(prop.getProperty("firstName")+" "+prop.getProperty("lastName")))
            {
                if(i==rows.size())
                {
                    Assert.assertEquals(text,prop.getProperty("firstName")+" "+prop.getProperty("lastName"));
                }
            }
        }
        log.info("End of click_on_Delete_Item");
    }

    @Then("^Validate the delete message and contact page$")
    public void validate_the_delete_message_and_contact_page() throws Throwable
    {
        log.info("Start of validate_the_delete_message_and_contact_page()");
        List<WebElement> rows=driver.findElements(By.xpath(prop.getProperty("rowXpath")));
        log.info("Row size:"+rows.size());
        for(int i=1;i<=rows.size();i++)
        {
            String text=driver.findElement(By.xpath(prop.getProperty("getTextOfRow"))).getText();
            if(text.equals(prop.getProperty("firstName")+" "+prop.getProperty("lastName")))
            {
                Assert.assertEquals(true,false);
                break;
            }
            else if(text!=(prop.getProperty("firstName")+" "+prop.getProperty("lastName")))
            {
                if(i==rows.size())
                {
                    Assert.assertEquals(true,true);
                }
            }
        }
        log.info("End of validate_the_delete_message_and_contact_page()");
    }

}