package editing;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Trying {

	public static void main(String[] args){
		String s="C:\\Users\\AbhinavPatluri\\Desktop\\Modi.html";
		
		
		
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
		
		
	}
}
