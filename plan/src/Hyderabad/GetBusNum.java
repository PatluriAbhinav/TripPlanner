package Hyderabad;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetBusNum {
int k= 0;
	List<String[]> cityadder = new ArrayList<String[]>();
	public GetBusNum(String t, int y){
		
		String s= "http://www.hyderabadbusroutes.com/index.php?service=BUSROUTE&page=";
		s=s.concat(t);
		Document doc = null;
		
		try {
			
			doc = Jsoup.connect(s).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int x=0;
		String [] sasu= new String[20];
		Element connection = doc.getElementById("content");
		Elements elements = connection.getElementsByTag("td");
		for (Element link : elements) {
			
				
			String linkText = link.text();
			
			
			
			//System.out.println(linkText);
			//System.out.println(sasu[x]);
			
			if(x==0 || x==5)
			{  
				x=0;
				System.out.println(y);
				System.out.println(sasu[1]);
				sasu= new String[20];
				sasu[0]=String.valueOf(y);
				x++;
				y++;
			}
			sasu[x]=linkText; 
			 x++;
			
			if(x==5){cityadder.add(sasu);
				
			}
			
				
}
		
k=y;		
	}
	
	public List<String[]> returndetails(){
		
		return cityadder;
	}

public int routenum(){
	return k;
	
}
}
