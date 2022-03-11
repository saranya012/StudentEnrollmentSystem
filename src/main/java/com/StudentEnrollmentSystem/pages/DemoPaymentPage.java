package com.StudentEnrollmentSystem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPaymentPage {
	
WebDriver driver;
    
    //objects
    
    @FindBy(xpath="/html/body/form/button[1]")
    private WebElement success;
    
    @FindBy(xpath="/html/body/form/button[2]")
    private WebElement failure;
    
    public DemoPaymentPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);        
    }
    
    public void clickSuccess(){
    	success.click(); 
     }
    
    public void clickFailure(){
    	failure.click(); 
     }
    
    

}
