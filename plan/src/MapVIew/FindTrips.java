package MapVIew;

import au.com.bytecode.opencsv.*;
import java.util.*;
import java.io.*;

public class FindTrips {

	public static void main(String args[]) throws IOException{
		CSVReader read1= new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//AllStops.csv"));
			CSVReader read2= new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//PathRoutes.csv"));
				CSVWriter  write= new CSVWriter(new FileWriter("C://Users//AbhinavPatluri//Desktop//TripHeight.csv"));
					
					List<String[]> list1 = new ArrayList<String[]>();
					List<String[]> list2 = new ArrayList<String[]>();
					List<String[]> list3 = new ArrayList<String[]>();
					
					
					list1= read1.readAll();
					list2= read2.readAll();
					list3=list1;
					
					for(String[] row1:list1){
						
						
						List<String[]> ram= new ArrayList<String[]>();
						ram= list3;
						
						for(String[] row2:ram){
							if(row1[0].compareTo(row2[0])!=0){
							String str[]= new String[3];	
							List<String[]> seeta = new ArrayList<String[]>();
							seeta=list2;
							int x=0;
							for(String red[]:seeta){
								
								for(int i=3;i<(red.length-1);i++){
									
									if(red[i].compareTo(row1[0])==0 || red[i].compareTo(row2[0])==0){
										if(red[i+1].compareTo(row1[0])==0 || red[i+1].compareTo(row2[0])==0){
											
									x++;		
										}}}}
							str[0]=row1[0];
							str[1]= row2[0];
							str[2]=String.valueOf(x);
							write.writeNext(str);	
							System.out.println(row1[0]+" @@@@@ "+row2[0]+"$$$$$"+x);
						}}
						
						
					}
					
					
					
					read1.close();
					read2.close();
					write.close();
					
	}
	
	
}
