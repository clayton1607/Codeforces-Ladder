import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class ZeroRemainderArray {
   public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        while(t!=0){
            String temp[] = br.readLine().split(" ");
            int n= Integer.parseInt(temp[0]);
            int k= Integer.parseInt(temp[1]);
            String tem[] =br.readLine().split(" ");
            HashSet<Integer> hs = new HashSet<>();
            int max=0;
            int rem=0;
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                int x = Integer.parseInt(tem[i]);
                //System.out.println(x+" "+ k +" "+ Math.ceil(x/k));
                if(x%k ==0)
                    arr[i]=x;
                else{
                    int div= (((int)(x/k)+1)*k)- x;
                    arr[i]=div;
                }
            }
            //System.out.println(arr);
            // for(int i=0;i<n;i++)
            //     System.out.println(arr[i]);
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                rem=arr[i]%k;
                if(rem ==0)
                    continue;
                else if(hs.contains(rem)){
                    int x =rem+k;
                    while(hs.contains(x))
                        x=x+k;
                    max= Math.max(x, max);
                    hs.add(x);
                }
                else{
                    max= Math.max(rem, max);
                    hs.add(rem);
                }
            }
            if(hs.size()==0)
                System.out.println(0);
            else
                System.out.println(max+1);
            //System.out.println(hs);
            
            t--;
        }
        
   }
}