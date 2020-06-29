import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.StringTokenizer;

public class MoveBrackets {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int t = Integer.parseInt(st.nextToken());
      while(t!=0){
          int n = Integer.parseInt(br.readLine());
          String s = br.readLine();
          int countOpen=0;
          int count=0;
          for(int i=0;i<n;i++){
              if(s.charAt(i)=='(')
                countOpen++;
            else{
                if(countOpen>0){
                    count++;
                    countOpen--;
                }
            }
            
          }
          n=(n/2)-count;
          System.out.println(n);
        t--;
      }
   }
}