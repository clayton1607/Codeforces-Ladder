import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class EffectiveApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // /int[] arr= new int[n];
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        for(int i=0;i<n;i++){
            int x= sc.nextInt();
            hm.put(x,i+1);
            hm2.put(x,n-i);
        }
            
        int m = sc.nextInt();
        int[] queries= new int[m];
        for(int i=0;i<m;i++)
            queries[i]= sc.nextInt();
        long[] ans = getComparisons(n, m, hm,hm2, queries);
        for(int i=0;i<2;i++){
            System.out.print(ans[i]+" ");
        }
        
    }
    public static long[] getComparisons(int n,int m,HashMap<Integer,Integer> hm,HashMap<Integer,Integer> hm2,int[] queries){
        long countA=0;
        long countB=0;
        
        for(int j= 0; j<m;j++){
            countA+=hm.get(queries[j]);
            countB+=hm2.get(queries[j]);
        }
        long[] ans = new long[]{countA,countB};
        return ans;
    }       
}