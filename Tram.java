import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int total = 0;
        int entry=0;
        int exit=0;
        int max=0;
        for(int i=0;i<n;i++){
            exit = sc.nextInt();
            total-=exit;
            System.out.println("total "+total);
            max=Math.max(total, max);
            entry = sc.nextInt();
            total+=entry;
            System.out.println("total "+total);
            max=Math.max(total, max);
        }
        System.out.println(max);
        sc.close();     
    }
}