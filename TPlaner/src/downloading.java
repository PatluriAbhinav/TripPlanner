import java.net.*;
import java.io.*;
import java.util.*;


public class downloading{
int x=100;
    downloading(String num) throws Exception{
        
        String s= "http://www.hyderabadbusroutes.com/index.php?service=BUSINFO&busno=";
               
        String str=String.valueOf(num);
        s=s.concat(num);
        
        System.out.println(s);
        x =s.compareTo("http://www.hyderabadbusroutes.com/index.php?service=BUSINFO&busno=15");
        
        URL oracle = new URL(s);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\AbhinavPatluri\\Desktop\\HyderabadBuses\\"+num+".html"));

        String inputLine;
        while ((inputLine = in.readLine()) != null){
            try{
                writer.write(inputLine);
            }
            catch(IOException e){
                e.printStackTrace();
                return;
            }
        }
        in.close();
        writer.close();
 
        }
       
        
    }
    

