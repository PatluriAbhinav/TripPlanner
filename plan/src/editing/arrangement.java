package editing;
import java.util.*;
import java.io.*;
import au.com.bytecode.opencsv.*;
public class arrangement {
	
	public static void main(String args[])throws IOException{
		
		CSVReader read = new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//Blocks.csv"));
		CSVWriter write= new CSVWriter(new FileWriter("C://Users//AbhinavPatluri//Desktop//Bangfinal.csv"));
		
		List<String[]> list = new ArrayList<String[]>();
		list= read.readAll();
		int p=0;
		for(String row[]:list){
		String str[]= new String[120];
			int t=0;	
		
			for(int i=0;i<row.length;i++){
				if(row[i].compareTo("")!=0){
				t++;	
					
				}
				str[i+1]=row[i];
			}
			str[0]=String.valueOf(t);
		write.writeNext(str);
		System.out.println(p);
		p++;
		}
		read.close();
		write.close();
	}

}
