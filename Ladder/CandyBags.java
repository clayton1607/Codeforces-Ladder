import java.util.Scanner;

public class CandyBags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int low =1;
        int high =(int)Math.pow(n, 2);
        while(low<=high){
            System.out.println(low+" "+high);
            low++;
            high--;
        }
    }
}