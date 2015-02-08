package editing;

import java.io.*;
import java.util.*;

import au.com.bytecode.opencsv.*;

public class Set {

	public static void main(String[] args) throws IOException, InterruptedException{
		
		CSVReader file1 = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\HyderabadHubs.csv"));
		CSVReader file2 = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\Paths.csv"));
		CSVWriter file3= new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\FinalFile.csv"));
		
		List<String[]> list1= new ArrayList<String[]>();
		
		List<String[]> list3= new ArrayList<String[]>();
		List<String[]> list4= new ArrayList<String[]>();
		List<String[]> list5 = new ArrayList<String[]>();
		HashSet<String> has = new HashSet<String>();
		list3= file2.readAll();
		
		list1= file1.readAll();
		list4= list1;
		list5= list4;
		for(String rows[]:list5){
			has.add(rows[1]);
			
			
		}
		
		
		
		String row10[] = new String[50];
		row10[1]="Sangeeth";
			for(String row11[] :list4){
				String row[] = new String[500];
				row[0]=row10[1];
				row[1]=row11[1];
				
				if(row10[1].compareToIgnoreCase(row11[1])!=0){
					System.out.println("first"+row[0]+"Second:"+row[1]);
					List<String[]> list2= new ArrayList<String[]>();
					list2= list3;
					int x=5;
					int t=500;
					
					for(String row2[] :list2){
						//System.out.println(row2[1]+"<----->");
					
					for(int i=3;i <row2.length;i++ ){
							
							if((row11[1].compareTo(row2[i])==0) || (row10[1].compareTo(row2[i])==0)){
								System.out.println(row2[i]+"@@@@@"+row11[1]+"####"+row10[1]);
								System.out.println(row2[1]+"$$$$$$$$$$$$$$$$$$$$");
								String array[]= new String[100];
								i++;
					for( ;i <row2.length; i++){
					
					if(has.contains(row2[i])){
						if((row2[i-1].compareTo(row11[1])!=0) && (row2[i-1].compareTo(row10[1])!=0)){
					
						System.out.println("Pk not talking to me :(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(");
						break;}}          
					
					if((row11[1].compareTo(row2[i])==0)|| (row10[1].compareTo(row2[i])==0)){
										System.out.println(row2[0]);
										row[x]=row2[0];
										x++; 
										t=0;
										break;}}}}}
					
					if(t==0){file3.writeNext(row);}}}
		
		
		file1.close();
		file2.close();
		file3.close();
		
		
	}
}
