package org.stepdefiniton.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class Stepdefiniton {

WebDriver driver;
@Given("the user in Wesendit free")
public void the_user_in_Wesendit_free() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\R SABRINATHAN\\eclipse1-workspace\\ConsitentsComas\\lib\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("http://www.wesendit2-frontend.webandappstudio.com:8003/");
	driver.findElement(By.className("//div[@class=\"navitem logoutbtn ng-binding ng-scope\"]")).click();


}

@When("the user enter the valid userName and Password {string}and {string}")
public void the_user_enter_the_valid_userName_and_Password_and(String string, String string2) 
	
	{
		driver.findElement(By.xpath("//button[text()=\"Log in\"]"));
		Assert.assertTrue("verify the registration confirmation mail",driver.getCurrentUrl().contains("http://www.wesendit2-frontend.webandappstudio.com:8003/plans"));
		System.out.println("Registraion confiramaion mail is get");
		
}

@When("The user navigate to the next page")
public void the_user_navigate_to_the_next_page() {
	System.out.println("suceesfully created");

	
    }

@When("the user enter the userName and Password {string} and {string}")
public void the_user_enter_the_userName_and_Password_and(String string, String string2) {
	
	driver.findElement(By.xpath("//button[text()=\"Forgot Password\"]")).click();
	driver.findElement(By.id("input_7")).sendKeys("");
	driver.findElement(By.xpath("//button[text()=\"Reset now\"]")).click();
	
	
	
}

@Then("password is changed")
public void password_is_changed()
{
	System.out.println("password is changed after modify the password");
}



}
