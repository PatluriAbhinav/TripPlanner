package MMTS;

import java.io.IOException;

public class Hyderabad {
	
	public static void main(String args[]) throws IOException{
	
		String HyderabadTrains[]={"LingampallytoFalaknuma.htm","LingampallyToHyderabad.htm","FalaknumaToHyderabad.htm","SecunderabadToHyderabad.htm",
				"SecunderabadToManoharabad.htm","SecunderabadToFalaknuma.htm","SecunderabadToLingampally.htm","SecunderabadToUmdanagar.htm","SecunderabadToBolaram.htm",
				"SecunderabadToMedchal.htm","UmdanagarToFalaknuma.htm","BolaramToFalaknuma.htm"};
		
	//	ParseData par= new ParseData("ChennaiBeachToVelacherry.htm");
		
	ChennaiParse par= new ChennaiParse("ChennaiBeachToVelacherry.htm");	
		
	}

}
