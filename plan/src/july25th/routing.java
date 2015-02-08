package july25th;


import au.com.bytecode.opencsv.*;
import java.io.*;
import java.util.*;

public class routing {

	
	public static void main(String args[]) throws IOException{
		CSVReader read= new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//afzal.csv"));
		CSVWriter write = new CSVWriter(new FileWriter("C://Users//AbhinavPatluri//Desktop//ram.csv"));
		
		List<String[]> reading= new ArrayList<String[]>();
		reading =read.readAll();
		
		for(String[] str : reading){
				String string = new String();
				int x=0;
		 for(int i =0; i<str.length;i++){
			 
			 
			 if(str[i].compareTo("Afzalgunj Bus Stop")==0)
			 {
				 for(int j=i;j>=0;j--){
					 string=str[j].concat("Bus Stop,Hyderabad");
					 System.out.println(string);
					 write.writeNext(string);
				 }
				 for(int k=0;k<=i;k++){
					 string=str[k].concat("Bus Stop,Hyderabad");
					 System.out.println(string);
					 write.writeNext(string);
				 }
				x=1; 
			 }
			 
			 else if(str[i].compareTo("")==0|| (i==(str.length-1))){
				 for(int j=(i);j>=0;j--){
					 if(str[j].compareTo("Afzalgunj Bus Stop")==0){
						 string=str[j].concat("Bus Stop,Hyderabad");
						 System.out.println(string);
						 break;}
					 string=str[j].concat("Bus Stop,Hyderabad");
					 System.out.println(string);
					 write.writeNext(string); 
				 }
				 break;
				 }
				
				 if(x!=0){ 
					 string=str[i].concat("Bus Stop,Hyderabad");
				 System.out.println(string);
				 write.writeNext(string);}
				 
			 }System.out.println(x);
			 x++;
			 
		 }
			
			
		
		
		
		
		read.close();
		write.close();
		
	}
}
