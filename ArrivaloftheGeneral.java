import java.util.Scanner;

public class ArrivaloftheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(getSwaps(n,arr));
        
    }
    public static int getSwaps(int n,int[] arr){
        int swaps=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxPos= 0;
        int minPos= 0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
                maxPos=i;
            }
        }
       
        for(int i=maxPos;i>0;i--){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
            swaps++;
        }
        // for(int i=0;i<n;i++)
        //     System.out.print(arr[i]+ " ");
        // System.out.println();

        for(int i=n-1;i>=0;i--){
            if(min>arr[i]){
                min=arr[i];
                minPos=i;
            }
        }
        

        for(int i=minPos;i<n-1;i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            swaps++;
        }
        // for(int i=0;i<n;i++)
        //     System.out.print(arr[i]+ " ");
        // System.out.println();
        return swaps;
    }
}