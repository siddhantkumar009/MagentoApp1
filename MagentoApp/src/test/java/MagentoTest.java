import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class MagentoTest {

	
	 @Test
	public void magentoTest() throws Exception {
	   
		String url = "http://www.magento.com";
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		Home h = new Home(driver);
		h.clickOnMyacc();

		Thread.sleep(2000);

		Login l = new Login(driver);
		l.typeemail("subramanyaraj87@gmail.com");
		Thread.sleep(2000);
		l.typePassword("Welcome123");
		Thread.sleep(2000);
		l.clickOnLogin();
		Thread.sleep(2000);

		Main m = new Main(driver);
		m.clickOnLogout();
		Thread.sleep(2000);
		System.out.println("data is pushed");

		driver.quit();

	}

}
