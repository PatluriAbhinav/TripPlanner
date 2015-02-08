package july25th;

import java.io.*;
import java.util.*;
import au.com.bytecode.opencsv.*;
public class DatabaseData {

	public static void main (String args[]) throws IOException{
		
		CSVReader read= new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//Tripytrick.csv"));
		CSVWriter write= new CSVWriter(new FileWriter("C://Users//AbhinavPatluri//Desktop//Final1.csv"));
		List<String[]> list= new ArrayList<String[]>();
		list= read.readAll();
		int x=1;
		for(String sas[] : list){
			String str[]= new String[10];
			str[0]=sas[0];
			str[1]=sas[1];
			str[2]=(new getlat(sas[0]).returnlat());
			str[3]=(new getlon(sas[0]).returnlon());
			str[4]=(new getlat(sas[1]).returnlat());
			str[5]=(new getlon(sas[1]).returnlon());
			str[6]=sas[2];
			System.out.println(x);
			x++;
			write.writeNext(str);
			
		}
		
		
		
		
		
		read.close();
		write.close();
	}
	
}

