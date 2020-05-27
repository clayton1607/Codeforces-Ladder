import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total=0;
        for(int i=0;i<n;i++)
            total+=(sc.nextInt()*1.0)/100.0;
        System.out.format("%.12f",getVolume(total,n));
        sc.close();
    }
    public static double getVolume(double percent,double n){
        double x =  ((percent*1.0)*100.0)/(n*1.0);
        return x;

    }
}