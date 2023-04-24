package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver chdriver = new ChromeDriver();

		chdriver.manage().window().maximize(); // maximize the page
		// open browser
		chdriver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		Thread.sleep(3000);

		// Find element username

		WebElement mailElement = chdriver.findElement(By.id("Email"));
		mailElement.clear();
		// Enter test data
		mailElement.sendKeys("admin@yourstore.com");

		// Find element password
		WebElement passwordElement = chdriver.findElement(By.id("Password"));
		passwordElement.clear();
		System.out.println(passwordElement.getAttribute("value"));
		// Enter test data
		passwordElement.sendKeys("admin");
		
		// Find button login
		WebElement btnLogin = chdriver.findElement(By.xpath("//button[@type='submit']"));
		System.out.print("The Login button:"+ btnLogin.getText());
		// Click login
		btnLogin.click();
		Thread.sleep(2000);
		
		chdriver.quit();
	}

}
