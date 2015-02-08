package Hyderabad;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

public class Route {
	
	
	public static void main(String args[]) throws IOException{
		
		CSVReader stops = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\Stops.csv"));
		CSVReader paths = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\Hyderabadreading.csv"));
		CSVWriter write = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\route.csv"));
		 
		
		List<String[]> route = new ArrayList<String[]>();
		String Stops[];
		int t=0;
		
		while ((Stops = stops.readNext()) != null) {
			String str[]= new String[1000];
			str[0]=Stops[0];
			int z=2;
			System.out.println(Stops[0]);
		   
			  String pathnum[]=new String[1000];
			  for(int k=0; k<1000;k++){
				  pathnum[k]="tt";
				  
			  }
			//  System.out.println(pathnum=paths.);
		    CSVReader path1=paths;
		 		while((pathnum=paths.readNext())!= null){
		 			System.out.println(t);
		 			int i;
		 			for(i=4; i<=40;i++){
		 				//.out.println(i);
		 				//System.out.println(Stops[0].compareTo("12, Road, Jubilee Enclave"));
		 					if((Stops[0].compareTo(pathnum[i]))==0){
		 						str[z]=pathnum[0];
		 						z++;
		 						i=45;
		 						
		 														}}}
		 		paths=path1;
		 					route.add(str);}
		
		write.writeAll(route);	
		write.close();
		stops.close();
		paths.close();
		
		}
		
		
	}


