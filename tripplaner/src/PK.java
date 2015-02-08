
import java.util.concurrent.TimeUnit;
public class PK{

public static void main(String args[]) throws Exception{
    String a[]= new String[20];
    a[0]="1";
    a[1]="2c";
    a[2]="3";
    a[3]="5";
    a[4]="8";
    a[5]="25";
    a[6]="7c";
    a[7]="1d";
    a[8]="2z";
    a[9]="55";
    for(int i=0;i<10;i++){
   Download ram = new Download(a[i]);
   try {
    TimeUnit.SECONDS.sleep(20);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    }
    
    


}
}