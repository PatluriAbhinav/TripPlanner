package BlockAlgo;
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

import au.com.bytecode.opencsv.*;
public class Main {

	public static void main(String args[]) throws IOException{
		
		CSVReader read1 = new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//BangStop.csv"));
		List<String[]> list1= new ArrayList<String[]>();
		list1= read1.readAll();
		 Set<Integer> set= new HashSet<Integer>();
		 
		
		for(String row[]:list1){set.add((int)Integer.valueOf(row[0]));}
	
		MakingList make = new MakingList();
		List<int[]> finlist= make.returnMap();
	
		MyList<int[]> mine = new MyList<int[]>(finlist);
		
		call pk= new call(set, mine);
		
		
		read1.close();
		
	
		//List<int[]> hello= mine.getcolumn(5);
		//List<int[]> fuck=mine.alter(hello, +1);
	   
		//System.out.println(mine.dead(fuck));
		//System.out.println(mine.getnext(fuck));
		
	}
}
