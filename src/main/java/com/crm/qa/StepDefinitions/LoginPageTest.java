package com.crm.qa.StepDefinitions;

import com.crm.qa.base.ApplicationBase;
import com.crm.qa.Pages.HomePage;
import com.crm.qa.Pages.LoginPage;
import com.crm.qa.Utilities.CommonFunction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPageTest extends ApplicationBase
{
    LoginPage loginPage;
    HomePage homePage;

    @Given("^User is already on login Page$")
    public void user_is_already_on_login_Page()
    {
     initialization();
     CommonFunction.sleepMethod();
    }

    @When("^User redirect to main page of CRM page$")
    public void user_redirect_to_main_page_of_CRM_page()
    {
    driver.findElement(By.xpath(prop.getProperty("redirectLoginPage"))).click();
    CommonFunction.sleepMethod();
    }

    @When("^Title of login page is Cogmento CRM$")
    public void title_of_login_page_is_Cogmento_CRM()
    {
        Assert.assertEquals(driver.getTitle(),"Cogmento CRM");
    }

    @Then("^User enters username and password$")
    public void user_enters_username_and_password()
    {
     loginPage=new LoginPage();
     loginPage.login(prop.getProperty("userName"),prop.getProperty("passWord"));
    }

    @Then("^User is on Home page$")
    public void user_is_on_Home_page()
    {
        // homePage=new HomePage();
        Assert.assertEquals(driver.getTitle(),"Cogmento CRM");
    }

    @Then("^close the brouser$")
    public void close_the_brouser()
    {
     driver.close();
    }
}