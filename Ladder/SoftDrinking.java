import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl= sc.nextInt();
        int np= sc.nextInt();
        int toast1= (int)(k*l)/nl;
        int toast2= (int)(c*d);
        int toast3= (int)(p/np);
        int min = Math.min(toast1,toast2);
        min=Math.min(min, toast3);
        min=(int)min/n;
        System.out.println(min);
    }
}