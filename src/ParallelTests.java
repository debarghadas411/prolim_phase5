import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ParallelTests {
	  WebDriver driver;
	    @Test(groups="Chrome")
	    public void LaunchChrome() {
	    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	        try {
	            Thread.sleep(2000);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    @Test(groups="Chrome", dependsOnMethods="LaunchChrome")
	    public void TryFacebook1() {
	        System.out.println(Thread.currentThread().getId());
	        driver.findElement(By.id("email")).sendKeys("debarghadas2013@gmail.com");
	        driver.findElement(By.id("pass")).sendKeys("Debargha@123");
	        driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
	    }
	    public void TryFacebook2() {
	        System.out.println(Thread.currentThread().getId());
	        driver.findElement(By.id("email")).sendKeys("debarghadas2013@gmail.com");
	        driver.findElement(By.id("pass")).sendKeys("Debargha@123");
	        driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
	        System.out.println(Thread.currentThread().getId());
	    }

}
