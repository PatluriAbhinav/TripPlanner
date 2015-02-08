

import org.jsoup.select.Elements;
import org.jsoup.nodes.*;
//import org.w3c.dom.Document;
import org.jsoup.Jsoup;


import java.io.*;



public class parsing {
	
	String[] rows= new String[100];
	
	public  parsing(String var){
		String s="C:\\Users\\AbhinavPatluri\\Desktop\\trip\\";
		s=s.concat(var);
		s=s.concat(".html");
		System.out.println(var);
		
		
		rows[0]= var;
		rows[1]= "--->";
		
		int x=2;
		
		Document doc = null;
		
		File input = new File(s);
		try {
			doc = Jsoup.parse(input, "UTF-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		Element content = (Element) doc.getElementById("example-one"); 
	
		Elements links = content.getElementsByTag("b");
		for (Element link : links) {
		 
		  String linkText = link.text();
		  if(linkText.compareTo("+")!=0){
		  
			  if(linkText.compareTo("")!=0 && linkText.compareTo(" ")!=0)
			  { System.out.println(linkText);
			  rows[x]=linkText;
			  x++;}
		  }}
		
		
		
	
	
	}
public String[] returnsstring(){
		return rows;
		
		
	}
	
	
	
}
