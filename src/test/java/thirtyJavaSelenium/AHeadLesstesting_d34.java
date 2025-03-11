package thirtyJavaSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AHeadLesstesting_d34 {	
	@Test
void doheadlesstesting() 	
{
ChromeOptions options = new ChromeOptions();
options.addArguments("--headless=new");
WebDriver driver=new ChromeDriver(options); //

options.setExperimentalOption("excludeswithces",new String[] {"enable-automation"});
driver.get("https://www.prasanthinilayam.in/");

driver.quit();
}
}