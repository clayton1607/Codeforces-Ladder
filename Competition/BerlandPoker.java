import java.util.Scanner;

public class BerlandPoker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            System.out.println(getPoints(n, m, k));
            t--;
        }
    }
    public static int getPoints(int n,int j,int k){
        int each= n/k;
        if(j<=each)
            return j;
        else{
            j=j-each;
            int eachOne= j/(k-1);
            int y= eachOne;
            if(j%(k-1)!=0)
                y++;
            //System.out.println(y+" "+j);
            return each-y;

        }
    }
}