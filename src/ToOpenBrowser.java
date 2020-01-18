import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenBrowser {
static ChromeDriver driver;
public static void launchChrome() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Chinchore\\Desktop\\Selenium\\Testing Shastra\\new\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("C:\\Users\\Rahul Chinchore\\Desktop\\test.html");
	//By by=By.id("123");
	WebElement firstName=driver.findElement(By.name("XYZ"));
	firstName.sendKeys("Rahul");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement middleName=driver.findElement(By.className("B"));
	middleName.sendKeys("Madhukar");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("345")).sendKeys("Chinchore");
	WebElement btn1=driver.findElement(By.id("button1"));
	btn1.click();
}
	public static void main(String[] args) {
		launchChrome();
	}
}
