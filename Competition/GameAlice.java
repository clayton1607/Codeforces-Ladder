import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 


public class GameAlice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        while(n!=0){
            n--;
            String temp = br.readLine();
            int zero=0;
            int one =0;
            for(int i=0;i<temp.length();i++){
                if(temp.charAt(i)=='0')
                    zero++;
                else
                    one++;
            }
            if(zero>= one){
                if(one%2!=0)
                    System.out.println("DA");
                else
                    System.out.println("NET");
            }
            else{
                if(zero%2!=0)
                    System.out.println("DA");
                else
                    System.out.println("NET");
            }

        }
    }
}