package RailwayInstances;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Railcapache {

	public static void main(String args[]){
		Document doc=null;
		try {
			 doc = Jsoup.connect("http://enquiry.indianrail.gov.in/ntes/").get();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try{
		Element content = (Element) doc.getElementById("ui-id-16"); 
		System.out.println(content);
		Elements links = content.getElementsByTag("img");
		for (Element link : links) {
			 
			  System.out.println(link.text());
			  }
		}
		catch (Exception e){System.out.println("No Need");
		Parsing par= new Parsing("18048");
		}
		
		
	}
}
