package ahtsaa;

import au.com.bytecode.opencsv.*;
import java.io.*;
import java.util.*;

public class Plan1{
	
	public static void main(String args[]) throws IOException{
CSVReader data = new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//data.csv"));
CSVReader tuples = new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//def.csv"));
CSVWriter write = new CSVWriter(new FileWriter("C://Users//AbhinavPatluri//Desktop//final1.csv"));
List<String[]> dat= new ArrayList<String[]>();
List<String[]> tup= new ArrayList<String[]>();
dat= data.readAll();
tup= tuples.readAll();

int y=1;
for(String[] str: tup){
	System.out.println(y); y++;
	List<String[]> dat1= new ArrayList<String[]>();
	dat1= dat;
	int x=1;
	for(String[] str1 : dat1){
		if(str[1].compareTo(str1[1])==0){
			
			if(str[2].compareTo(str1[2])==0){
				String[] string = new String[7];
				string[0]=String.valueOf(x);
				string[1]=str1[1];
				string[2]=str1[2];
				string[3]=str1[3];
				string[4]=str1[4];
				string[5]=str[3];
				string[0]= str1[0];
				x++;
				write.writeNext(string);
			}
			
		}
		
	}
	
	
}


write.close();
data.close();
tuples.close();


	}

	

}
