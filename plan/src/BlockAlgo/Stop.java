package BlockAlgo;

import java.io.IOException;
import java.util.*;

public class Stop {
 int t;
 Set<Integer> set;
 MyList<int[]> mylist;
	public Stop(int s,MyList<int[]> mylist,Set<Integer> set){
	this.mylist=mylist;
		t=s;}
	
	
	
	
	public String getblock() throws IOException {
		
		return (new Left("",t,mylist)).getleft()+(new getName(t)).returnName()+(new Right(t,"",mylist)).getright();
		
	} 
	
}
