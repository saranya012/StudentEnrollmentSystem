package com.StudentEnrollmentSystem.scripts;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.StudentEnrollmentSystem.constants.AutomationConstants;
import com.StudentEnrollmentSystem.pages.CourseDetails;
import com.StudentEnrollmentSystem.pages.CoursesPage;
import com.StudentEnrollmentSystem.pages.DemoPaymentPage;
import com.StudentEnrollmentSystem.pages.LandingPage;
import com.StudentEnrollmentSystem.pages.LoginPage;
import com.StudentEnrollmentSystem.pages.PaymentGateway;
import com.StudentEnrollmentSystem.pages.StudentProfileHomePage;
import com.StudentEnrollmentSystem.pages.StudentRegistrationPage;
import com.StudentEnrollmentSystem.utilities.ExcelUtility;

public class TestClass extends TestBase{
	
	LandingPage objLand;
	LoginPage objLogin;
	CoursesPage objCourses; 
	CourseDetails objCourseDetails;
	StudentRegistrationPage objStudentRegistration;
	PaymentGateway objPaymentGateway;
	DemoPaymentPage objDemoPaymentPage;
	ExcelUtility objExcel;
	StudentProfileHomePage objStudentProfileHomePage; 
	
	/*@Test(priority=1, enabled=true)
	  public void verifyTitle() throws IOException {
	  //Create Login Page object
		objLand = new LandingPage(driver);
	  String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	  String actualTitle =driver.getTitle();
	  Assert.assertEquals(expectedTitle,actualTitle);
	  }

		
	@Test(priority=1, enabled=true)
	  public void verifyLoginPageNavigation() throws IOException {
		//Create Landing Page object
		objLand=new LandingPage(driver);
		objLand.clickLogin();
	  String expectedUrl =AutomationConstants.LOGIN_PAGE_URL;
	  String actualUrl =driver.getCurrentUrl();
	  Assert.assertEquals(expectedUrl,actualUrl);
	  }*/
	
	  
	 /* @Test(priority=1, enabled=true)
	  public void verifyCoursePageNavigation() throws IOException {
		//Create Landing Page object
		objLand=new LandingPage(driver);
		objLand.clickCourses();
	    String expectedUrl =AutomationConstants.COURSES_PAGE_URL;
	  String actualUrl =driver.getCurrentUrl();
	  Assert.assertEquals(expectedUrl,actualUrl);
	  }
	  
	  
	  @Test(priority=1, enabled=true)
	  public void verifyCourseDetailsPageNavigation() throws IOException {
		//Create Landing Page object
		objCourses=new CoursesPage(driver);
		objCourses.clickKnowmore_mean();
	   String expectedUrl =AutomationConstants.COURSE_DETAILS_PAGE_URL;
	  String actualUrl =driver.getCurrentUrl();
	  Assert.assertEquals(expectedUrl,actualUrl);
	  }
	  
	  
	  @Test(priority=1, enabled=true)
	  public void verifyRegistrationPageNavigation() throws IOException {
		//Create Landing Page object
		  objLand=new LandingPage(driver);
		  objLand.clickCourses();

		  objCourses=new CoursesPage(driver);
		  objCourses.clickKnowmore_mean();

		  objCourseDetails=new CourseDetails(driver);
		  objCourseDetails.clickEnroll();
		  
		  String expectedUrl =AutomationConstants.REGISTRATON_PAGE_URL;
		  String actualUrl =driver.getCurrentUrl();
		  Assert.assertEquals(expectedUrl,actualUrl);
	  }
	  
	  

	
	
	@Test(priority=1, enabled=true)
	  public void verifyInvalidLogin() throws IOException, InterruptedException {
		  //Create Login Page object
	  objLogin = new LoginPage(driver);
	  
	  //login to application
	  String username = ExcelUtility.getCellData(1, 0);
	  String password = ExcelUtility.getCellData(1, 1);
	  String category = ExcelUtility.getCellData(1, 2);
	  objLogin.setUserName(username);
	  Thread.sleep(1000);
	  objLogin.setPassword(password);
	  Thread.sleep(1000);
	  objLogin.setCategory(category);
	  Thread.sleep(1000);
	  objLogin.clickSignin();
	  String expectedErrorMessage =AutomationConstants.LOGIN_ERROR_MESSAGE;
	  String actualErrorMessage =driver.switchTo().alert().getText();
	  Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
	  }*/
	
	  
	  @Test(priority=1, enabled=true)
	  public void verifyValidLogin() throws IOException {
		  //driver.navigate().refresh();
		  
		  //Create Login Page object
		  
		  objLand =new LandingPage(driver);
		  objLand.clickLogin();

		  objLogin = new LoginPage(driver);
	  
		  //login to application
		  	String username = ExcelUtility.getCellData(0, 0);
	  		String password = ExcelUtility.getCellData(0, 1);
	  		String role = ExcelUtility.getCellData(0, 2);
	  		//objLogin.clearUserName();
	  		//objLogin.clearPassword();
	  		objLogin.setUserName(username);
	  		objLogin.setPassword(password);
	  		objLogin.setRole(role);
	  		//System.out.println(category);
	  		objLogin.clickSignin();
	  		try {
	  		    WebDriverWait wait = new WebDriverWait(driver, 2);
	  		    wait.until(ExpectedConditions.alertIsPresent());
	  		Alert alert=driver.switchTo().alert();
	  		String alertMessage= driver.switchTo().alert().getText();	// capture alert message
	  		String expectedMessage =AutomationConstants.LOGIN_SUCCESS_MESSAGE;
	  		String actualMessage =alertMessage;
	  		//String expectedUrl =AutomationConstants.HOMEPAGETITLE;
	  		//String actualUrl =driver.getCurrentUrl();
	  		Assert.assertEquals(expectedMessage,actualMessage);
	  		alert.accept();
	  		} catch (Exception e) {
	  			System.out.println(e);	  		
	  			} 	
	  }
	  
	 
	  
	
	  
