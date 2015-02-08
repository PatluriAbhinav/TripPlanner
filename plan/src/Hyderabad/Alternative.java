package Hyderabad;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

public class Alternative {
	
	
	public static void main(String args[]) throws IOException{
		
		CSVReader stops = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\Stops.csv"));
		CSVReader paths = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\Hyderabadreading.csv"));
		CSVWriter write = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\route.csv"));
		 
		
		List<String[]> route = new ArrayList<String[]>();
		List<String[]> pathdet= new ArrayList<String[]>();
		String Stops[];
	 pathdet=paths.readAll();
		
		while ((Stops = stops.readNext()) != null) {
			String str[]= new String[1000];
			str[0]=Stops[0];
			int z=2;
			System.out.println(Stops[0]);
		   
				    for (int i = 0; i < pathdet.size(); i++) {
		        String[] strings = pathdet.get(i);
		        for (int j =3; j <strings.length; j++) {
		        	if((Stops[0].compareTo(strings[j]))==0){
 						str[z]=strings[0];
 						z++;
}  } }
		 					route.add(str);}
		
		write.writeAll(route);	
		write.close();
		stops.close();
		paths.close();
		
		}
		
		
	}


