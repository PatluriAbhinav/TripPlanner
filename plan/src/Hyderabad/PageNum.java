package Hyderabad;

import java.io.FileWriter;
import java.io.IOException;

import org.omg.CORBA.TIMEOUT;

import au.com.bytecode.opencsv.CSVWriter;

public class PageNum {
	public static void main(String args[]) throws IOException{
		CSVWriter HydNum= null;
		try { HydNum = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\HyderabadNumbers.csv"));
		}
		catch (Exception e){System.out.println("Nothing was found");}
		int x=1;
		int l=1001;
		for (int i=1; i<27; i++){
			String t=String.valueOf(x);
			//System.out.println("page-Num");
		GetBusNum bus = new GetBusNum(t,l);	
						
		HydNum.writeAll(bus.returndetails());
		//TIMEOUT
		l=bus.routenum();
		System.out.println(i);
		x++;
		}
		System.out.println("finished");
		HydNum.close();
		
	}

}
