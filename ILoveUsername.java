import java.util.Scanner;

public class ILoveUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min= 0;
        int max=0;
        int count=0;
        for(int i=0;i<n;i++){
            int x= sc.nextInt();
            if(i==0){
                min=x;
                max=x;
            }
            else{
                if(x<min){
                    count++;
                    min=x;
                }
                if(x>max){
                    count++;
                    max=x;
                }
            }
        }
        System.out.println(count);
        sc.close();

    }

}