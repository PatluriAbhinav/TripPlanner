package RailwayInstances;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;






public class RailwayNum {
	public static void main(String args[]) throws IOException, InterruptedException{
	
		List<String[]> finbgl = new ArrayList<String[]>();
		
		
	CSVReader BusDet = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\TrainNum.csv"));
	
	CSVWriter finDet = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\TrainPath.csv"));
	 int x=94;
		
	//
	
	String [] BusNum;
	
	
	while ((BusNum = BusDet.readNext()) != null) {
			//System.out.println(x);
			//System.out.println(BusNum[1]);
		 	RailwayPath ram = new RailwayPath(BusNum[0]);	        		    
		 	finbgl.add(ram.returnsstring());
		 	TimeUnit.SECONDS.sleep(3);
		 	x--;
		 	
	}
	
	BusDet.close();
	finDet.writeAll(finbgl);
	finDet.close();
	
	
	

	}}
