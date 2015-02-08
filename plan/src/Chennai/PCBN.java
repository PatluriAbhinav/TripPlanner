package Chennai;



import org.jsoup.select.Elements;
import org.jsoup.nodes.*;
//import org.w3c.dom.Document;
import org.jsoup.Jsoup;


import java.io.*;



public class PCBN{
	
	String[] rows= new String[100];
	
	public  PCBN(String var) throws InterruptedException{
		String s="http://busroutes.in/chennai/route/";
		
		int y=0;
		String arr[]={"AC","Dlx"};
		for(int i=0;i<2;i++){
		try{
			var= var.substring(0, var.indexOf(arr[i]));
			
			break;
			}
		catch (Exception e){y++;}
		
		                    }
		
		
		
		if(y==0){String t="w";
		var=t.concat(var);
		}
		else if(y==1){String t="s";
		var=t.concat(var);
		}
		
		//System.out.println(var);
		
		
		if(var.contains("EXT")){
			var= var.replace(" EXT", "ex");
			
		}
		else if(var.contains("CUT")){
			var= var.replace(" CUT", "cu");
			
		}
		s=s.concat(var);
		rows[0]= var;
		rows[1]= "--->";
		
		
		
		Document doc = null;
		
		System.out.println(s);
		try {
			doc = Jsoup.connect(s).timeout(10*1000).get();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 int x=2;
		
		try {
			Element content = (Element) doc.getElementById("view"); 
	
			Elements links = content.getElementsByTag("a");
				for (Element link : links) {
					String linkText = link.text();
					if(linkText.compareTo("comments powered by Disqus.")==0){
							break;											}
		//System.out.println(linkText);
						rows[x]=linkText; 
						x++;}
		}
		catch(Exception e){System.out.println("No Adress Found");}
		}
		

public String[] returnsstring(){
		return rows;}
	
	
	
}
