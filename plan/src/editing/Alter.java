package editing;

import java.util.*;
public class Alter {

	List<int[]> x,y;
	int z;
	public Alter( List<int[]> y, int z){
		this.y=y;
		this.z=z;
		
		
	}
	public List<int[]> returnlist(){
		List<int[]> t= new ArrayList<int[]>();
			
		for(int[] xyz: y){
				  int [] pk= new int[3];
				  pk[0]=xyz[0];
				  pk[1]=xyz[1];
				  pk[2]=xyz[2]+z;
					if(pk[2]!=0){
						t.add(pk);
					}}
			return t;
		
		
	}
	
}
