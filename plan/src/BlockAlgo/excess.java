package BlockAlgo;
import java.util.*;
import java.io.*;
public class excess {
Set<Integer> i;
String sasu[]= new String[100];
	public excess(Set<Integer> i, String pk)throws IOException{
		this.i=i;
		int x=0;
		StringTokenizer str=new StringTokenizer(pk,"@@"); 
				while (str.hasMoreTokens()){
			
					//System.out.println("I am a token of PK's love:"+str.nextToken());
					String token=str.nextToken();
					sasu[x]=token;
					System.out.println(token);
					i.remove(new GetNum(token).returnNum());
					x++;
				}
				
				
		
		
	}
	
	public Set<Integer> newset(){
		return i;
}
public String[] csvrow(){
	return sasu;
	
}	

}
