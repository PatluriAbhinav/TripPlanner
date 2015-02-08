package Gujarat;
import java.util.*;
import java.io.*;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import au.com.bytecode.opencsv.CSVReader;

public class BusIndia {
	
	public static void main(String args[]) throws IOException{
		
		HttpClient http= new DefaultHttpClient();
		HttpPost post = new HttpPost("http://www.busindia.com/busindia2/busBooking_Availability");
		List<NameValuePair> lot = new ArrayList<NameValuePair>();
		CSVReader BusDet = new CSVReader(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\busindia.csv"));
		String [] BusNum;
		while ((BusNum = BusDet.readNext()) != null) {
		int x=0;
		String ring[]= new String[2];
			StringTokenizer str = new StringTokenizer(BusNum[0],"=");
			while(str.hasMoreTokens()){
				ring[x]=String.valueOf(str.nextElement());
				//System.out.println(ring[x]);
				x++;
				
			}
			if(x==1){ring[x]="";}
			
		lot.add(new BasicNameValuePair(ring[0],ring[1]));
		}
		
		post.setEntity(new UrlEncodedFormEntity(lot));
		HttpResponse res= http.execute(post);
		
		BufferedReader rd = new BufferedReader(
	            new InputStreamReader(res.getEntity().getContent()));

	StringBuffer result = new StringBuffer();
	String line = "";
	while ((line = rd.readLine()) != null) {
	System.out.println(line);
	result.append(line);
	}
		
		
		}
		
		
	
}
