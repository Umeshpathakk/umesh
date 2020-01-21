package firstpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlessearch
{
	public static void main(String[] args)
	{
		googlesearch();
	}
	
	public static void googlesearch()
	{
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\ITadmin\\Desktop\\Umesh screenShots\\umesh eclipse workspace\\First java project\\chromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in");
        driver.findElement(By.name("q")).sendKeys("ABCD");
       // driver.findElement(By.name("btnK")).click();
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN); 
        driver.quit();
	}
}