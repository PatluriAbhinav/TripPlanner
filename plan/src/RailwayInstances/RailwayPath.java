package RailwayInstances;

 import java.io.*;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.*;
import org.apache.http.client.methods.*;
import org.apache.http.client.entity.*;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.util.*;

import org.apache.http.NameValuePair;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.*;
 

public class RailwayPath{
	
	public static void main(String args[])throws ClientProtocolException, IOException{
		String rows[]= new String[100];
		String Number="11060";
		HttpClient http = new DefaultHttpClient();
		HttpPost post = new HttpPost("http://www.indianrail.gov.in/cgi_bin/inet_trnnum_cgi.cgi");
		
		
		List<NameValuePair> lot = new ArrayList<NameValuePair>();
		lot.add(new BasicNameValuePair("lccp_trnname",Number));
		
		
		post.setEntity(new UrlEncodedFormEntity(lot));
		HttpResponse str= null;		
	try{	 str= http.execute(post);} catch(Exception e){System.out.println("Cant execute the post");}
		
		
		
		
		BufferedReader rd = new BufferedReader(
                new InputStreamReader(str.getEntity().getContent()));

StringBuffer result = new StringBuffer();
String line = "";
while ((line = rd.readLine()) != null) {
 System.out.println(line);
	result.append(line);
}



		File f12= new File("C:\\Users\\AbhinavPatluri\\Desktop\\bengaluru.html");
		FileWriter fw = new FileWriter(f12.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(result.toString());
		bw.close();
		
		rows[0]= Number;
		rows[1]= "--->";
		
		Document doc= null;
		try{
		 doc = (Document) Jsoup.parse(f12,"UTF-8");}
		catch (Exception e){System.out.println("Skipping this data");}
	int x=2;
try{		
		Elements links = (Elements) doc.getElementsByTag("td");
		 int l=0;
		 int z=0;
		
			for (Element link : links) {
		 
					String linkText = link.text();
					System.out.println(linkText);
					  if(linkText.compareTo("1")==0) l=50;
						
						if(l!=0){
							
							if(z==2){
								System.out.println(linkText);
							rows[x]=linkText;
							x++;}
						z++;
						if(z==8)z=0;
						}
										}
	}
		catch(Exception e){System.out.println("No Adress found for:"+Number);
		
		}
}	

		//public String[] returnsstring(){
			
			//return rows;
			
			
		//}
		
	}
	
	
