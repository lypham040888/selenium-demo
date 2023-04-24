package day8;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// FirefoxDriver ffdriver = new FirefoxDriver();
		ChromeDriver chdriver = new ChromeDriver();

		chdriver.manage().window().maximize(); // maximize the page
		// open browser
		chdriver.get("https://autotest.jmaster.io/web/index.php/auth/login");
		
		Thread.sleep(3000);

		// Find element username

		WebElement userElement = chdriver.findElement(By.name("username"));
		// Enter test data
		userElement.sendKeys("autotest1");

		// Find element password

		WebElement passwordElement = chdriver.findElement(By.name("password"));
		// Enter test data
		passwordElement.sendKeys("Autotest1");
		
		// Find button login
		WebElement btnLogin = chdriver.findElement(By.xpath("//button[@type='submit']"));
		System.out.print("The Login button:"+ btnLogin.getText());
		// Click login
		btnLogin.click();
		Thread.sleep(2000);
		
		chdriver.quit();
		
	}

}
