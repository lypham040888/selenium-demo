package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchByCssSelector {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		passwordElement.sendKeys("Autotest12");
		
		// Find button login
		WebElement btnLogin = chdriver.findElement(By.xpath("//button[@type='submit']"));
		
		// Click login
		btnLogin.click();
		Thread.sleep(2000);

		WebElement body = chdriver.findElement(By.cssSelector("div.orangehrm-login-error"));
		System.out.println(body.getText());
		chdriver.quit();
	}
}
