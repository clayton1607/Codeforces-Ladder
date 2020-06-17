import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean lucky=false;
        for(int j=4;j<=n;j++){    
            String s= Integer.toString(j);
            boolean flag= false;
            //System.out.println(s);
            for(int i=0;i<s.length();i++){
                //System.err.println();
                if(s.charAt(i)=='4' || s.charAt(i)=='7' )
                    continue;
                else
                    flag=true;
            }
            if(!flag && n%j==0){
                System.out.println("YES");
                lucky=true;
                break;
            }
        }
        if(!lucky)
            System.out.println("NO");
        sc.close();
    }
}