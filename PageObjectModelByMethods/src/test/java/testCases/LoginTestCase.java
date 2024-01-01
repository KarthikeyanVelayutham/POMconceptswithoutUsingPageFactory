package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomBasicsObjects.LoginPageObjects;
import pomBasicsObjects.UpdateProfilePageObjects;

public class LoginTestCase {
@Test
public void oginTestCase() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.phptravels.net/login");
	LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
	LoginPageObjects.passWord(driver).sendKeys("demouser");
	LoginPageObjects.submit(driver).click();
	Thread.sleep(4000);
	UpdateProfilePageObjects.myProfile(driver).click();
	UpdateProfilePageObjects.phoneNumber(driver).clear();
	UpdateProfilePageObjects.phoneNumber(driver).sendKeys("3213456789");
	UpdateProfilePageObjects.cityName(driver).clear();
	UpdateProfilePageObjects.cityName(driver).sendKeys("india");
	Thread.sleep(3000);
	driver.quit();
}
}
