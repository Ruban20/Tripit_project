package tripit;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Tripit_Base_class {
	public static ChromeDriver driver;
	public static FileInputStream fis;
	public static Properties p;
 
	@BeforeMethod
	public void OpenBrowser() throws IOException {
		Reporter.log("open the browser",true);
		fis=new FileInputStream("./DataFiles/triplit.txt");
		p=new Properties();
		p.load(fis);
		String Link = p.getProperty("URL");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get(Link);
	}
	
	@AfterMethod
	public void CloseBrowser() {
		Reporter.log("Close the Browser", true);
		driver.close();

	}
}
