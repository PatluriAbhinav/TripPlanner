package BlockAlgo;
import java.io.IOException;
import java.util.*;

public class Right {
	String p;
	int q;
	String r;
	MyList<int[]> mylist;
	public Right(int q,String p,MyList<int[]> mylist){
		this.p= p;
		this.q=q;
		this.mylist=mylist;
		
		
		
	}
	
	public String getright() throws IOException{
		
		if((new rightof(q,mylist)).has()){
			int str= (new rightof(q,mylist)).next();
			if(str!=0){
				
			 if((new leftof(str,mylist)).has()){
				 
				 return (new Right(str,(p.concat("@@").concat((new getName(str)).returnName())),mylist)).getright();}
			else {r=p; return p;}
		}
		else return p;
	}
		else {r=p; return p;}
	}
	 public String toString() {
	        return String.format("ram");
	    }
	
	
}
