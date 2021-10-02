package TestNG_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dependOnMethod {
WebDriver driver;

    @Test
	public void Test1() {
		System.setProperty("webdriver.chrome.driver","D:\\Java\\chromedriver.exe");
		 driver=new ChromeDriver();
    }
		@Test(dependsOnMethods = {"Test1"})
		public void Test2() {
			driver.get("https://www.naukri.com/");
			driver.manage().window().maximize();
		}
		
	}

