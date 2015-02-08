package Chennai;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;






public class SCBN  {
	public static void main(String args[]) throws IOException, InterruptedException{
	
		List<String[]> cheFile = new ArrayList<String[]>();
		
		
	CSVReader chenBus = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\CBN.csv"));
	
	CSVWriter finChen= new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\FCBN.csv"));
	
		int x=802;
	
	String [] BusNum;
	
	
	while ((BusNum = chenBus.readNext()) != null) {
		System.out.println(x);
	
		 	PCBN ram = new PCBN(BusNum[0]);
		 	cheFile.add(ram.returnsstring());
		 //	TimeUnit.SECONDS.sleep(2);
		 	x--;
		 	
		 	
	
	}
	
	chenBus.close();
	finChen.writeAll(cheFile);
	finChen.close();
	
	
	

	}}
