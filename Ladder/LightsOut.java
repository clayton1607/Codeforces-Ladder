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
            
                    if((i+1)<3){
                            if(lights[i+1][j]==1)
                                lights[i+1][j]=0;
                            else    
                                lights[i+1][j]=1;
        
                        }
                    
                    if((i-1)>=0){
                        if(lights[i-1][j]==1)
                            lights[i-1][j]=0;
                        else    
                            lights[i-1][j]=1;
    
                    }
                        
                    

                    if((j-1)>=0){
                        if(lights[i][j-1]==1)
                            lights[i][j-1]=0;
                        else    
                            lights[i][j-1]=1;
    
                    }
                    
                    if((j+1)<3){
                        if(lights[i][j+1]==1)
                            lights[i][j+1]=0;
                        else    
                            lights[i][j+1]=1;
    
                    }
                }
            }
        }
        return lights;
    }
}