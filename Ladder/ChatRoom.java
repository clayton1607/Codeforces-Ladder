import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = "hello";
        int k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==p.charAt(k)){
                //System.out.println(i);
                k++;
                if(k==p.length())
                    break;
            }
        }
        if(k==p.length())
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}