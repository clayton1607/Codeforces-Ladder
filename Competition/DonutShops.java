import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 

public class DonutShops {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        while(n!=0){
            String temp[] = br.readLine().split(" ");
            int a= Integer.parseInt(temp[0]);
            int b= Integer.parseInt(temp[1]);
            int c= Integer.parseInt(temp[2]);
            if(a<c){
                System.out.print("1 ");
            }
            else{
                System.out.print("-1 ");
            }
            double x = (c*1.0)/(b*1.0);
            if(x< a){
                System.out.println(b);
            }
            else{
                System.out.println("-1");
            }
            n--;
        }
    }
}