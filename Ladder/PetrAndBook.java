import java.util.Scanner;

public class PetrAndBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[7];
        for(int i=0;i<7;i++){
            arr[i]= sc.nextInt(); 
        }
        int i=0;
        while(n>0){
            n=n-arr[i];
            if(n<=0)
                break;
            i=(i+1)%7;
            //System.out.println(n);
        }
        System.out.println(i+1);
        sc.close();
    }
}