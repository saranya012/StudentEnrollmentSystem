package com.StudentEnrollmentSystem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StudentRegistrationPage {
    WebDriver driver;
    
    //objects
    
    @FindBy(name="name")
    private WebElement name;
    
    @FindBy(name="email")
    private WebElement email;
    
    @FindBy(name="password")
    private WebElement password;
    
    @FindBy(name="phone")
    private WebElement phone;
    
    @FindBy(name="address")
    private WebElement address;
    
    @FindBy(name="district")
    private WebElement district;
    
    @FindBy(name="state")
    private WebElement state;
    
    @FindBy(name="qualification")
    private WebElement qualification;
    
    @FindBy(name="passout")
    private WebElement passout;
    
    @FindBy(name="skills")
    private WebElement skills;
    
    @FindBy(name="employmentStatus")
    private WebElement employmentStatus;
    
    @FindBy(name="techtraining")
    private WebElement techtraining;
    
    @FindBy(name="course")
    private WebElement course;
    
    @FindBy(name="coursefee")
    private WebElement coursefee;
    
    @FindBy(name="image")
    private WebElement image;
    
    @FindBy(xpath="//div//form//div//div[19]//button")
    private WebElement register;
    
    
    public StudentRegistrationPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);        
    }
    
    //functions to access those objects

    
  //Set name in textbox
    public void setName(String strName){
    	name.sendKeys(strName);     
    }    
	
  //Set email in textbox
    public void setEmail(String strEmail){
       email.sendKeys(strEmail);
    }
    
    public void setPassword(String strPassword){
        password.sendKeys(strPassword);
     }
    
    public void setMobileNo(String strNumber){
    	phone.sendKeys(strNumber);     
    }   
    
    public void setAddress(String strAddress){
    	address.sendKeys(strAddress);     
    }
	
    public void setDistrict(String strDistrict){
       district.sendKeys(strDistrict);
    }
    
    public void setState(String strState){
        state.sendKeys(strState);
     }
    
    public void setQualification(String strQualification){
    	qualification.click();
    	Select qualificationName=new Select(qualification);
    	qualificationName.selectByVisibleText(strQualification);
     }
    
    public void setPassOutYear(String strPassOutYear){
    	
    	passout.click();
    	passout.sendKeys(strPassOutYear);     
    }    
	
    public void setSkill(String strSkill){
       skills.sendKeys(strSkill);
    }
    
    //Set category in dropdown menu
    public void setEmployeeStatus(String strEmploymentStatus){
    	employmentStatus.click();
    	Select empStatus=new Select(employmentStatus);
    	empStatus.selectByVisibleText(strEmploymentStatus);
     }
    
    public void setTechTraining(String strTechTraining){
    	techtraining.sendKeys(strTechTraining);
     }
    
    public void setCourse(String strCourse){
    	course.click();
    	Select courseName=new Select(course);
    	courseName.selectByVisibleText(strCourse);     
    }
    
    public void setPhoto(String strPhoto){
    	//image.click();
    	image.sendKeys(strPhoto);
    }
 
  
    /*public void clearUserName() {
    	username.clear();
    }
    
    
    public void clearPassword() {
    	password.clear();
    }*/
    
    
  //Click on Login Button
    public void clickRegister(){
       register.click(); 
    }
}
