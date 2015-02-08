package Gujarat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.*;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

public class GSRTC {
String rows[]= new String[2000];
static int tray=1;
public GSRTC(String x, String y ,String pandu )throws IllegalStateException, IOException{
	
	String st= "http://www.gsrtc.in/GSRTCOnline/jqreq.do?hiddenAction=SearchServiceForHome";
	
	            
	HttpClient client = new DefaultHttpClient();
	HttpPost post = new HttpPost(st);
	CSVReader BusDet = new CSVReader(new FileReader(pandu));
	List<NameValuePair> list= new ArrayList<NameValuePair>();
	HttpParams httpParameters = new BasicHttpParams();
    HttpConnectionParams.setConnectionTimeout(httpParameters, 5000);

	String [] BusNum;
	while ((BusNum = BusDet.readNext()) != null) {
	
		
	list.add(new BasicNameValuePair(BusNum[0],BusNum[1]));
	}
	
	post.setEntity(new UrlEncodedFormEntity(list));

	HttpResponse response= client.execute(post);
	response.setParams(httpParameters);
	

	
	
	
	BufferedReader rd = new BufferedReader(
            new InputStreamReader(response.getEntity().getContent()));

StringBuffer result = new StringBuffer();
String line = "";
while ((line = rd.readLine()) != null) {
//System.out.println(line);
result.append(line);
}
String s="C:\\Users\\AbhinavPatluri\\Desktop\\Modi";
s=s.concat(String.valueOf(tray)).concat(".html");
System.out.println(s);
File f12= new File(s);
FileWriter fw = new FileWriter(f12.getAbsoluteFile());
BufferedWriter bw = new BufferedWriter(fw);
bw.write(result.toString());
bw.close();
rows[0]=x;
rows[1]="-->";
rows[2]=y;
rows[3]="--->";
System.out.println(x+y);


tray++;

Document doc = null;

File input = new File(s);
try {
	doc = Jsoup.parse(input, "UTF-8");
} catch (IOException e) {
	// TODO Auto-generated catch block
	System.out.println("No file found");
}
int z=4;
try{		
	Elements links = doc.getElementsByTag("div");
	for (Element link : links) {
		String linkText = link.text();
	 
	  rows[z]=linkText;
	  z++;
	  
	  }
}
catch(Exception e){System.out.println("No Adress found for:");

}
}	

public String[] returnsstring(){
	
	return rows;
	
	
}



}


