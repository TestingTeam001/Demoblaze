import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logout {

static String Username;
static String Password;
	WebDriver driver;
	 @BeforeTest
	    public void beforetest() {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
         driver = new ChromeDriver();
	          driver.get("https://www.demoblaze.com/index.html");
	          driver.manage().window().maximize();
	       
	 }
	    @AfterTest
	    public void aftertest(){
	        driver.close();
	    }
	    @Test
public  void test() throws InterruptedException
{
driver.findElement(By.id("login2")).click();
Username = driver.findElement(By.className("form-control-label")).getText();
if (Username.contentEquals("Username:"));
{ System.out.println(true);}

Password = driver.findElement(By.className("form-control-label")).getText();
if (Password.contentEquals("Password:"));
{System.out.println(true);}
Thread.sleep(200);
//valid user-name and password
driver.findElement(By.id("loginusername")).sendKeys("Charles Johnson");
Thread.sleep(200);
driver.findElement(By.id("loginpassword")).sendKeys("Johnson143");
Thread.sleep(200);

driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
WebDriverWait wait1 = new WebDriverWait(driver, 6);
	wait1.until(ExpectedConditions.elementToBeClickable(By.id("logout2")));
driver.findElement(By.id("logout2")).click();
System.out.println("Logout Successful!");

}
}
