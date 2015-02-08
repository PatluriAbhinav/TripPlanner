package Hyderabad;

import java.util.*;
import java.io.*;

import au.com.bytecode.opencsv.*;
public class AdjacencyMatrix {
	
	public static void main(String arts[]) throws IOException{
		CSVReader read = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\AllStops.csv"));
		CSVReader read1= new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\PathRoutes.csv"));
		CSVWriter Write= new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\AdjacencyMatrix.csv"));
		List<String[]> StopList1= new ArrayList<String[]>();
		List<String[]> StopList2= new ArrayList<String[]>();
		List<String[]> StopList3= new ArrayList<String[]>();
		List<String[]> PathList1= new ArrayList<String[]>();
		PathList1=read1.readAll();
		
		StopList1= read.readAll();
		StopList2= StopList1;
		StopList3= StopList1;
		String[] stoplist= new String[860];
		int t=0;
		for(String[] allstops : StopList3){
			stoplist[t]=allstops[0];
			t++;
		}
		
		Write.writeNext(stoplist);
		int l=860;
		
		for(String[] row :StopList1){
			String[] Adjacecny= new String[860];
			int z=0;
		for(String[] column:StopList2){
			
			List<String[]> PathList2= new ArrayList<String[]>();
			PathList2=PathList1;
			int p=0;
			for(String[] connect:PathList2){
				int x=0;int y=0;
				
				for(int i=3;i<connect.length;i++){
					if(connect[i].compareToIgnoreCase(row[0])==0){x=1;}
					if(connect[i].compareToIgnoreCase(column[0])==0){y=1;}
					
					
				}
				
				if(x==1 && y==1){Adjacecny[z]="1";p=1;
				break;}
					
				}
			if(p==0){Adjacecny[z]="0";}
			//System.out.println("FInished:"+row[0]+"@@@@"+column[0]+"------>"+z);
			z++;
		}
		
		Write.writeNext(Adjacecny);
		System.out.println(l);
		l--;
			
		}
		
		
		
		
	read.close();
	read1.close();
	Write.close();
	
		
	}
}
