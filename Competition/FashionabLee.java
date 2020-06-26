import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
public class FashionabLee {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        while(n!=0){
            int k = Integer.parseInt(br.readLine());
            if(k%4 ==0){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
            n--;
        }
    }
}