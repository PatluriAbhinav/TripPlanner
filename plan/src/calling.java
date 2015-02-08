
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;






public class calling  {
	public static void main(String args[]) throws IOException{
	
		List<String[]> finfile = new ArrayList<String[]>();
		
		
	CSVReader sasfile = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\sasu.csv"));
	
	CSVWriter finalfile = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\sasu1.csv"));
	
		System.out.println("Fie not Found");
	
	
	String [] BusNum;
	
	
	while ((BusNum = sasfile.readNext()) != null) {
		
		 	parsing ram = new parsing(BusNum[0]);	        		    
		 	finfile.add(ram.returnsstring());
		 	
	
	}
	
	sasfile.close();
	finalfile.writeAll(finfile);
	finalfile.close();
	
	
	

	}}
