package editing;

import au.com.bytecode.opencsv.*;
import java.util.*;
import java.io.*;

public class caseediting {

	
	public static void main(String[] args) throws IOException{
		CSVReader read = new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//BangStop.csv"));
		CSVWriter write = new CSVWriter(new FileWriter("C://Users//AbhinavPatluri//Desktop//BangStop1.csv"));
		List<String[]> str= new ArrayList<String[]>();
		
		str= read.readAll();
		
		for(String row[]:str){
			String nayarow [] = new String[5];
			
			for( int i=0;i< row.length;i++){
				
				nayarow[i]=row[i].toLowerCase();
				
			}
			
			write.writeNext(nayarow);
			
		}
		
		read.close();
		write.close();
		
	}
}
