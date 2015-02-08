package BlockAlgo;

import java.util.List;

public class leftof {
	boolean ballon;
	int g;
	int next;
	public leftof(int g,MyList<int[]> mylist){
		this.g=g;
		
		
		List<int[]> hello= mylist.getcolumn(g);
		List<int[]> fuck=mylist.alter(hello, -1);
	   
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
