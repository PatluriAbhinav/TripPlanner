package FindSubGraphs;

import java.io.*;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.TIMEOUT;

public class SubGraph {

	public static void main(String args[]) throws IOException, InterruptedException{
		
		CSVReader Stop = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\Stops.csv"));
		CSVReader Search = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\PathRoutes.csv"));
		CSVWriter write = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\HydPairs.csv"));
		
		List<String[]> stops= new ArrayList<String[]>();
		stops=Stop.readAll();
		List<String[]> search= new ArrayList<String[]>();
		search=Search.readAll();
		List<String[]> data= new ArrayList<String[]>();
		
		
		for(String name[]:stops){
			
			String k= null;
			int t=0;
		    int x=0;
		//	System.out.println(name[0]);
			
			for(String route[]:search){
				//System.out.println(name[0]+"@@@"+route[3]);
				for(int i =3;i<(route.length);i++){
					try{if((route[i].compareToIgnoreCase(name[0])==0)&& x==0 ){
						k = route[i+1];
						x=50;
					}
					if((route[i].compareToIgnoreCase(name[0])==0)&& x!=0 ){
						
						if(k.compareToIgnoreCase(route[i+1])==0){
						//System.out.println("yes");
						}
						else { t=50;/*System.out.println("NO");*/}
					}
				}
			
				catch(Exception e){System.out.println();}
				}
				
			}
			if(t==0){
				String rows[]= new String[2];
				rows[0]=name[0];
				rows[1]=k;
				System.out.println(rows[0]+","+rows[1]);
				
				data.add(rows);
				 TimeUnit.MICROSECONDS.sleep(100);
				//write.writeNext(rows);
			}
			else{
				String rows[]= new String[2];
				rows[0]=name[0];
				rows[1]="123456";
			    System.out.println(rows[0]+","+rows[1]);
			   
				data.add(rows);
			    TimeUnit.MICROSECONDS.sleep(100);
			    //write.writeNext(rows);
				}
		
			
		}
		
		
		write.writeAll(data);
		write.close();
		Stop.close();
		Search.close();
		
	}
}
