package editing;

import java.io.*;
import java.util.*;

import au.com.bytecode.opencsv.*;


public class Sorting {
public static void main (String args[]) throws IOException{
	CSVReader read = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\RouteNumbers.csv"));
	CSVWriter write = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\BangloreFinal.csv"));
	
	List<String[]> string = new ArrayList<String[]>();
	string= read.readAll();
	
	for(String each[] : string ){
	System.out.println(each[0]);
		String newstring[] = new String[500];
		int x=0;
		//System.out.println("@@@$$--->"+each.length);
		for(int i =0; i<each.length;i++){
			//System.out.println("Insdie"+i+")"+each[i]);
			if(each[i].compareTo("")==0){break;}
			System.out.println(i+")"+each[i]);
			newstring[i+1]= each[i];
			x++;
		}
		newstring[0]= String.valueOf(x-1);
		
		write.writeNext(newstring);
	}
	
	read.close();
	write.close();
	
}
	
}
