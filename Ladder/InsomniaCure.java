import java.util.Scanner;

public class InsomniaCure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dragons= new int[5];
        for(int i=0;i<5;i++)
            dragons[i] = sc.nextInt();
        boolean[] arr = new boolean[dragons[4]+1];
        for(int i=0;i<=dragons[4];i++)
            arr[i]=true;
        
        for(int i=0;i<dragons.length-1;i++){
            if(dragons[i]>dragons[4])
                break;
            if(arr[dragons[i]]== true){
                for(int j= dragons[i]; j<=dragons[4];j+=dragons[i])
                    arr[j]=false;
            }
        }
        int count=0;
        for(int i=1;i<=dragons[4];i++){
            if(arr[i]==false)
                count++;
            //System.out.println(arr[i]);
        }
        System.out.println(count);
        sc.close();
    }
}