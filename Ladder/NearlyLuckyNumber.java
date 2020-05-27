import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextint();
        int lucky=0;
        while(x!=0){
            int temp= x%10;
            if(temp==7 || temp==4)
                lucky++;
            x/=10;
        }
        if(lucky==7 || lucky==4)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}