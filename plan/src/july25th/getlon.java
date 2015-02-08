package july25th;
import java.io.*;
import java.util.*;
import au.com.bytecode.opencsv.*;

public class getlon {
String number;
	public getlon(String t) throws IOException{
		CSVReader read= new CSVReader(new FileReader("c://Users//AbhinavPatluri//Desktop//StopCordinates.csv"));
		
		List<String[]> reader= new ArrayList<String[]>();
		reader= read.readAll();
		
		for(String str[]: reader){
			
			if(str[0].compareToIgnoreCase(t)==0){
				
				number=str[2];
				
			}
			
		}
		read.close();
		
	}
	
	public String returnlon(){
		return number;
		
		
	}
	
}