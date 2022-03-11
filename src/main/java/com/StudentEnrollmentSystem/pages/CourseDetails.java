package com.StudentEnrollmentSystem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseDetails {
	
    WebDriver driver;
    
    //objects
    
    @FindBy(xpath="//div[2]//div//button//a")
    private WebElement enroll_now;
    
        public CourseDetails(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this); 
        
    }
    
    public void clickEnroll(){
        enroll_now.click(); 
     }

	

}
