package com.crm.qa.StepDefinitions;
import com.crm.qa.base.ApplicationBase;
import com.crm.qa.Pages.ContactPage;
import com.crm.qa.Pages.LoginPage;
import com.crm.qa.Utilities.CommonFunction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class ContactPageTest extends ApplicationBase
{
    LoginPage loginPage;
    ContactPage contactPage;

    @Given("^user is on home page$")
    public void user_is_on_home_page()
    {
      initialization();
      driver.findElement(By.xpath(prop.getProperty("redirectLoginPage"))).click();
      loginPage=new LoginPage();
      loginPage.login(prop.getProperty("userName"),prop.getProperty("passWord"));
      CommonFunction.sleepMethod();
    }

    @When("^user click on conact page$")
    public void user_click_on_conact_page()
    {
     driver.findElement(By.xpath(prop.getProperty("contactLink"))).click();
     CommonFunction.sleepMethod();
    }

    @Then("^user click on New button and enters users details$")
    public void user_click_on_New_button_and_enters_users_details()
    {
    driver.findElement(By.xpath(prop.getProperty("newButton"))).click();
    contactPage=new ContactPage();
    contactPage.createContact();
    CommonFunction.sleepMethod();
    }

    @Then("^user click on save button$")
    public void user_click_on_save_button()
    {
    driver.findElement(By.xpath(prop.getProperty("saveButton"))).click();
    }

    @Then("^verify Success message$")
    public void verify_Success_message()
    {
     String test111=driver.findElement(By.xpath("//div[@class='ui header item mb5 light-black']")).getText();
     System.out.println("test111111::::::::::::::::::::::::::"+test111);
    }


}
