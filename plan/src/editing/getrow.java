package editing;
import java.util.*;
public class getrow {
	List<int[]> r;
	int x;
	public getrow(List<int[]> r, int x){
		this.r=r;
		this.x=x;
		
		
		
		
	}
	
	public List<int[]> fuckbitch(){
		List<int[]> array= new ArrayList<int[]>();
		
		for(int[] arr : r){
		
			if(arr[1]==x && arr[2]!=0){
				array.add(arr);}}
		
		return array;
		
	}
	

}
