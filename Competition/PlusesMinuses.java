import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 


public class PlusesMinuses  {
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
        while(n!=0){
            long res=0;
            int pos=0;

            String temp= br.readLine();
            for(int i=0;i<Integer.MAX_VALUE;i++){
                int cur= 0;
                //System.out.println("Hello");
                boolean ok= true;
                //System.out.println("Hello"+ res+ " "+cur);
                res+=pos; 
                for(int j=pos;j<temp.length();j++){
                    //System.out.println("HelloTY    "+ res);
                    res++;
                    if(temp.charAt(j)=='+')
                        cur++;
                    else
                        cur--;
                    //System.out.println("Hello"+ res);
                    if(cur<0){
                        ok=false;
                        pos=j+1;
                        break;
                    }
                }
                if(ok)
                    break;
            }
            System.out.println(res);
            n--;
        }
    }
}