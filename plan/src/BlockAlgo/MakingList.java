package BlockAlgo;
import au.com.bytecode.opencsv.*;
import java.util.*;
import java.io.*;

public class MakingList {
List<int[]> finlist= new ArrayList<int[]>();
	public MakingList() throws IOException{
	CSVReader read2= new CSVReader(new FileReader("C://Users//AbhinavPatluri//Desktop//BangMatrix.csv"));


List<String[]> list= new ArrayList<String[]>();
List<List<String>> matlist= new ArrayList<List<String>>();
list= read2.readAll();
int t=0;
for(String[] arr:list){
	
	if(t!=0){
	matlist.add(Arrays.asList(arr) );
	}
	t++;
	
	
}
int x=1;
for(List<String> ram :matlist){
	int y=1;
	int z=0;
	for(String sita :ram){
		if(z!=0){
			int in[]={x,y,(int)Integer.valueOf(sita)};
	
	 finlist.add(in);
		y++;}
		z++;
		
	}
	x++;
}

	
	read2.close();

	
}
	
	public List<int[]> returnMap(){
	return finlist;
	}
	
	
}
