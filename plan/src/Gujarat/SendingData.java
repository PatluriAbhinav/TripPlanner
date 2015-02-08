package Gujarat;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

public class SendingData {
	static int flip= 1;
	public static void main(String[] args) throws IOException, InterruptedException{
	CSVReader Buses= null;
		
	try{Buses = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\gujarath.csv"));}
	catch (Exception e){System.out.println("Cant read from gujarathFile");}

	CSVReader Change= null;
	try{Change = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\guja.csv"));}
	catch (Exception e){System.out.println(" file was not found");}
	
	List<String[]> sample= new ArrayList<String[]>();
	sample=Change.readAll();
	
	CSVWriter writ = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\finalguj.csv"));
	
	List<String[]> detail1= new ArrayList<String[]>();
	List<String[]> detail2= new ArrayList<String[]>();
	List<String[]> finaldet= new ArrayList<String[]>();

	detail1=Buses.readAll();
	detail2=detail1;
	
	for(int i=0; i<detail1.size();i++){
		String source[]= detail1.get(i);
			for(int j= 0; j<detail2.size();j++){
				String []dest= detail2.get(j);
					if((source[0].compareTo(dest[0]))!=0){
						System.out.println(source[0]+"-"+source[1]+ "-"+source[2] +"---->" +dest[0]+"-"+dest[1]+"--"+dest[2]);
						List<String[]> data = new ArrayList<String[]>();
						
						for(int l=0; l<sample.size();l++){
							String fin[] = new String[2];
							String sam[]= sample.get(l);
							fin[0]= sam[0];
							if(l==0)							fin[1]=source[2];
							else if(l==1) fin[1]=dest[2];
							else if(l==2) fin[1]=source[1];
							else if(l==3) fin[1]=dest[1];
							else if(l==4) fin[1]=source[0];
							else if(l==5) fin[1]=dest[0];
							else if(l==6) fin[1]=source[2];
							else if(l==7) fin[1]=dest[2];
							else if(l==20)fin[1]=source[1];
							else if(l==21)fin[1]=dest[1];
							else fin[1]=sam[1];
							data.add(fin);}
			
						String pandu="C:\\Users\\AbhinavPatluri\\Desktop\\datawriter".concat(String.valueOf(flip)).concat(".csv");
						CSVWriter datawriter = new CSVWriter(new FileWriter(	pandu	));
						flip++;
						datawriter.writeAll(data);
						datawriter.close();
			try{
		GSRTC gsr = new GSRTC(source[1],dest[1],pandu);
		System.out.println(source[1]+dest[1]);
		writ.writeNext(gsr.returnsstring());
		
	
				}
					catch(Exception e){
						System.out.println("waiting for 2 mins");
						TimeUnit.MINUTES.sleep(2);
						String string[]= {source[1],"--->",dest[1],"--->",source[0],"--->",dest[0]};
						System.out.println("You have an Exception: ");
						writ.writeNext(string);
						
					}	
				}
				
			}
			
			
		System.out.println("Finished"+source[1]);	
		}
	
	
	writ.close();
	}

}
