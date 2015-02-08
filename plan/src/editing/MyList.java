package editing;
import java.util.*;

public class MyList<T> extends AbstractList<T>{
	
	private List<T> items;
	
	public MyList(List<T> items){
this.items= items;	
	}
	
 public boolean check(T item){
	for(T all:items){
		if(all instanceof int[]){
		
			int[] arr1 = (int[]) all;
			int[] arr2= (int[]) item;
			int x=0;
			for (int k=0;k< arr1.length;k++){
				
				if(arr1[k]==arr2[k]){x++;}
				
			}
			if(x==arr2.length){return true;}
			
		}
		else{
		if(all.equals(item)){
		return true;}
		}
	}
	return false;
	
 }
 
	
	
	public T get(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	 List<T> returnlist= new ArrayList<T>();
		public List<T> getcolumn(int x){
			for(T arr:items){
			if(arr instanceof int[]){
				int [] array= (int[])arr;
				if(array[0]==x && array[2]!=0){
					returnlist.add(arr);
					
				}
				
				
			}}
			
			return returnlist;
			
			
		}

public List<T> alter(List<T> item, int x){
	List<T> alterlist= new ArrayList<T>();
	
	
	
	return alterlist;
	
	
	
}

}
