package Kolkatta;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import au.com.bytecode.opencsv.CSVWriter;
import java.util.*;

public class GetNum {
	public static void main(String[]args) throws IOException{
		
		
		
		
			String s="C:\\Users\\AbhinavPatluri\\Desktop\\kolkata.htm";
			CSVWriter writing = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\ram.csv"));
			 List<String[]> str = new ArrayList<String[]>();
			 
			Document doc = null;
			
			File input = new File(s);
			try {
				doc = Jsoup.parse(input, "UTF-8");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Elements links = doc.getElementsByTag("option");
			for (Element link : links) {
				String []rows= new String[2];
			 String text= link.text();
			// System.out.println(text);
			 rows[0]=text;
			 rows[1]=link.val();
				System.out.println(rows[0]);
			  str.add(rows);}
		writing.writeAll(str);
		writing.close();
		
	}

}
