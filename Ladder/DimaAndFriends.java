import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class DimaAndFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fingers=0;
        for(int i=0;i<n;i++)
            fingers+=sc.nextInt();
        System.out.println(getFingerValue(n+1, fingers));
        
    }
    public static int getFingerValue(int n, int fingers){
        int ptr= fingers%n;
        // System.out.println("Hello "+fingers+" "+n+" "+ptr);
        int count=0;
        if(ptr == 0)
            ptr= n;
        if((ptr + 1)%n != 1)
            count++;
        if((ptr + 2)%n != 1)
            count++;
        if((ptr + 3)%n != 1)
            count++;
        if((ptr + 4)%n != 1)
            count++;
        if((ptr + 5)%n != 1)
            count++;
        return count;
    }
}