import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            t--;
            int n= sc.nextInt();
            int evenParity=0;
            int oddParity=0;
            for(int i=0;i<n;i++){
                int x =sc.nextInt();
                if(x%2 != i%2){
                    if(i%2==0)
                        evenParity++;
                    else
                        oddParity++;
                }
            }
            if(evenParity == oddParity)
                System.out.println(evenParity);
            else
                System.out.println("-1");
        }
        sc.close();
    }
}