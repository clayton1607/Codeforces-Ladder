import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(isEquilibrium(arr, n));

    }
    public static String isEquilibrium(int[][] arr,int n){
        int total=0;
        for(int i=0;i<3;i++){
            total=0;
            for(int j=0;j<n;j++){
                total+=arr[j][i];
            }
            if(total!=0)
                return "NO";
        }
        return "YES";
    }
}