import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner newsc = new Scanner(System.in);
        
        int p = newsc.nextInt();
        
        String st;
        
        for(int i=0;i<p;i++){
      
            st=newsc.next();
        for(int n=0;n<st.length();n++){ 
        
            if(n%2==0){
                System.out.print(st.charAt(n)); 
            }
        }
        System.out.print(" ");
        
        for(int n=0;n<st.length();n++){
        
            if(n%2==1){ 
                    System.out.print(st.charAt(n)); 
            }
        }
         System.out.println(" ");
        }
    }
}
