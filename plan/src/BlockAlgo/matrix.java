package BlockAlgo;
import java.util.*;
import java.io.*;

import au.com.bytecode.opencsv.*;
import editing.GetNum;

public class matrix {

	public static void main(String args[]) throws IOException{
		
		CSVReader read1= new CSVReader(new FileReader("C://Users//Abhinavpatluri//Desktop//BangPathRoutes.csv"));
		CSVReader read2= new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//BangStop.csv"));
		CSVWriter write1 = new CSVWriter(new FileWriter("C://Users//AbhinavPatluri//Desktop//SequenceMatrix.csv"));
		List<String[]> list1= new ArrayList<String[]>();
		List<String[]> list2= new ArrayList<String[]>();
		
		list2= read2.readAll();
		String horiz[]= new String[4000];
		int t=1;
		for(String hori[]: list2){
			System.out.println(hori[1]);
			horiz[t]= hori[1];
			t++;
		}
		write1.writeNext(horiz);
		
		list1= read1.readAll();
		for(String row[]: list1){
			String nayarow[]= new String[3273];
			nayarow[0]= row[0];
			int x=1;
			for(int i=3;i<row.length;i++){
				if(row[i].compareTo("")!=0){
					
					GetNum get= new GetNum(row[i]);
					nayarow[Integer.valueOf(get.returnNum())]=String.valueOf(x);
					x++;
				}
				
			}
			
			write1.writeNext(nayarow);
			System.out.println("Finished:"+row[0]);
		}
		
		
		read1.close();
		write1.close();
	}
	
}
