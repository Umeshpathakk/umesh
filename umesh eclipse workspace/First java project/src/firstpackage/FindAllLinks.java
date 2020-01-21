package firstpackage;




import java.util.ArrayList;
import java.util.HashSet;

import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

//ArrayList<URL> lst2=new ArrayList<URL>();


public class FindAllLinks
{
	static HashSet<URL> hs=new HashSet<URL>();
	//static ArrayList<URL> lst2=new ArrayList<URL>();
	static ArrayList<String> Stringlst2=new ArrayList<String>();

	public static HashSet SupplyLinks(URL url) throws MalformedURLException
	{
		System.setProperty("webdriver.gecko.driver", "C:/Users/ITadmin/Downloads/geckodriver-v0.26.0-win64/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get(url.toString());

		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

		//System.out.println(links.size());

		for (int i = 0; i<links.size(); i=i+1)

		{
/*
			String str=(links.get(i).getAttribute("href"));
			if(str!=null)
				if(!(str.contains("javascript")))
					if(!(hs.contains(str)))
						System.out.println(str);
*/          if(links.get(i).getAttribute("href").toString()!=null)
			if(!links.get(i).getAttribute("href").toString().contains("javascript"))
			{
			URL url2=new URL(links.get(i).getAttribute("href").toString());
			if(url2!=null)
				hs.add(url2);
				//if(!(url2.toString().contains("javascript")))
				//	if(!(hs.contains(url)))
				//	System.out.println(url);
			
			
			
			//hs.add(url2);
			//  hs.add(str);
			//System.out.println(str);
			//	Stringlst2.add(str);
			// URL url = new URL(str);
			// URL url = new URL(links.get(i).getAttribute("href"));
			//lst2.add(url);
			// lst2.add(URL(links.get(i).getAttribute("href")));
			//	System.out.println(links.get(i).getAttribute("href"));
			//System.out.println(links.get(i).getText());

		}
		}
		//System.out.println(hs);
		//System.out.print(Stringlst2);
		return hs;
	}

}