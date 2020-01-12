package com.crm.qa.Pages;

import com.crm.qa.Base.ApplicationBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends ApplicationBase
{
@FindBy(name="first_name")
WebElement firstName;

@FindBy(name="last_name")
WebElement lastName;

@FindBy(name="description")
WebElement desc;

@FindBy(name="address")
WebElement addr;

public ContactPage()
{
    PageFactory.initElements(driver,this);
}

public void createContact()
{
firstName.sendKeys(prop.getProperty("firstName"));
lastName.sendKeys(prop.getProperty("lastName"));
desc.sendKeys(prop.getProperty("desc"));
addr.sendKeys(prop.getProperty("addr"));
}

}
