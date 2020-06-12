import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char prev='!';
        int count=0;
        boolean flag= false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==prev){
                count++;
            }else{
                prev=s.charAt(i);
                count=1;
            }
            if(count==7){
                flag= true;
                break;
                
            }

        }
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");

        sc.close();
    }
}