import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.StringTokenizer;

public class RequiredRemainder {
   public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        while(t!=0){
            String temp[] = br.readLine().split(" ");
            int x=Integer.parseInt(temp[0]);
            int y=Integer.parseInt(temp[1]);
            int n=Integer.parseInt(temp[2]);
            int rem=n%x;

            if(rem == y)
                System.out.println(n);
            else if(rem > y)
                System.out.println(n-(rem-y));
            else 
                System.out.println((n-(rem)-(x-y)));
            t--;
      }
   }
}