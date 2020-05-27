import java.util.Scanner;

public class SequenceWithDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int a= sc.nextint();
            int k= sc.nextint()-1;
            a= getAns(a, k);
            System.out.println(a);
            t--;
        }
        sc.close();
    }
    public static int getAns(int a,int k){
        int minDigits=Integer.MAX_VALUE;
        int maxDigits=Integer.MIN_VALUE;
        while(k!=0){
            minDigits=Integer.MAX_VALUE;
            maxDigits=Integer.MIN_VALUE;
            int temp= a;
            while(temp!=0){
                if(minDigits> temp%10)
                    minDigits=temp%10;
                if(maxDigits< temp%10)
                    maxDigits=temp%10;
                temp/=10;
            }
                
            if(minDigits == 0)
                break;
            a=a+ minDigits*maxDigits;
            k--;
        }
        return a;
    }
}