
package Maps;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.*;
import org.json.simple.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;
import java.net.URL;



public class Parsing {
	String [] rows= new String[3];
	public Parsing(String name) throws IllegalStateException, IOException{
		
		String url= "http://maps.google.com/maps/api/geocode/json?address=";
		url=url.concat(name);
		//url=url.concat(" Bus Stop");
		url=url.concat(",hyderabad,Telangana");
		url= url.concat("&sensor=false");
System.out.println(url);
url= url.replace(" ","%20");

BufferedReader reader = null;

    URL ur = new URL(url);
    reader = new BufferedReader(new InputStreamReader(ur.openStream()));
    StringBuffer buffer = new StringBuffer();
    int read;
    char[] chars = new char[1024];
    while ((read = reader.read(chars)) != -1)
        buffer.append(chars, 0, read); 

    BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\ram.json"));
writer.write(buffer.toString());
writer.close();
	
	
		rows[0]=name;
		JSONParser pars= new JSONParser();
		
		Object ob= null;
		try{
			ob = pars.parse(new FileReader("C:\\Users\\AbhinavPatluri\\Desktop\\ram.json"));
		}
		catch (Exception e){System.out.println("No file found");}
		JSONObject obj= (JSONObject) ob;
		
		JSONArray arr = (JSONArray) obj.get("results");
		JSONObject innerObj = (JSONObject) arr.get(0);
	JSONObject locate=(JSONObject) innerObj.get("geometry");
	JSONObject location=(JSONObject) locate.get("location");
	
	rows[1]=String.valueOf(location.get("lat"));
	rows[2]=String.valueOf(location.get("lng"));
	System.out.println(rows[0]);
	System.out.println(rows[1]);
	System.out.println(rows[2]);	
	}			
	
	public String[] getlatlon() {
		return rows;
		
	}
}
