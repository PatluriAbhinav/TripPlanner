package RailwayInstances;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.client.methods.*;
import javax.servlet.http.*;


public class Parsing {

	Parsing(String trainNum){
		HttpClient http= new DefaultHttpClient();
		HttpPost post = new HttpPost("http://enquiry.indianrail.gov.in/ntes/");
		
		List<NameValuePair> lot = new ArrayList<NameValuePair>();
		lot.add(new BasicNameValuePair("trainNo", trainNum));
		
		try {post.setEntity(new UrlEncodedFormEntity(lot));}
		catch (Exception e){System.out.println("nnn");}
		HttpResponse str= null;
		try{	 str= http.execute(post);
				
		} catch(Exception e){System.out.println("Cant execute the post");}	
		
	
		
		System.out.println("mjfio"+str.getHeaders("location"));
		for(Header header : str.getHeaders("Request URL")) {
			//  System.out.println("Location from connect:" + header.getValue());
			}
		
		
		
		
	
		
	}
	
	
}
