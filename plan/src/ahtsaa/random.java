package ahtsaa;

import au.com.bytecode.opencsv.*;
import java.io.*;
import java.util.*;
public class random {

	public static void main(String args[]) throws IOException{
		
		
		CSVReader read1= new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//final1.csv"));
		CSVWriter write= new CSVWriter(new FileWriter("C://Users//AbhinavPatluri//Desktop//finall1.csv"));
		List<String[]> list1 = new ArrayList<String[]>();
		List<String[]> list2 = new ArrayList<String[]>();
		list1= read1.readAll();
		list2= list1;
		
		String str1="";
		String str2="";
		String str3="";
		String str4="";
		int x=1;
		for(String[] str: list1){
			String string[] = new String[8];
			if(str[1].compareTo(str1)!=0 && str[2].compareTo(str2)!=0){
				
				str1=str[1];
				str2=str[2];
				str3=str[3];
				str4=str[4];
				
			}	
				
			else{
				
				string[0]= str[0];
				string[1]=str[1];
				string[2]=str[2];
				string[3]=str3;
				string[4]=str4;
				
				string[5]=str[3];
				string[6]=str[4];
				string[7]=str[5];
				
				str3=str[3];
				str4= str[4];
				write.writeNext(string);
			}
		System.out.println(x);x++;	
		}
	
	read1.close();
	write.close();
	}
		
		
	
}
