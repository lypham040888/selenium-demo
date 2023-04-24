package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchCssSelectorTagName {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver chdriver = new ChromeDriver();

		chdriver.manage().window().maximize(); // maximize the page
		// open browser
		chdriver.get("https://autotest.jmaster.io/web/index.php/auth/login");

		Thread.sleep(3000);

		// Find element username

		WebElement userElement = chdriver.findElement(By.cssSelector("input[name=username]"));
		// Enter test data
		userElement.sendKeys("autotest1");
		Thread.sleep(2000);
		// Find element password

		WebElement passwordElement = chdriver.findElement(By.cssSelector("input.oxd-input[placeholder=Password]"));
		// Enter test data
		passwordElement.sendKeys("Autotest1");
		Thread.sleep(2000);
		// Find button login
		WebElement btnLogin = chdriver.findElement(By.xpath("//button[@type='submit']"));

		// Click login
		btnLogin.click();
		Thread.sleep(2000);

		chdriver.quit();
	}
}
