package com.StudentEnrollmentSystem.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    WebDriver driver;
    
    //objects
    
    @FindBy(xpath="/html/body/app-root/app-login/div/div[2]/app-studentlogin/body/div/form/div[1]/input")
    private WebElement username;
    
    @FindBy(name="password")
    private WebElement password;
    
    @FindBy(name="role")
    private WebElement role;
    
    @FindBy(name="sign-in")
    private WebElement signin;
    
    //Select category=new Select(driver.findElement(By.name("role")));
    


    public LoginPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);        
    }
    
    
    //functions to access those objects
	
  //Set user name in textbox
    public void setUserName(String strUserName){
    	username.sendKeys(strUserName);     
    }
  //Set password in password textbox
    public void setPassword(String strPassword){
       password.sendKeys(strPassword);
    }
    
  //Set category in dropdown menu
    public void setRole(String strRole){
    	role.click();
       Select category=new Select(role);
       category.selectByVisibleText(strRole);
    }
  
    /*public void clearUserName() {
    	username.clear();
    }
    
    
    public void clearPassword() {
    	password.clear();
    }*/
    
    
  //Click on Login Button
    public void clickSignin(){
       signin.click(); 
    }


}
