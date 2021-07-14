import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTestNG {
	WebDriver driver;
// Saving the expected title of the Webpage
	String title = "ToolsQA - Demo Website For Autonation";
	@Test (groups = { "demo" })
	public void starting_point() {
		System. out.println("This is the starting point of the test");
		//Initialize Chrome Driver
		//driver . manage() . timeouts() . implicitlywait(1, TimeUnit.SECONDS);
		//System Property for chrome Driver
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
	}
	@Test(groups = { "demo" }, priority = 1)
	public void checkTitle() {
	String testTitle = "ToolsQA";
	String originalTitle = driver.getTitle();
	Assert.assertEquals (originalTitle, testTitle);
	}
	@Test(groups = { "demo" }, priority = 1)
	public void click_element() {
	driver. findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
	System. out. println("Home Page heading is displayed");
	}
}