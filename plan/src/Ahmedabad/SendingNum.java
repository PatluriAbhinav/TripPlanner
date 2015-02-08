package Ahmedabad;

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
 

public class SendingNum{
	String rows[]= new String[100];
	public SendingNum() throws ClientProtocolException, IOException{

		HttpClient http = new DefaultHttpClient();
		HttpPost post = new HttpPost("http://gmail.com/index.php?option=com_docman&task=license_result&gid=3933&bid=3933&Itemid=429");
		
		List<NameValuePair> lot = new ArrayList<NameValuePair>();
		lot.add(new BasicNameValuePair("option","com_docman"));
		lot.add(new BasicNameValuePair("task","license_result"));
		lot.add(new BasicNameValuePair("gid","3933"));
		lot.add(new BasicNameValuePair("bid","3933"));
		lot.add(new BasicNameValuePair("Itemid","429"));
		
		
		post.setEntity(new UrlEncodedFormEntity(lot));
		HttpResponse str= null;	
	
        
		try{ str= http.execute(post);
		
		InputStream in = str.getEntity().getContent();
		
		
		OutputStream outputStream = new FileOutputStream(new File("C:\\Users\\AbhinavPatluri\\Desktop\\Excelsheet.csv"));
 
		int read = 0;
		byte[] bytes = new byte[1024];
 
		while ((read = in.read(bytes)) != -1) {
			outputStream.write(bytes, 0, read);
		}
 
		
		
		} catch(Exception e){
		
e.printStackTrace();
		 }
		
	

		
	}	}
	
	
