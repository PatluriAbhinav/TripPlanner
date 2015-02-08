package GTFS;
import java.io.*;
import java.util.*;

import au.com.bytecode.opencsv.*;


public class Arraangment {
	
	public static void main(String[] args) throws IOException{
		int x=0001;
		CSVReader read = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\PathRoutes.csv"));
		CSVWriter write= new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\StopTime.csv"));
		List<String[]> readlist= new ArrayList<String[]>();
		readlist= read.readAll();
 for(String row[]:readlist){
	 String trip_id="Hyd_".concat(String.valueOf(x));
	 
	 int k=1;
	 
	 int l=0;
	/* while( l!=(row.length)|| row[l].compareTo("")!=0 ){
		 System.out.println(row[l]+"-----"+row[l+1]);
		 l++;
		// System.out.println(l);
	 }*/
	 
	 for(int i=3;(i<row.length)&&(row[i].compareTo("")!=0);i++){
	String eachStop[]= new String[5];
	eachStop[0]=row[0];
	eachStop[1]="08:00";
	eachStop[2]="08:00";
	eachStop[3]=row[i];
	//System.out.println(eachStop[3]);
	eachStop[4]=String.valueOf(k);
	k++;
	
	
		write.writeNext(eachStop) ;
		
		 
	 }
	 System.out.println("Finished:"+x);
	 x++;
	 
 }
	 
		
		write.close();
		read.close();
	}

}
