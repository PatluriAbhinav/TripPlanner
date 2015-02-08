package editing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Chennai.PCBN;
import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import java.util.*;

public class allstops {
public static void main(String[]args) throws IOException{

	CSVReader hydfile = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\Chennai.csv"));
	CSVWriter writefile = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\chennaiStops.csv"));
	List<String[]> hydfiles = new ArrayList<String[]>();
String [] BusNum;
	int x=0;
	
	while ((BusNum =hydfile.readNext()) != null) {
		System.out.println(BusNum[0]);
		if(x<(1000*800))
		{ //System.out.println(x);
			for(int i=3; i<100; i++)
			{ 
				String str[] = {"111"};
			   try{
				   if(BusNum[i].compareTo("")!=0){
				str[0]=	(String)BusNum[i];
			//	System.out.println(str[0]);
				}
			   else
			   { i=101;
				   
			   }}
			   catch (Exception e){System.out.println("Out of boundry");}
			   hydfiles.add(str);
			
			x++;
			}
		}
	
			
		
		  	
	
	}
	
	writefile.writeAll(hydfiles);  
	writefile.close();
	hydfile.close();
}


	
	
}
