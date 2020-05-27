import java.util.Scanner;

public class PanoramixPrediction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getPrime(n, m));
        
    }
    public static String getPrime(int n,int m){
        boolean[] primes = new boolean[50+1];
        for(int i=0; i<50; i++)
            primes[i]= true;
        for(int p= 2; p*p<= 50 ;p++){
            if(primes[p] == true){
                for(int i=p*p; i<=50;i+=p){
                    primes[i]=false;
                }
            }
        }

        
        for(int i=n+1; i<=50; i++){
            if(primes[i]==true){
                //System.out.println(i+" "+m);
                if(i==m)
                    return "YES";
                else
                    return "NO";
            }
        }
        return "NO";
    }
}