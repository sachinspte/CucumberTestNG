package com.crm.qa.Pages;

import com.crm.qa.base.ApplicationBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends ApplicationBase
{
@FindBy(name="email")
WebElement userName;

@FindBy(name="password")
WebElement passWord;

@FindBy(xpath="//div[text()='Login']")
WebElement loginButton;

public LoginPage()
{
    super(driver);
}

public HomePage login(String un,String pwd)
{
userName.sendKeys(un);
passWord.sendKeys(pwd);
loginButton.click();
return new HomePage(driver);
}
}