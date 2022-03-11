package com.StudentEnrollmentSystem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentProfileHomePage {
	
WebDriver driver;
    
    //objects
    
    @FindBy(xpath="//*[contains(text(),'WELCOME')]")
    private WebElement welcomeStudentName;
    
    @FindBy(xpath="//*[@id=\"home\"]/div/div/div/div/div/div/a")
    		//+ "/html/body/app-root/app-home/section/div/div/div/div/div/div/a")
    private WebElement viewProfile;
    
    @FindBy(xpath="/html/body/app-root/app-header/section[2]/div/div[2]/ul[1]/li[7]/a")
    private WebElement logout;
    
    @FindBy(xpath="/html/body/app-root/app-header/section[2]/div/div[2]/ul[1]/li[1]/a")
    private WebElement home;
    
    @FindBy(xpath="/html/body/app-root/app-header/section[2]/div/div[2]/ul[1]/li[2]/a")
    private WebElement courses;
    

    public StudentProfileHomePage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);        
    }
    
    
    //functions to access those objects
	
    public void clickViewProfile(){
        viewProfile.click(); 
     }
	
	//Click on Login Button
    public void clickLogout(){
       logout.click(); 
    }
    
    public void clickHome(){
        home.click(); 
     }
    
    public void clickCourses(){
        courses.click(); 
     }


	public String getDisplayText() {
		// TODO Auto-generated method stub
		String displayText=welcomeStudentName.getText();
		return displayText;
	}
		
		



}
