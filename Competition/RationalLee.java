import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer; 
public class RationalLee {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t!=0){
            String[] temp= br.readLine().split(" ");
            int n = Integer.parseInt(temp[0]);
            int k = Integer.parseInt(temp[1]);
            int[]  arr = new int[n];
            temp= br.readLine().split(" ");
            for(int i=0;i<n;i++)
                arr[i]= Integer.parseInt(temp[i]);
            Arrays.sort(arr);
            int minPointer=0;
            int maxPointer=n-1;
           
            temp= br.readLine().split(" ");
            int min=0;
            int max=0;
            long total=0;
            for(int i=0;i<k;i++){
                int x= Integer.parseInt(temp[i]);
                //System.out.println(x);
                if(x==1){
                    total=total+arr[maxPointer]*2;
                    maxPointer--;
                    //System.out.println("Hello "+total+ " "+ maxPointer+" "+minPointer);
                    continue;
                }
                else{
                    total+=arr[maxPointer];
                    total+=arr[minPointer];
                    if(x%2==0){
                        maxPointer-= x/2;
                        minPointer+= x/2;
                    }
                    else{
                        x--;
                        maxPointer-= x/2;
                        minPointer+= x/2;
                        if(maxPointer == minPointer){
                            minPointer++;
                        }
                        else{
                            int a= arr[maxPointer-1] - arr[maxPointer-2];
                            int b =arr[minPointer+1] - arr[minPointer+2];
                            if(a >= b){
                                minPointer++;
                            }
                            else{
                                maxPointer--;
                            }
                            }
                    }
                    //System.out.println(total+ " "+ maxPointer+" "+minPointer);
                }
            }
            System.out.println(total);
            t--;
        }
    }
}