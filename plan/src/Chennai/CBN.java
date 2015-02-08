package Chennai;



import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
//import org.w3c.dom.Document;
import org.jsoup.Jsoup;

import au.com.bytecode.opencsv.CSVWriter;


import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class CBN{
	
	
	public static void main(String args[]) throws IOException{
		Document doc = null;
		CSVWriter chenBus = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\CBN.csv"));
		String s="http://busroutes.in/chennai/routes/type/";
		String arr[]={"AC","DLX","EXP","LSS","MSVC","ORD","NGT"};
		
		
		
		List<String[]> cityadder = new ArrayList<String[]>();
		
		for(int i=0;i<7;i++){
		try {
			
			doc = Jsoup.connect(s.concat(arr[i])).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		Element con= doc.getElementById("view");
		Elements links = con.getElementsByTag("a");
	
		for (Element link : links) {
					String [] sasu= new String[20];
						
		  String linkText = link.text();
		  System.out.println(linkText);
		  sasu[0]=linkText;
		    cityadder.add(sasu);
			
		}
		}
		System.out.println("finished");
		chenBus.writeAll(cityadder);
		chenBus.close();
		
		
		
	}}