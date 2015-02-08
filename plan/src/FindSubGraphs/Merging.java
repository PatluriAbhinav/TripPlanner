package FindSubGraphs;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

import java.io.*;
import java.util.*;

public class Merging {
	public static void main(String []args) throws IOException{
		
		CSVReader read = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\HydPairs.csv"));
		CSVWriter write = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\HydData.csv"));
		
		
		List<String[]> small1 = new ArrayList<String[]>();
		List<String[]> small2 = new ArrayList<String[]>();
		small1=read.readAll();
		small2= small1;
		List<String[]> data = new ArrayList<String[]>();
		
		
		for(String first[]:small1){
			String rows[] = new String[100];
			int i=0;
			System.out.println(first[0]);
			rows[i]=first[0];
			i++;
			rows[i]=first[1];
			int x=0;
			while(x==0){if((rows[i].compareTo("123456"))!=0 && (rows[i].compareTo(""))!=0){
				System.out.println("enterd");
				 String str= rows[i];
						for(String second[]:small2){
							// System.out.println("---->"+rows[i]+second[0]);
								if(str.compareToIgnoreCase(second[0])==0){
										 System.out.println("@@@"+second[0]);
									for(int j= 0; j<second.length;j++){
											i++; rows[i]=second[j];
											 
										 }
											} }
		}
			else {x=50;}
		
		}
				write.writeNext(rows);	
		
	}

}}
