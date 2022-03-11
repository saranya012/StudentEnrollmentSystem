package com.StudentEnrollmentSystem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	// All WebElements are identified by @FindBy annotation
    WebDriver driver;
    
    @FindBy(xpath="/html/body/app-root/app-header/section[2]/div/div[2]/ul[2]/li/button/a")
    private WebElement login;
    
    @FindBy(xpath = "/html/body/app-root/app-header/section[2]/div/div[2]/ul[1]/li[2]/a")
    private WebElement courses;
    
    public LandingPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
  //Click on Login Button
    public void clickLogin(){
       login.click(); 
    }
    
  //Click on course link
    public void clickCourses(){
    	courses.click(); 
    }

}
