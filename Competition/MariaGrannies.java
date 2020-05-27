import java.util.Arrays;
import java.util.Scanner;

public class MariaGrannies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            Arrays.sort(arr);
            System.out.println(getGrannies(n,arr));
            t--;
        }
        sc.close();
    }
    public static int getGrannies(int n, int[] arr){
        int grannies= 1;
        int xtotal=0;
        for(int i=0;i<n;i++){
            int x= arr[i];
            //System.out.println(xtotal+" "+grannies+" "+arr[i]);
            while(i<n && arr[i]==x ){
                xtotal++;
                i++;
            }
            if(x <= (xtotal+grannies-1)){
                grannies+=xtotal;
                xtotal=0;
            }
            i--;
        }
        return grannies;
    }
}