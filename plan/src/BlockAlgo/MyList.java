package BlockAlgo;
import java.util.*;

public class MyList<T> {
	
	private List<T> items;
	private List<T> items1;
	
	public MyList(List<T> items){
this.items= items;	
this.items1=items;
	}
	public T get(int arg0) {return null;}
		
	public List<T> getback(){return items;}

 public boolean check(T item){
	for(T all:items){
		if(all instanceof int[]){
			int[] arr1 = (int[]) all;
			int[] arr2= (int[]) item;
			int x=0;
			for (int k=0;k< arr1.length;k++){if(arr1[k]==arr2[k]){x++;}}
			if(x==arr2.length){return true;}}
		else{
			if(all.equals(item)){return true;}}}
	return false;}
 
	public List<T> getcolumn(int x){
		List<T> finallist= new ArrayList<T>();
	for(T arr :items){
		if(arr instanceof int[]){
			
		int[] array= (int[])arr;
		
		
			if(array[1]==x && array[2]!=0){
				finallist.add(arr);}}}
		
		return finallist;
	}
	
public List<T> alter(List<T> item, int x){
	List<T> returnlist= new ArrayList<T>();
	for(T arr:item){
		if(arr instanceof int[]){
			int[] array= (int[])arr;
			int [] pk= new int[3];
			  pk[0]=array[0];
			  pk[1]=array[1];
			  pk[2]=array[2]+x;
				if(pk[2]!=0){
					returnlist.add((T)pk);
		}}}
		return returnlist;
	}


public boolean dead(List<T> item){
	int x=0;
	int y=0;
	int t=0;
	
	if(item.isEmpty()){return true;}
	else{
	for(T arr: items1){
	if(arr instanceof int[]){
		int[] array1=(int[])arr;
		List<T> newone=item;
		for(T arr2:newone){
		int[] array2=(int[])arr2;
        if(array2[0]==array1[0] && array2[2]==array1[2]){
        	if(x==0){
        		 y=array1[1]; t++;
        	}
        	else{
        		
        		if(y==array1[1]){t++;}
        	}
        	x++;
        }		
		}
	}}}
	
	if(t== item.size()){return true;}
	return false;
}


public int getnext(List<T> item){
	int x=0;
	int y=0;
	int t=0;
	
	if(item.isEmpty()){return 0;}
	else{
	for(T arr: items){
		if(arr instanceof int[]){
			int[] array1=(int[])arr;
			
			for(T arr2: item){
					int[] array2=(int[])arr2;
					
					if((array2[0]==array1[0]) && (array2[2]==array1[2])){
					
						if(x==0){y=array1[1]; t++;}	
						else{
							if(y==array1[1]){t++;}
							else{y=array1[1];}}
						x++;
        }}}}}
	
	if(t== item.size()){return y;}
	return 0;
	
}}
