import java.util.Scanner;

public class LightsOut {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[][] arr= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int x= sc.nextInt();
                if(x%2 == 0)
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }
        int[][] ans=getLightsOn(arr);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] getLightsOn(int[][] arr){
        int[][] lights= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                lights[i][j]=1;
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j] == 1){
                    if(lights[i][j]==1)
                        lights[i][j]=0;
                    else    
                        lights[i][j]=1;
                    for(int k=0;k<3;k++){
                        if(j==k)
                            continue;
                        if(lights[i][k] == 1)
                            lights[i][k]=0;
                        else    
                            lights[i][k]=1;
                    }

                    for(int k=0;k<3;k++){
                        if(i==k)
                            continue;
                        if(lights[k][j] == 1)
                            lights[k][j]=0;
                        else    
                            lights[k][j]=1;
                    }
            
                }
            }
        }
        return lights;
    }
}