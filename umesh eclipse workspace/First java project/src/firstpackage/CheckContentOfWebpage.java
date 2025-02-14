package firstpackage;
import java.io.*; 
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.net.MalformedURLException; 

public class CheckContentOfWebpage { 

	public static void DownloadWebPage(HashSet<URL> links) 
	{ 
		try { 
			//ArrayList<URL> lst=new ArrayList<URL>();
			HashSet<URL> hs=links;
			// Create URL object 
			Iterator itr=hs.iterator();
			while(itr.hasNext())
			{

				String str=(String) itr.next();
				URL url = new URL(str); 
				//ooper ki statement malformed url exception deti hai, string URL me convert nahi ho pa raha hai 
				// URL url = new URL("https://www.magicbricks.com/"); 
				BufferedReader readr =  
						new BufferedReader(new InputStreamReader(url.openStream())); 

				// Enter filename in which you want to download 
				BufferedWriter writer =  
						new BufferedWriter(new FileWriter("Download.html")); 

				// read each line from stream till end 
				String line; 
				while ((line = readr.readLine()) != null) { 
					writer.write(line); 

					if(line.contains("GTM-WQW25Z"))
						System.out.println(line);
					hs.add(url);
				} 
				//   System.out.print(lst);
				System.out.print(hs);

				readr.close(); 
				writer.close(); 
				// System.out.println("Successfully Downloaded."); 
			} 
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
		URL url =new URL( "https://www.magicbricks.com/");
		HashSet<URL> hs=FindAllLinks.SupplyLinks(url);// yahan hs string ka hashset hai but next line me ise URL ka HashSet bhejna hai
		DownloadWebPage(hs);

	} 
} 