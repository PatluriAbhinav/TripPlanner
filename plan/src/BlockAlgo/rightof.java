package BlockAlgo;

import java.util.List;

public class rightof {
	boolean ballon;
	int g;
	int next;
	public rightof(int g,MyList<int[]> mylist){
		this.g=g;
		
		
		List<int[]> hello= mylist.getcolumn(g);
		List<int[]> fuck=mylist.alter(hello, +1);
	   
		ballon= mylist.dead(fuck);
		next= mylist.getnext(fuck);
		
		
		
		
	}

public boolean has(){
	return ballon;
	
}
public int next(){
	
	return next;
	
}
}
