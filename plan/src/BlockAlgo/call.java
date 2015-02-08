package BlockAlgo;
import java.util.*;
import java.io.*;
import au.com.bytecode.opencsv.*;
public class call {
Set<Integer> s;
MyList<int[]> mylist;
	public call(Set<Integer> s, MyList<int[]> mylist) throws IOException{
	
		this.mylist=mylist;
	this.s=s;
		CSVWriter write= new CSVWriter(new FileWriter("C://Users//Abhinavpatluri//Desktop//Blocks.csv"));
		while(!(s.isEmpty())){
			for(int str : s){
		
		Stop x= new Stop(str,mylist,s);
		String t= x.getblock();
		System.out.println(t);
		excess ex= new excess(s,t);
		s=ex.newset();
		write.writeNext(ex.csvrow());
		System.out.println(s.size());
		break;
	
	}
			}
	
	
	write.close();
		
	}
}
