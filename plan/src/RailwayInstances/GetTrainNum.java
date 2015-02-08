package RailwayInstances;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import au.com.bytecode.opencsv.CSVWriter;

public class GetTrainNum {
/**
 * @param args
 * @throws IOException
 */
public static void main (String args[]) throws IOException{
 CSVWriter Trainfile = null;
	try { Trainfile = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\TrainNum.csv"));
	}
	catch (Exception e){System.out.println("Nothing was found");}
	
	List<String[]> cityadder = new ArrayList<String[]>();
	
		
		String s= "http://www.indianrail.gov.in/mail_express_trn_list.html";
		Document doc = null;
		
		try {
			
			doc = Jsoup.connect(s).get();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		
		int x=0;
		int l=0;
		String [] sasu= new String[20];
		int y=1;
		Elements elements = doc.getElementsByTag("td");
		for (Element link : elements) {
			
				
			String linkText = link.text();
			//System.out.println(linkText);
		 if (linkText.compareTo("02018")==0){
			 l=50;
			 System.out.println("love");
		 }
			if(l!=0){
			if(x==0 || x==7)
			{  	x=0;
				System.out.println(sasu[1]);
				sasu= new String[20];
				sasu[0]=String.valueOf(y);
				x++;
				y++;
			}
			sasu[x]=linkText; 
			 x++;
			
			if(x==7){cityadder.add(sasu);
			}}}
	

Trainfile.writeAll(cityadder);
Trainfile.close();
	
}
}
