import java.util.HashSet;
import java.util.Scanner;

public class HorseShoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        int count=0;
        for(int i=0;i<4;i++){
            int x= sc.nextInt();
            if(hs.contains(x))
                count++;
            else
                hs.add(x);
        }
        System.out.println(count);
        sc.close();
    }
}