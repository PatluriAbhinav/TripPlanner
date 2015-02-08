package Hyderabad;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;






public class SendNum  {
	public static void main(String args[]) throws IOException, InterruptedException{
	
		List<String[]> HydFile = new ArrayList<String[]>();
		
		
	CSVReader HydNum = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\HyderabadNumbers1.csv"));
	
	CSVWriter HydPath= new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\finalpathdata.csv"));
	
		int x=1002;
	
	String [] BusNum;
	
	
	while ((BusNum = HydNum.readNext()) != null) {
		System.out.println(x);
	
		 	Parsepath ram = new Parsepath(BusNum[1]);
		 	HydFile.add(ram.returnsstring());
		 	//TimeUnit.SECONDS.sleep(1);
		 	x--;
		 	
		 	
	
	}
	
	HydNum.close();
	HydPath.writeAll(HydFile);
	HydPath.close();
	
	
	

	}}
