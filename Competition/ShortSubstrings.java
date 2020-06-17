import java.util.Scanner;

public class ShortSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            String a = sc.next();
            System.out.println(shortS(a));
            n--;
        }
        sc.close();
    }
    public static String shortS(String a){
        if(a.length()>3){
            StringBuffer sb= new StringBuffer();
            for(int i=0;i<a.length();i+=2){
                if(i==0){
                    sb.append(a.charAt(i));
                    sb.append(a.charAt(i+1));
                }else{
                    sb.append(a.charAt(i+1));
                }
            }
            return sb.toString();
        }
        else
            return a;
    }
}