package BlockAlgo;

import au.com.bytecode.opencsv.CSVReader;
import java.util.*;
import java.io.*;

public class GetNum {
	String x;
	public GetNum(String string)throws IOException {
		
		CSVReader read= new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//BangStop.CSV"));
		
		List<String[]> str= new ArrayList<String[]>();
		str= read.readAll();
		
		for(String row[]: str){
			
			if(row[1].compareTo(string)==0){
				x=row[0];
				
			}
			
		}
		
		read.close();
	}

	public int returnNum(){
		
		return (int)Integer.valueOf(x);
		
	}
	
}
