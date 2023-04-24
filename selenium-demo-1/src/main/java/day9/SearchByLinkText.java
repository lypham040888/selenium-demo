package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchByLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize the page
		// open browser
		driver.get("https://autotest.jmaster.io/web/index.php/auth/login");
		
		Thread.sleep(3000);

		// Find element username

		WebElement linkText = driver.findElement(By.linkText("OrangeHRM, Inc"));
		linkText.click();
		//WebElement partialText = driver.findElement(By.partialLinkText("OrangeHRM"));
		driver.quit();
	}

}
