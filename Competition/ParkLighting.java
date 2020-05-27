import java.util.Scanner;

public class ParkLighting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t!=0){
            double a =sc.nextInt();
            double b =sc.nextInt();

            int x = (int)Math.ceil((double)(1.0*a*b)/(double)2.0);
            System.out.println(x);
            t--;
        }
        sc.close();
    }
}