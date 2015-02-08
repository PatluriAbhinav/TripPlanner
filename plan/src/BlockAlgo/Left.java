package BlockAlgo;

import java.io.IOException;

public class Left {
	String p;
	int q;
	MyList<int[]> mylist;
	public Left(String p,int q,MyList<int[]> mylist){
		this.p= p;
		this.q=q;
		this.mylist=mylist;
		}
	
	public String getleft() throws IOException{
		
		if((new leftof(q,mylist)).has()){
			int str= (new leftof(q,mylist)).next();
				if(str!=0){
						if((new rightof(str,mylist)).has()){
								return (new Left(((new getName(str)).returnName()).concat("@@").concat(p),str,mylist)).getleft();}
						else {return p;}}
				else{return p;}}
				else {return p;}
	}
	
	 public String toString() {
	        return String.format(p);
	    }
	
	
}
