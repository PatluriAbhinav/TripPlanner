package ahtsaa;

import au.com.bytecode.opencsv.CSVReader;
import java.util.*;
import java.io.*;
public class getfreq {
String string="";
	public getfreq(String str1, String str2) throws IOException{
		
		CSVReader read1= new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//def.csv"));
		List<String[]> list1= new ArrayList<String[]>();
		list1= read1.readAll();
		
		for(String str[]:list1){
			if(str[1].compareTo(str1)==0 && str[2].compareTo(str2)==0){
				string = str[3];
			break;
			}
			
			
		}
		read1.close();
	}
	
	public String get(){
		
		return string;
	}
}
