import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
  

public class MaximumGCD{
    public static void main(String[] args)throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken()); 
        while(t!=0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); 
            System.out.println((int)Math.floor(n/2));
            t--;
        }
    }
}