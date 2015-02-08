package MMTS;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.*;

import au.com.bytecode.opencsv.CSVWriter;
import java.util.*;

public class ParseData {
	
	public ParseData(String str) throws IOException{
	
		CSVWriter HydMmt = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\Che.csv"));
		
		List<String[]> hydlist= new ArrayList<String[]>();
		String Url= "http://www.metrotraintimings.com/Hyderabad/";
		Url=Url.concat(str);
		//System.out.println(Url);
		Document doc= null;
		try {
			
			doc = Jsoup.connect(Url).get();
		}
		catch(Exception e){ System.out.println("Link not connected");
		}
	
		String row[][]= new String[49][49];
		for(int i=0;i<49;i++ ){
			for(int j=0;j<49;j++){
				row[i][j]= new String("");
				//System.out.println(i);
				
			}
			
			
		}
		int count =0;
		int z=0;
		int t=0;
		int x=1; int l=0; int q=0;
	Elements stops = doc.getElementsByTag("td");
	for(Element stopname:stops){
		System.out.println(stopname.text());
		if((stopname.text().compareTo("Kms"))==0){l=90;}
		if(l!=0){
		
		if((stopname.text().compareTo("57474"))==0){t=50;}
		
	if(t!=0){
	
		System.out.println(stopname.text()+"--"+count+"@@@"+z);
		if((stopname.text().compareTo(" DO NOT run on SUNDAYS "))==0){System.out.println(stopname.text()+"--"+count+"@@@"+z); count=14;}
		if(z==0){
			row[q][z]=stopname.text();
			row[q][1]=stopname.text();
			q=q+2;
		}
   if(count==1 && z!=0){
	   for(int i=0;i<49;i=i+2){
		   row[i][z]=stopname.text();
		      }}
   else if(count!=0 && count!=1 && z!=0 && z!=1){
	   System.out.println(x+"------"+z);
	   row[x][z]=stopname.text();
	   x=x+2;
   }		
	}
		
		
	count++;
	if(count==18){
		count=0;
		z++;
		x=1;
	}
	
	if(z==18){
		break;
	}
	}}
	
	
	System.out.println("Finished--"+ row[0][0]);
	for(int i=0; i<49;i++){
		hydlist.add(row[i]);
		
		
	}
	HydMmt.writeAll(hydlist);
	HydMmt.close();
	
	}

	
}
