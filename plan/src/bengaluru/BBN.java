package bengaluru;



import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
//import org.w3c.dom.Document;
import org.jsoup.Jsoup;

import au.com.bytecode.opencsv.CSVWriter;


import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class BBN{
	
	
	public static void main(String args[]) throws IOException{
		Document doc = null;
		CSVWriter bengbus = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\BBN.csv"));
		CSVWriter bengcity = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\BCN.csv"));
		List<String[]> busadder = new ArrayList<String[]>();
		List<String[]> cityadder = new ArrayList<String[]>();
		
		try {
			doc = Jsoup.connect("http://narasimhadatta.info/bmtc_query.html").get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int x=0;
		
		Elements links = doc.getElementsByTag("option");
	
		
				for (Element link : links) {
					String [] pk= new String[20];
					
					
		  String linkText = link.text();
		  System.out.println(linkText);
		  pk[0]=linkText;
		  if(linkText.compareTo("1")==0){
			  x=200;
			  
		  }
		  if(x==0){
			  cityadder.add(pk);
			  		  
		  }
		  else {busadder.add(pk);}
		  
		}
		
				System.out.println("finished");
		
		bengcity.writeAll(cityadder);
		bengbus.writeAll(busadder);
		
		bengcity.close();
		bengbus.close();
		
		
		
	}}