	  /*@Test(priority=1, enabled=true)
	  public void verifyStudentRegisration() throws IOException {
		  /*objLand =new LandingPage(driver);
		  objLand.clickCourses();

		  objCourses=new CoursesPage(driver);
		    WebDriverWait wait = new WebDriverWait(driver, 2);

		  objCourses.clickKnowmore_mean();

		  objCourseDetails=new CourseDetails(driver);
		  objCourseDetails.clickEnroll();*/
		  
		  /*objStudentRegistration= new StudentRegistrationPage(driver);
		  
  
		  //Register to application
		  	String name = ExcelUtility.getCellData(0, 0);
		  	objStudentRegistration.setName(name);
		  	
	  		String email = ExcelUtility.getCellData(0, 1);
		  	objStudentRegistration.setEmail(email);

	  		String password = ExcelUtility.getCellData(0, 2);
		  	objStudentRegistration.setPassword(password);

	  		String mobileno = ExcelUtility.getCellData(0, 3);
		  	objStudentRegistration.setMobileNo(mobileno);

	  		String address = ExcelUtility.getCellData(0, 4);
		  	objStudentRegistration.setAddress(address);

	  		String district = ExcelUtility.getCellData(0, 5);
		  	objStudentRegistration.setDistrict(district);

	  		String state = ExcelUtility.getCellData(0, 6);
		  	objStudentRegistration.setState(state);

	  		String qualification = ExcelUtility.getCellData(0, 7);
		  	objStudentRegistration.setQualification(qualification);

	  		String passoutyear = ExcelUtility.getCellData(0, 8);
		  	objStudentRegistration.setPassOutYear(passoutyear);

	  		String skill = ExcelUtility.getCellData(0, 9);
		  	objStudentRegistration.setSkill(skill);

	  		String employmentstatus = ExcelUtility.getCellData(0, 10);
		  	objStudentRegistration.setEmployeeStatus(employmentstatus);

	  		String techtraining = ExcelUtility.getCellData(0, 11);
		  	objStudentRegistration.setTechTraining(techtraining);

	  		String course = ExcelUtility.getCellData(0, 12);
		  	objStudentRegistration.setCourse(course);

	  		String photo = ExcelUtility.getCellData(0, 13);
		  	objStudentRegistration.setPhoto(photo);
		  	
		  	objStudentRegistration.clickRegister();*/
		  	
