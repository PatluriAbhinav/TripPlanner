
import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

import java.io.*;
import java.util.*;


public class unique {
	public static void  main(String args[]) throws Exception{
		
			String k="";	
			List<String[]> uniquefile = new ArrayList<String[]>();
			try {
			CSVReader hydfile = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\BangloreStops.csv"));
			CSVWriter writefile = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\bangStop.csv"));
			 
			String [] nextLine;
			
			
			while ((nextLine = hydfile.readNext()) != null) {
				  			        		        
			        	if((k.compareTo(nextLine[0])!=0)){ 
			        		uniquefile.add(nextLine);
			        		System.out.println(nextLine[0]);
			        		k=(String)nextLine[0]; 		}
															}
			

		writefile.writeAll(uniquefile);
		hydfile.close();
		writefile.close();
			
			        
				}
		 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			e.printStackTrace();
		}
		
	}

}
