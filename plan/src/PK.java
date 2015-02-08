import org.jsoup.*;
import au.com.bytecode.opencsv.CSVReader;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class PK {
	public static void  main(String args[]) throws Exception {
		
		String k="";
		try {
			CSVReader hydfile = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\pk.csv"));
			 String [] nextLine;
			    while ((nextLine = hydfile.readNext()) != null) {
			        // nextLine[] is an array of values from the line
			        System.out.println(nextLine[0]+nextLine[1]+ "etc...");
			        String l=nextLine[0];
			        l=l.concat(nextLine[1]);
			       if((k.compareTo(l)!=0)){
			        Download dwnld= new Download(l);}
			        try {
					    TimeUnit.SECONDS.sleep(2);
					} catch(InterruptedException ex) {
					    Thread.currentThread().interrupt();
					}
			        k=(String)l;
			    }
		 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			e.printStackTrace();
		}
		
		
		
		
	}

}
