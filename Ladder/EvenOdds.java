import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n =sc.nextLong();
        long k = sc.nextLong();
        ArrayList<Long> arr =new ArrayList<>();
        long j=0;
        boolean flag=false;
        if(n%2 ==0){
            if(n/2 < k){
                k-=n/2;
                System.out.println(k*2);
            } 
            else{
                System.out.println( (k*2)-1);
            }
        }
        else{
            long x = (n/2) +1;
            if(x  < k){
                k-=x;
                System.out.println(k*2);
            }
            else{
                System.out.println( (k*2)-1);
            }
        }
        sc.close();
    }
}