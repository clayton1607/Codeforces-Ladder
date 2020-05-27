import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x=0;
        int y=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(sc.nextInt() ==1){
                    x=i;
                    y=j;
                }
            }
        }
        // System.out.println(x+ " "+y);
        System.out.println(getBeautiful(x,y));
        sc.close();
    }
    public static int getBeautiful(int x,int y){
        int total=0;
        total=Math.abs(3-x)+ Math.abs(3-y);
        return total;
    }
}