

import java.io.*;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.jsoup.examples.*;
import org.jsoup.nodes.*;






public class ReadHtml {

	ReadHtml(){
		try{
	File input = new File("C:/Users/AbhinavPatluri/Desktop/HyderabadBuses/2c.html");
	
	Document doc= Jsoup.parse(input, "UTF-8");
	
	Elements links= doc.select();
	
		
		}
		catch(IOException e) {System.out.println("Its an IoException. FIle not Found.");}
	
	}}
