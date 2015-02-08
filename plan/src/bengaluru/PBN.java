package bengaluru;



import org.jsoup.select.Elements;
import org.jsoup.nodes.*;
//import org.w3c.dom.Document;
import org.jsoup.Jsoup;


import java.io.*;



public class PBN {
	
	String[] rows= new String[100];
	
	public  PBN(String var){
		String s="http://tellmyroute.com/Bengaluru/Route?q=";
		s=s.concat(var);
		System.out.println(var);
		
		rows[0]= var;
		rows[1]= "--->";
		
		int x=2;
		


				
		try { Element content = (Element) doc.getElementById("rtbox"); 
	
		Elements links = content.getElementsByTag("li");
		for (Element link : links) {
		 
		  String linkText = link.text();
		//System.out.println(linkText);
		rows[x]=linkText;
		  x++;
		  }}
		catch(Exception e){System.out.println("No Adress found for:"+var);}
			
	}
		
	
		
		
		
	public String[] returnsstring(){
		return rows;
	}
	
	
	
}
