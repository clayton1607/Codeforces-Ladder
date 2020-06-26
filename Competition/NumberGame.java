import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
  

public class NumberGame{
    public static void main(String[] args)throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken()); 
        while(t!=0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); 
            System.out.println(numberGame(n));
            t--;
        }
        
    }
    public static String numberGame(int n){
        // if(n == 1 || n==4 )
        //     return "FastestFinger";
        // else if(n==2 || n==5 || n==3)
        //     return "Ashishgup";
        if(n%3 ==0){
            int x = n/3;
            if(x%3 == 1)
                return "FastestFinger";
            else
                return "Ashishgup";            
        }
        else{
            int x = n%3;
            int y = (n-x)/3;
            if(y%3 == 1){
                if(x==1)
                    return "FastestFinger";
                else
                    return "Ashishgup";   
            }
            else{
                if(x==1)
                    return "FastestFinger";
                else 
                    return "Ashishgup"; 
            }
        }
    }
}