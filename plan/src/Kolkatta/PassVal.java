package Kolkatta;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;






public class PassVal {
	public static void main(String args[]) throws IOException, InterruptedException{
	
		List<String[]> finbgl = new ArrayList<String[]>();
		
		
	CSVReader BusDet = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\ram.csv"));
	
	CSVWriter finDet = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\seeta.csv"));
	 
		
	System.out.println("jijfj");
	
	String [] BusNum;
	
	int x=404;
	while ((BusNum = BusDet.readNext()) != null) {
			System.out.println(x);
			System.out.println(BusNum[0]+"---"+BusNum[1]);
		ScrapeKol  ram = new ScrapeKol(BusNum[1],BusNum[0]);	        		    
		 	finbgl.add(ram.returnsstring());
		 	TimeUnit.SECONDS.sleep(1);
		 x--;
		 	
	}
	
	BusDet.close();
	finDet.writeAll(finbgl);
	finDet.close();
	
	
	

	}}
