import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Airport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] arr = new int[p];
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            int x= sc.nextInt();
            arr[i]=x;
            if(tm.containsKey(x)){
                tm.put(x, tm.get(x)+1);
            }
            else{
                tm.put(x, 1);
            }
        }
        Arrays.sort(arr);
        sc.close();
        int min=0;
        int max=0;
        int i=0;
        int j=0;
        while(i<n){
            int x=arr[j];
            while(x!=0 && i<n){
                min+=x;
                x--;
                i++;
            }
            j++;
            
        }
        i=0;
        j=p-1;
        int k=j-1;
        while(i<n){
            if(j==0)
                k=p-1;
            else
                k=j-1;
            
            if(j+1 < p && arr[j]<arr[j+1] ){
                j+=1;
            }
            else if(arr[j]>=arr[k]){
                System.out.println(j+" "+k+" "+arr[j]);
                max+=arr[j];
                arr[j]-=1;
                i++;
            }
            else{
                j=k;
            }

        }   
        for(int q=0;q<p;q++)
            System.out.print(arr[q]+" ");
        System.out.println();
        System.out.println(max+ " "+ min);
    }
}