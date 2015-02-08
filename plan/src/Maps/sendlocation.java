package Maps;

import au.com.bytecode.opencsv.CSVReader;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;

import au.com.bytecode.opencsv.CSVWriter;

public class sendlocation {

	public static void main (String[] args) throws IOException, IllegalStateException, ParseException, InterruptedException{
		
		CSVReader read= new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\metrostations.csv"));
		CSVWriter write = new CSVWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\MetroCordinates.csv"));
		
		List<String[]> data = new ArrayList<String[]>();
		
		String stop[];
		while((stop=read.readNext())!= null){
			System.out.println(stop[0]);
			Parsing fin = new Parsing(stop[0]);
			write.writeNext(fin.getlatlon());
			TimeUnit.SECONDS.sleep(2);
			
		}
read.close();
write.close();
	
	}

}
