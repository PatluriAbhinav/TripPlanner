/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AbhinavPatluri
 */
import java.util.*;
import java.io.*;




public class BusNumber {
    
   void  BusNumber(){
   System.out.println("Reading Data from Excel Sheet");
  // Document doc = Jsoup.parse(input, "UTF-8", "http://busindia.com/");


   try {
   FileInputStream file= null;
   file= new FileInputStream("C:\\Users\\AbhinavPatluri\\Desktop\\HyderabadBuses\\Uppal Depo.xlsx");
   }
   catch(FileNotFoundException e){ System.out.println("File Not Found");}
    
}}
