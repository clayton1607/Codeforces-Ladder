import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total=0;
        int even=0;
        int odd=0;
        for(int i=0; i<n;i++){
            int x=sc.nextInt();
            if(x%2==0)
                even++;
            else
                odd++;
            total+= x;
        }
        //System.out.println(even+" "+odd);
        if(total%2== 0){
            System.out.println(even);
        }
        else{
            System.out.println(odd);
        }
        sc.close();
    }
}