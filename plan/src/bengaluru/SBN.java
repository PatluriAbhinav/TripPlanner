package bengaluru;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;






public class SBN  {
	public static void main(String args[]) throws IOException, InterruptedException{
	
		List<String[]> finbgl = new ArrayList<String[]>();
		
		
	CSVReader BusDet = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\BBN.csv"));
	
	CSVWriter finDet = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\FBBN.csv"));
	
		//System.out.println("Fie not Found");
	
	
	String [] BusNum;
	
	
	while ((BusNum = BusDet.readNext()) != null) {
			//System.out.println(BusNum[0]+"@@@###");
		 	PBN ram = new PBN(BusNum[0]);	        		    
		 	finbgl.add(ram.returnsstring());
		 	TimeUnit.SECONDS.sleep(2);
	
	}
	
	BusDet.close();
	finDet.writeAll(finbgl);
	finDet.close();
	
	
	

	}}
