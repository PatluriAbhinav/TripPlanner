package ahtsaa;

import au.com.bytecode.opencsv.*;
import java.util.*;
import java.io.*;

public class facebook {

	public static void main(String args[]) throws IOException{
		
		CSVReader read= new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//mapper.csv"));
		
		CSVWriter write = new CSVWriter(new FileWriter("C://Users//AbhinavPatluri//Desktop//maple.csv"));
		
		List<String[]> list= new ArrayList<String[]>();
		
		list= read.readAll();
		
		
		for(String str[]:list)
		{
			System.out.println(str[0]);
			String[] string= new String [9];
			string[0]= str[0];
			string[1]= str[1];
			string[2]= str[2];
			string[3]= "1"; 
			string[4]= str[4];
			string[5]= str[5];
			string[6]= str[6];
			string[7]= str[7];
			string[8]= str[8];
		
			write.writeNext(string);
		}
		
		write.close();
		read.close();
		
		
	}
}
