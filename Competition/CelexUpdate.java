import java.util.Scanner;

public class CelexUpdate { 
  
    private static int count=0;
    static void numberOfPaths(int x1, int y1,int x2,int y2) 
    {
        System.out.println(count+" "+x1+" "+y1+" ");
        if(x1==x2 && y1==y2)
            return 1; 
        if(x1+1 <= x2)
            count+=numberOfPaths(x1+1, y1, x2, y2);
        if (y1+1 <= y2)
            count+=numberOfPaths(x1, y1+1, x2, y2);
    } 
  
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            t--;
            System.out.println(numberOfPaths(x1, y1,x2,y2)); 
        }
        
    } 
} 