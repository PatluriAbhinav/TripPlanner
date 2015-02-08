package Gujarat;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Trying {
	static int x=1;
 String rows[] = new String[500];
	public Trying(){
		String s="C:\\Users\\AbhinavPatluri\\Desktop\\Modi";
				s=s.concat(String.valueOf(x));
				s=s.concat(".html");
		
		
		
		Document doc = null;
		
		File input = new File(s);
		try {
			doc = Jsoup.parse(input, "UTF-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		 
	
		Elements links = doc.getElementsByTag("div");
		for (Element link : links) {
		 
		  System.out.println(link.text());
		  
		  }
		System.out.println("Finished");
		
x++;		
	}
}
