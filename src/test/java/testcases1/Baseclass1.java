package testcases1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass1 {
	
	public static WebDriver driver;
	@BeforeClass
	public void Openapp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.cyclos.org/ui/home");
		driver.manage().window().maximize();
	}
		@AfterClass
		public void Closeapp() {
			//driver.close();
		}
	}




