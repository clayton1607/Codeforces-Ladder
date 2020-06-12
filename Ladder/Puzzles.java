import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] arr = new int[p];
        for(int i=0;i<p;i++){
            arr[i]=sc.nextInt();
        }
        int lowKey=0;
        int highKey=n-1;
        int lowValue=arr[lowKey];
        int highValue=arr[highKey];
        int diff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<p-n+1;i++){
            lowValue=arr[lowKey];
            highValue=arr[highKey];
            //System.out.println(i+" "+lowKey+" "+highKey);
            int temp=highValue-lowValue;
            lowKey++;
            highKey++;
            diff=Math.min(temp, diff);
        }
        System.out.println(diff);
    }
}