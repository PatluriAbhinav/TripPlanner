package editing;
import java.util.*;
import java.io.*;

import au.com.bytecode.opencsv.*;

public class verifying1 {

	public static void main (String args[]) throws IOException{
		
		CSVReader read = new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//AllStops.csv"));
		CSVReader read1= new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//PathRoutes.csv"));
		CSVWriter write= new CSVWriter(new FileWriter("C://Users//AbhinavPatluri//Desktop//VerifyData1.csv"));
		
		List<String[]> list= new ArrayList<String[]>();
		List<String[]> list1 = new ArrayList<String[]>();
		list= read.readAll();
		list1=read1.readAll();
		
		
		for(String row[]:list){
			List<String[]> list3= new ArrayList<String[]>();
			list3=list1;
			String[] str= new String[1000];
			str[0]=row[0];
			str[1]="--->";
			int x=2;
			System.out.println("Stop:::"+row[1]);
		for(String row1[]:list3){ 
		   
			for(int i=3; i< row1.length;i++){
			
				if(row1[i].compareTo(row[1])==0){
			//		System.out.println(row1[i]+"trtrtrt"+row1[i+1]);
				try{if(row1[i+1].compareTo("")!=0){	GetNum get= new GetNum(row1[i+1]);
					System.out.println(get.returnNum()+"@@");
					if()
					str[x]=get.returnNum();
					x++;}}
				catch(Exception e){System.out.println("");}
				}
		}
		}
		write.writeNext(str);
		System.out.println(row[0]);
		
		}
		
		
		
		read.close();
		read1.close();
		write.close();
		
		
	}
	
}
