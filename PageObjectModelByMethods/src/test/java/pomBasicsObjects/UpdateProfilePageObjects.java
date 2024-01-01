package pomBasicsObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateProfilePageObjects {
	public static WebElement myProfile(WebDriver driver){
		return driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
	}
	
    public static WebElement phoneNumber(WebDriver driver){
    	return driver.findElement(By.id("Phone"));
	}
    
    public static WebElement cityName(WebDriver driver){
    	return driver.findElement(By.id("City"));
	}


}
