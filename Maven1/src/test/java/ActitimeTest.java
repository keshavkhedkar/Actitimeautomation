import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActitimeTest {
	
	@Test
	public void LoginTest() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	}
	

}
