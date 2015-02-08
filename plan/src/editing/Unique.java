package editing;

import java.util.*;
import java.io.*;

import au.com.bytecode.opencsv.*;

public class Unique {

	public static void main(String args[]) throws IOException {
		
		CSVReader read = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\BangStop1.csv"));
		CSVWriter write = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\BangStop.csv"));
		List<String[]> ReadData= new ArrayList<String[]>();
		ReadData= read.readAll();
		
		String k;
		String l="";
		for(String row[]:ReadData){
			System.out.println(row[0]);
			String[] str= new String[5];
			k=row[0];
		if(k.compareTo(l)!=0){
			str[1]= k;
			l=k;
					write.writeNext(str);}
			
				
			}
		
		read.close();
		write.close();
		}
		
		
		
		
		
		
		
	}

