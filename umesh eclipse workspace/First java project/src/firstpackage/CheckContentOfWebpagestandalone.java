package firstpackage;
import java.io.*; 
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.net.MalformedURLException; 

public class CheckContentOfWebpagestandalone
{ 

	public static void DownloadWebPage(URL url) 
	{ 
		try { 
			//ArrayList<URL> lst=new ArrayList<URL>();
			//HashSet<URL> hs=links;
			// Create URL object 
			//Iterator itr=hs.iterator();
			//	while(itr.hasNext())

			//	String str=(String) itr.next();
			//URL url = new URL(str); 
			//ooper ki statement malformed url exception deti hai, string URL me convert nahi ho pa raha hai 
			// URL url = new URL("https://www.magicbricks.com/"); 
			System.out.println("a");
			BufferedReader readr =  
					new BufferedReader(new InputStreamReader(url.openStream())); 
			System.out.println("b");

			// Enter filename in which you want to download 
			BufferedWriter writer =  
					new BufferedWriter(new FileWriter("Download.html")); 

			// read each line from stream till end 
			String line; 
			while ((line = readr.readLine()) != null)
			{ 
				writer.write(line); 

			//	if(line.contains("https://www.googletagmanager.com/gtm.js?id=GTM-WQW25Z"))
				if(line.contains("GTM-WQW25Z"))	
				{
					System.out.println("yes");
					break;
				}  
				//System.out.println(line);
				//	hs.add(url);

				//   System.out.print(lst);
				//	System.out.print(hs);

				//readr.close(); 
				//	writer.close(); 
				// System.out.println("Successfully Downloaded."); 
			} 
		readr.close(); 
		writer.close(); 

		}
		// Exceptions 
		catch (MalformedURLException mue) { 
			System.out.println("Malformed URL Exception raised"); 
		} 
		catch (IOException ie) { 
			System.out.println("IOException raised"); 
		} 
	} 
	public static void main(String args[]) 
			throws IOException 
	{ 

		//URL[] arr= { "https://www.magicbricks.com/".toString()};
		
	//	String[] StArray= {"https://www.deployment.magicbricks.com/","https://www.deployment.magicbricks.com/property-for-sale/residential-real-estate?proptype=Multistorey-Apartment,Builder-Floor-Apartment,Penthouse,Studio-Apartment,Residential-House,Villa&cityName=Noida","https://www.deployment.magicbricks.com/Real-estate-projects-Search/residential-new-project?&proptype=Multistorey-Apartment,Builder-Floor-Apartment,Penthouse,Studio-Apartment,Residential-House,Villa&cityName=Noida&postedSince=-1&mbTrackSrc=tabChange&page=1&category=S","https://www.deployment.magicbricks.com/jm-florence-noida-extension-noida-pdpid-4d4235303231343631","https://www.deployment.magicbricks.com/propertyDetails/3-BHK-1345-Sq-ft-Multistorey-Apartment-FOR-Sale-Sector-78-in-Noida-r2&id=4d423137333932343335?sem=Y"};
		String[] StArray= {"https://www.magicbricks.com/","https://www.magicbricks.com/property-for-sale/residential-real-estate?proptype=Multistorey-Apartment,Builder-Floor-Apartment,Penthouse,Studio-Apartment,Residential-House,Villa&cityName=Noida","https://www.magicbricks.com/Real-estate-projects-Search/residential-new-project?&proptype=Multistorey-Apartment,Builder-Floor-Apartment,Penthouse,Studio-Apartment,Residential-House,Villa&cityName=Noida&postedSince=-1&mbTrackSrc=tabChange&page=1&category=S","https://www.magicbricks.com/jm-florence-noida-extension-noida-pdpid-4d4235303231343631","https://www.magicbricks.com/propertyDetails/3-BHK-1345-Sq-ft-Multistorey-Apartment-FOR-Sale-Sector-78-in-Noida-r2&id=4d423137333932343335?sem=Y"};
		int len=StArray.length;
		System.out.println(len);
		for(int i=0;i<len;i++)	
		{
			String str=StArray[i];
			URL url =new URL( str);
			System.out.println(url);
			//URL url =new URL( "https://www.magicbricks.com/");

			//HashSet<URL> hs=FindAllLinks.SupplyLinks(url);// yahan hs string ka hashset hai but next line me ise URL ka HashSet bhejna hai
			DownloadWebPage(url);

		} 
	} 
}