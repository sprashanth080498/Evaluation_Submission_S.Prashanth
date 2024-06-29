package demo_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class unit3_evaluation_2_orangehrm {
WebDriver driver;//we are creating a webdriver instance which interacts with the browsers driver
@BeforeTest			//annotaion before test
public void befr_test() throws InterruptedException {
	WebDriverManager.chromedriver().setup();//Running the chrome driver setup for the execution of the automation
	driver=new ChromeDriver();//creating an instance for the chrome driver
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//Opens the url of the chrome browser 
	driver.manage().window().maximize();//maximizes the window of the browser
	Thread.sleep(3000);//pauses the webpage for 3 seconds so that other codes can be executed properly 

}
@Test//testcase 1
public void testcase1() throws InterruptedException {
	driver.findElement(By.name("username")).sendKeys("Admin");//enters he login username
	driver.findElement(By.name("password")).sendKeys("admin123");//enters the login password
	driver.findElement(By.tagName("button")).click();//  click the submit button
	Thread.sleep(3000);
	driver.findElement(By.linkText("Admin")).click();//clicks on admin
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@class=\"oxd-topbar-body-nav-tab-item\" and text()='User Management ']")).click();//clicks on usermanagement 
	Thread.sleep(3000);
	driver.findElement(By.linkText("Users")).click();//selects the "users" option from user management dropdown
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@data-v-75e744cd]")).sendKeys("Ranga");//enters the text "ranga"
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@data-v-75e744cd]")).click();// selects the employee "Ranga akunuri"
	Thread.sleep(3000);
	List<WebElement> elements=driver.findElements(By.className("oxd-icon bi-caret-down-fill oxd-userdropdown-icon"));//stores all the options from the dropdown
	Thread.sleep(3000);
	String text="Logout";//stores the text logout to compare in for loop
	for(WebElement el:elements) {
		if(el.getText().contains(text)) {
			el.click();
		}
	}
	Thread.sleep(3000);
	driver.close();//closes the driver
}
}
