import java.util.Scanner;

public class PresentLena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=1;
        for(int i=n;i>=0;i--){
            int x= i;
            for(int j=0;j<2*x;j++){
                System.out.print(" ");
            }
            if(i==n){
                System.out.println("0");
            }
            else{
                //System.out.println("Hello");
                x=0;
                while(x!=temp){
                    System.out.print(x+" ");
                    x++;
                }
                while(x!=0){
                    System.out.print(x+" ");
                    x--;
                }
                temp++;
                System.out.println("0");
            }

        }
        temp=n-1;
        for(int i=1;i<=n;i++){
            int x= i;
            for(int j=0;j<2*x;j++){
                System.out.print(" ");
            }
            if(i==n){
                System.out.println("0");
            }
            else{
                //System.out.println("Hello");
                x=0;
                while(x!=temp){
                    System.out.print(x+" ");
                    x++;
                }
                while(x!=0){
                    System.out.print(x+" ");
                    x--;
                }
                temp--;
                System.out.println("0");
            }

        }
        sc.close();
    }
}