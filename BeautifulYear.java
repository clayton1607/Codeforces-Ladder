import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(getYear(x));
        sc.close();
    }
    public static int getYear(int x){
        x++;
        while(true){
            HashSet<Integer> hs = new HashSet<>();
            int temp=x;
            int count=0;
            while(temp!=0){
                hs.add(temp%10);
                temp/=10;
                count++;
            }
            if(hs.size() == count)
                break;
            else
                hs.clear();
            x++;
        }
        return x;
    }
}