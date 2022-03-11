package com.StudentEnrollmentSystem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursesPage {
	WebDriver driver;
    
    //objects
    
    @FindBy(xpath="//div//div//div[4]//div[1]//div//div//button//a")
    private WebElement mean_know_more;
  //div//div[4]//button//a
    
    public CoursesPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
       
    //functions to access those objects
	
    //Click on Login Button
    public void clickKnowmore_mean(){
    	mean_know_more.click(); 
    }


}
