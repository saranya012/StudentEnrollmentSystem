package com.StudentEnrollmentSystem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentGateway {
	WebDriver driver;
    
    //objects
    
    @FindBy(xpath="//div[1]//div//div//div[3]//div/div//button[3]//div//div[1]//div[1]")
    private WebElement netbanking;
    
    @FindBy(id="bank-item-ICIC")
    private WebElement icici;
    
    @FindBy(id="footer")
    private WebElement pay;
    
    public PaymentGateway(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);        
    }
    
    //functions to access those objects
    
  //Click on netbanking Button
    public void clickNetbanking(){
    	netbanking.click(); 
    }
    
    public void clickICICI(){
    	icici.click(); 
    }

    public void clickPay(){
    	pay.click(); 
    }


}
