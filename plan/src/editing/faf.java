package editing;

import au.com.bytecode.opencsv.*;
import java.util.*;
import java.io.*;


public class faf {
	public static void main (String args[])throws IOException{
		
		CSVReader read = new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//VD.csv"));
		CSVWriter write= new CSVWriter(new FileWriter("C://Users//AbhinavPatluri/Desktop//final.csv"));
		
		List<String[]> string= new ArrayList<String[]>();
		String str[]= new String[1000];
		string= read.readAll();
		for(String row[] : string){
			int y=0;
			for(int i =0; i<row.length; i++){
				if(row[i].compareTo("")!=0){
					int x=Integer.valueOf(row[i]);
					x--;
					str[y]= String.valueOf(x);
				y++;}
				
			}
			write.writeNext(str);
		}
		
		write.close();
		read.close();
	}

}
