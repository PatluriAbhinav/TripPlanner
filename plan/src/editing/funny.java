package editing;

import java.util.*;

public class funny {

	public static void main(String args[]){
		List<int[]> ram= new ArrayList<int[]>();
		int check[]={1,2,5};
		int check2[]={1,4,0};
		int check3[]={2,4,5};
		ram.add(check);
		ram.add(check2);
		ram.add(check3);
		MyList<int[]> mine= new MyList<int[]>(ram);
		
		int luck[]={1,4,5};
		List<int[]> newone= mine.getcolumn(1);
		for(int[] first: newone){
		System.out.println(first[0]+"@@"+first[1]+"@@"+first[2]);
		}
		
		
		
		
		
	}
}
