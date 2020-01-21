package firstpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ModularSelenium2222
{
	static String browser;
	static WebDriver  driver;
	public static void main(String[] args)
	{   
		setBrowser();
		setBrowserProperties();
		runtest();

	}
	public static void setBrowser()
	{
		browser="firefox";
	}
	public static void setBrowserProperties()
	{
		if(browser.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",  "C:\\Users\\ITadmin\\Desktop\\Umesh screenShots\\umesh eclipse workspace\\First java project\\chromeDriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		if(browser.contains("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:/Users/ITadmin/Downloads/geckodriver-v0.26.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	public static void runtest()
	{
		driver.get( "https://www.magicbricks.com");
		driver.quit();
	}

}
