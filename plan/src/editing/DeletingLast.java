package editing;

import java.util.*;
import java.io.*;

import au.com.bytecode.opencsv.*;
public class DeletingLast {

	public static void main (String args[]) throws IOException {
		CSVReader read = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\BangFinal.csv"));
		CSVWriter write = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\FinalBanglore.csv"));
		 List<String[]> str = new ArrayList<String []>();
		 str= read.readAll();
		 
		 
		 for(String each[]: str){
			String finstring[] = new String[50]; 
		int x=0;
		for(int i=0; i<each.length;i++){
			if(each[i].compareTo("")==0){break;}
			x++;
			
		}
		
		System.out.println(x);
		if(each[x-1].compareTo("123456")==0 && x>3){
			for(int j =0 ; j<x-2;j++){
				finstring[j]=each[j];
			}}
			else {
				
				for(int j =0 ; j<x;j++){
					finstring[j]=each[j];
				}
			
		}
		
		write.writeNext(finstring);
		
		 }
		
		read.close();
		write.close();
		 
	}
}
