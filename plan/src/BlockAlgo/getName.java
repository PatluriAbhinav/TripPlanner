package BlockAlgo;

import au.com.bytecode.opencsv.CSVReader;
import java.util.*;
import java.io.*;

public class getName {
	String x;
	public getName(int y)throws IOException {
		
		CSVReader read= new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//BangStop.CSV"));
		
		List<String[]> str= new ArrayList<String[]>();
		str= read.readAll();
		
		for(String row[]: str){
			
			if(row[0].compareTo(String.valueOf(y))==0){
				x=row[1];
				
			}
			
		}
		
		read.close();
	}

	public String returnName(){
		return x;
		
	}
	
}
