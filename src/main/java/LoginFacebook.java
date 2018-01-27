import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginFacebook {
public static WebDriver driver;
@BeforeTest
public void setup()
{
	System.setProperty("webdriver.gecko.driver","E:\\ExampleGit\\WebdriverFacebook\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);
}
@Test
public void loginfacebook() throws InterruptedException
{
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("shafiforu65@gmail.com");
	Thread.sleep(3000);	
}
@AfterTest
public void teardown()
{
	driver.quit();
}

}
