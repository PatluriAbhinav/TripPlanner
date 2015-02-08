package editing;
import java.util.*;
import java.io.*;

import au.com.bytecode.opencsv.*;

public class Verifying {

	public static void main (String args[]) throws IOException{
		
		CSVReader read = new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//AllStops.csv"));
		CSVReader read1= new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//PathRoutes.csv"));
		CSVWriter write= new CSVWriter(new FileWriter("C://Users//AbhinavPatluri//Desktop//VerifyData.csv"));
		
		List<String[]> list= new ArrayList<String[]>();
		List<String[]> list1 = new ArrayList<String[]>();
		list= read.readAll();
		list1=read1.readAll();
		
		String writer[] = new String[1000];
		int x=0;
		
		
		for(String row[]:list){
			List<String[]> list3= new ArrayList<String[]>();
			list3=list1;
		for(String row1[]:list3){ int t=0;
			for(int i=0; i<row1.length;i++){
				//System.out.println(row1[i]);
				if(row1[i].compareTo(row[1])==0){
					System.out.println(row1[i]+"@@@@"+row[1]);
					try{
					if(row1[i+1].compareTo("")==0){
						writer[x]=row[0];
						x++;t=1;break;
						
					}}
					catch(Exception e){
						writer[x]= row[0];
						x++; t=1;break;
					}
					
				}
				
				
			}
		if(t==1){break;}
		}
		 
		 System.out.println(row[0]);
			
		}
		
		write.writeNext(writer);
		
		read.close();
		read1.close();
		write.close();
		
		
	}
	
}
