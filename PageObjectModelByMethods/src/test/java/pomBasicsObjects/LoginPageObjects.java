package pomBasicsObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	//username, password, submit button
	
	public static WebElement userName(WebDriver driver){
		return driver.findElement(By.id("email"));
	}
	
	public static WebElement passWord(WebDriver driver){
		return driver.findElement(By.id("password"));
	}
	
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.id("submitBTN"));
	}
	
}
