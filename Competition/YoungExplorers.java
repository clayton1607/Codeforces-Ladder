import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class YoungExplorers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n= sc.nextInt();
            int[] a =  new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int count=0;
            ArrayList<Integer> groups = new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                if(a[i] == 1)
                    count++;
                else{
                    groups.add(a[i]);
                    if(groups.size() == a[i]){
                        count++;
                        groups.clear();
                    }
                    
                }
            }
            
            System.out.println(count);
            t--;
        }
        sc.close();
    }
}