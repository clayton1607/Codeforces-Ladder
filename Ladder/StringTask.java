import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            char temp= s.charAt(i);   
            if(temp ==  'a' || temp == 'e' || temp =='i' || temp == 'o' || temp =='u' || temp == 'y' ||  temp ==  'A' || temp == 'E' || temp =='I' || temp == 'O' || temp =='U' || temp == 'Y'){}
            else{
                sb.append(".");
                temp=Character.toLowerCase(temp);
                sb.append(temp);
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}