package Gujarat;


import java.io.*;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import au.com.bytecode.opencsv.CSVWriter;

public class GetData {

	public GetData() throws IOException{
		
		CSVWriter finalfile = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\gujarath.csv"));
		String gujarat= "C:\\Users\\AbhinavPatluri\\Desktop\\GSRTC.html";		
	
		List<String[]> GUJ = new ArrayList<String[]>();
		
		Document doc= null;
		File input = new File(gujarat);
		
	try{
		doc= Jsoup.parse(input,"UTF-8");
		
		
	}
	
	
	catch (Exception e ){System.out.println("Cannot find the file..!");}
	
	//System.out.println(doc.text());
	Elements lists= doc.getElementsByTag("option");
	System.out.println("ram");
	for(Element st : lists){
		String[] rows= new String[100];
		rows[0]= st.text();
		
		StringTokenizer st2 = new StringTokenizer(st.val(), ",");
		int x=1;
		while (st2.hasMoreElements()) {
			rows[x]=String.valueOf(st2.nextElement());
		
			x++;
		}
		System.out.println("ABHINAV"+rows[0]);
		GUJ.add(rows);
	}
	
	finalfile.writeAll(GUJ);
	finalfile.close();	
	
	
	}
}