		  	/*String expectedUrl =AutomationConstants.HOMEPAGETITLE;
	  		String actualUrl =driver.getCurrentUrl();
	  		Assert.assertEquals(expectedMessage,actualMessage);
	  		
		  	
		  	
	  }
	  
	  
	  @Test(priority=1, enabled=true)
	  public void verifyStudentProfileHomePage() throws IOException {
		  
		  String displayText;
		  
		  objLand =new LandingPage(driver);
		  objLand.clickLogin();
		  
		  objLogin = new LoginPage(driver);
		  
		  //login to application
		  	String username = ExcelUtility.getCellData(0, 0);
	  		String password = ExcelUtility.getCellData(0, 1);
	  		String role = ExcelUtility.getCellData(0, 2);
	  		//objLogin.clearUserName();
	  		//objLogin.clearPassword();
	  		objLogin.setUserName(username);
	  		objLogin.setPassword(password);
	  		objLogin.setRole(role);
	  		objLogin.clickSignin();
	  		try {
	  		    WebDriverWait wait = new WebDriverWait(driver, 2);
	  		    wait.until(ExpectedConditions.alertIsPresent());
	  		Alert alert=driver.switchTo().alert();
	  		alert.accept();
	  		} catch (Exception e) {
	  			System.out.println(e);	  		
	  			}
	  		
	  		objStudentProfileHomePage =new StudentProfileHomePage(driver);
	  		displayText=objStudentProfileHomePage.getDisplayText();
	  		
	  		Assert.assertTrue(displayText.contains("WELCOME "));
	  		}*/
	  
	  /*
	  @Test(priority=1, enabled=true)
	  public void verifyStudentViewProfile() throws IOException {
		  

		  objLand =new LandingPage(driver);
		  objLand.clickLogin();
		  
		  objLogin = new LoginPage(driver);
		  
		  //login to application
		  	String username = ExcelUtility.getCellData(0, 0);
	  		String password = ExcelUtility.getCellData(0, 1);
	  		String role = ExcelUtility.getCellData(0, 2);
	  		//objLogin.clearUserName();
	  		//objLogin.clearPassword();
	  		objLogin.setUserName(username);
	  		objLogin.setPassword(password);
	  		objLogin.setRole(role);
	  		objLogin.clickSignin();
	  		try {
	  		    WebDriverWait wait = new WebDriverWait(driver, 2);
	  		    wait.until(ExpectedConditions.alertIsPresent());
	  		Alert alert=driver.switchTo().alert();
	  		alert.accept();
	  		} catch (Exception e) {
	  			System.out.println(e);	  		
	  			}
	  		
	  		objStudentProfileHomePage =new StudentProfileHomePage(driver);
	  		
	  		objStudentProfileHomePage.clickViewProfile();
	  		
  		
	  		String expectedUrl =AutomationConstants.VIEW_PROFILE_PAGE_URL;
	  		String actualUrl =driver.getCurrentUrl();
	  		Assert.assertEquals(expectedUrl,actualUrl);
	  		
	  }*/


	  /*
	  @Test(priority=1, enabled=true)
	  public void verifyStudentProfileLogout() throws IOException, InterruptedException {
		  
		  
		  objLand =new LandingPage(driver);
		  objLand.clickLogin();
		  
		  objLogin = new LoginPage(driver);
		  
		  //login to application
		  	String username = ExcelUtility.getCellData(0, 0);
	  		String password = ExcelUtility.getCellData(0, 1);
	  		String role = ExcelUtility.getCellData(0, 2);
	  		//objLogin.clearUserName();
	  		//objLogin.clearPassword();
	  		objLogin.setUserName(username);
	  		objLogin.setPassword(password);
	  		objLogin.setRole(role);
	  		objLogin.clickSignin();
	  		try {
	  		    WebDriverWait wait = new WebDriverWait(driver, 2);
	  		    wait.until(ExpectedConditions.alertIsPresent());
	  		Alert alert=driver.switchTo().alert();
	  		alert.accept();
	  		} catch (Exception e) {
	  			System.out.println(e);	  		
	  			}
	  		
	  		objStudentProfileHomePage = new StudentProfileHomePage(driver);
	  		objStudentProfileHomePage.clickLogout();
	  		
	  		String expectedUrl =AutomationConstants.LOGIN_PAGE_URL;
	  		String actualUrl =driver.getCurrentUrl();
	  		Assert.assertEquals(expectedUrl,actualUrl);
	  		
	  }*/
}

	  		
	  		