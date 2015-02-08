package editing;

import java.util.*;
import java.io.*;
import au.com.bytecode.opencsv.*;
public class makematrix {

	public static void main(String args[])throws IOException {
		
		CSVReader read = new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//SequenceMatrix.csv"));
		CSVWriter write= new CSVWriter(new FileWriter("C://Users//AbhinavPatluri//Desktop//BangMatrix.csv"));
		
		List<String[]> string = new ArrayList<String[]>();
		string= read.readAll();
		for(String str[]:string){
			for(int i=0; i< str.length;i++){
				if(str[i].compareToIgnoreCase("")==0){
					str[i]="0";
					
				}
				
				
				
			}
			write.writeNext(str);
			System.out.println(str[0]);
		}
		read.close();
		write.close();
	}
}
